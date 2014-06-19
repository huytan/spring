package com.musicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Artist")
public class Artist {
	@Id
	@Column(name = "artistId")
	private Long artistId;
	@Column(name = "name")
	private String name;

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

}
