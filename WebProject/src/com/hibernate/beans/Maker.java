package com.hibernate.beans;

// Generated 2016-8-27 22:34:23 by Hibernate Tools 3.4.0.CR1

/**
 * Maker generated by hbm2java
 */
public class Maker implements java.io.Serializable {

	private Integer makerId;
	private String loginName;
	private String password;
	private String email;
	private String contact;
	private String phone;
	private String team;
	private String address;
	private String teamIntro;
	private String achievement;
	private Integer roleId;
	private String field1;
	private String field2;

	public Maker() {
	}

	public Maker(String loginName, String password, String email,
			String contact, String phone, String team, String address,
			String teamIntro, String achievement, Integer roleId,
			String field1, String field2) {
		this.loginName = loginName;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.phone = phone;
		this.team = team;
		this.address = address;
		this.teamIntro = teamIntro;
		this.achievement = achievement;
		this.roleId = roleId;
		this.field1 = field1;
		this.field2 = field2;
	}

	public Integer getMakerId() {
		return this.makerId;
	}

	public void setMakerId(Integer makerId) {
		this.makerId = makerId;
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

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTeamIntro() {
		return this.teamIntro;
	}

	public void setTeamIntro(String teamIntro) {
		this.teamIntro = teamIntro;
	}

	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

}
