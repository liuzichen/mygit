package com.base.hibernate.beans;

// Generated 2016-8-26 21:53:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Enum generated by hbm2java
 */
public class Enum implements java.io.Serializable {

	private int id;
	private String enum_;
	private String txt;
	private Date date;

	public Enum() {
	}

	public Enum(int id, String enum_) {
		this.id = id;
		this.enum_ = enum_;
	}

	public Enum(int id, String enum_, String txt, Date date) {
		this.id = id;
		this.enum_ = enum_;
		this.txt = txt;
		this.date = date;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnum_() {
		return this.enum_;
	}

	public void setEnum_(String enum_) {
		this.enum_ = enum_;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
