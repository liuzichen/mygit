package com.hibernate.beans;

// Generated 2016-8-22 10:31:49 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Government generated by hbm2java
 */
public class Government implements java.io.Serializable {

	private Integer governmentId;
	private Government government;
	private String name;
	private String loginName;
	private String password;
	private String email;
	private String phone;
	private String contact;
	private Integer roleId;
	private Set governments = new HashSet(0);

	public Government() {
	}

	public Government(Government government, String name, String loginName,
			String password, String email, String phone, String contact,
			Integer roleId, Set governments) {
		this.government = government;
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.contact = contact;
		this.roleId = roleId;
		this.governments = governments;
	}

	public Integer getGovernmentId() {
		return this.governmentId;
	}

	public void setGovernmentId(Integer governmentId) {
		this.governmentId = governmentId;
	}

	public Government getGovernment() {
		return this.government;
	}

	public void setGovernment(Government government) {
		this.government = government;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Set getGovernments() {
		return this.governments;
	}

	public void setGovernments(Set governments) {
		this.governments = governments;
	}

}