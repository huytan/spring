package org.springmvc.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;
import org.springmvc.model.Brand;
import org.springmvc.model.Car;
import org.springmvc.service.BrandManager;
import org.springmvc.service.CarManager;

public class CarNewController extends SimpleFormController {
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		Car defaultCar = new Car();
		defaultCar.setModel("new model");
		defaultCar.setPrice(new BigDecimal(15000));
		return defaultCar;
	}

	private BrandManager brandManager;
	private CarManager carManager;

	public CarManager getCarManager() {
		return carManager;
	}

	public void setCarManager(CarManager carManager) {
		this.carManager = carManager;
	}

	public BrandManager getBrandManager() {
		return brandManager;
	}

	public void setBrandManager(BrandManager brandManager) {
		this.brandManager = brandManager;
	}

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<Object, Object> dataMap = new HashMap<Object, Object>();

		dataMap.put("brandList", brandManager.getBrandList());
		return dataMap;
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.setDisallowedFields(new String[] { "brand" });

		Car car = (Car) binder.getTarget();

		/*
		 * // set car's brand from request parameter brand id BrandManager
		 * brandManager = new BrandManager();
		 */
		Long brandId = null;
		try {
			brandId = Long.parseLong(request.getParameter("brand"));
		} catch (Exception e) {
		}
		if (brandId != null) {
			Brand brand = brandManager.getBrandById(brandId);
			car.setBrand(brand);

		}
	}

	@Override
	public ModelAndView onSubmit(Object command) throws ServletException {
		
		carManager.create((Car) command);

		return new ModelAndView(new RedirectView(getSuccessView()));
	}
}
