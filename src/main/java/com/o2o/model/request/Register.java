package com.o2o.model.request;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


public class Register extends BaseBo {
	// 用户ID
	private String id;
	// 用户昵称
	private String username;
	private String password;
	// 用户手机号
	@NotBlank(message = "手机号不能为空")  
	@Length(max=11, message="手机号长度不能大于11")
	@Pattern(regexp = "(13[0-9]|15[0-9]|18[8|9])\\d{8}$", message = "手机号格式不正确")
	private String phone;
	// 用户性别
	private String sex;
	// 用户住址
	private String address;
	// 用户信誉度等级
	private int level;
	// 用户信誉度积分
	private int scores;
	// 用户头像
	private String logo;
	// 用户地理位置
	private String location;
	// 识别推送
	private String ota;
	//第三方账号登陆 qq weixin weibo
	private String type;
	//第三方id
	private String thirdid;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOta() {
		return ota;
	}

	public void setOta(String ota) {
		this.ota = ota;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getThirdid() {
		return thirdid;
	}

	public void setThirdid(String thirdid) {
		this.thirdid = thirdid;
	}
	
	
}
