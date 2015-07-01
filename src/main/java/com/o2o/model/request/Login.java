package com.o2o.model.request;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Login extends BaseBo{
	//用户名
	private String username;
	//密码
	private String password;
	//设备id
	@NotBlank(message = "不能为空")
	@Length(max = 32, message = "sid长度不能大于32")
	@Pattern(regexp = "^[^`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]*$", message = "不能有特殊字符")
	private String sid;
	//平台
	@NotBlank(message = "不能为空")  
	@Pattern(regexp="android|ios" ,message="平台只能为android或ios")
	private String platform;
	//渠道号
	private String channel;
	//版本号
	@NotBlank(message = "不能为空")  
	private String version;
	
	// 用户地理位置
	private String location;
	
	//第三方账号登陆 游客 :1 o2o:2 qq : 3 weixin :4 weibo :5
	@NotBlank(message = "不能为空")  
	@Pattern(regexp="1|2|3|4|5" ,message="登陆方式只能为1|2|3|4|5")
	private String type;
	//第三方id
	private String thirdid;
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
