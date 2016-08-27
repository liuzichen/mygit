package com.hibernate.beans;

// Generated 2016-8-26 21:54:22 by Hibernate Tools 3.4.0.CR1

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Makernews generated by hbm2java
 */
public class Makernews implements java.io.Serializable {

	private Integer makerNewsId;
	private String title;
	private Date time;
	private String type;
	private String description;
	private byte[] fujian;
	private String fujianType;
	private String fujianName;

	public Makernews() {
	}

	public Makernews(String title, Date time, String type, String description) {
		this.title = title;
		this.time = time;
		this.type = type;
		this.description = description;
	}

	public Makernews(String title, Date time, String type, String description,
			byte[] fujian, String fujianType, String fujianName) {
		this.title = title;
		this.time = time;
		this.type = type;
		this.description = description;
		this.fujian = fujian;
		this.fujianType = fujianType;
		this.fujianName = fujianName;
	}

	public Integer getMakerNewsId() {
		return this.makerNewsId;
	}

	public void setMakerNewsId(Integer makerNewsId) {
		this.makerNewsId = makerNewsId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getTime() {
		return this.time;
	}
	


	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getFujian() {
		return this.fujian;
	}

	public void setFujian(byte[] fujian) {
		this.fujian = fujian;
	}

	public String getFujianType() {
		return this.fujianType;
	}

	public void setFujianType(String fujianType) {
		this.fujianType = fujianType;
	}

	public String getFujianName() {
		return this.fujianName;
	}

	public void setFujianName(String fujianName) {
		this.fujianName = fujianName;
	}

}
