package org.spring.mvc.xml.testbean;

import org.spingmvc.model.IWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class MySpringBeanWithDependency {
	private IWriter writer;

	public void setWriter(IWriter writer) {
		this.writer = writer;
	}

	public void run() {
		String s = "This is my test";
		writer.writer(s);
	}
}
