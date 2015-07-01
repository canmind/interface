package com.o2o.model.result;




/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-10-2.
 */
public class User{

    private String id;
    //toekn
    private String token;
    //用户昵称
    private String username;
    //用户手机号
    private String phone;
    //用户性别
    private String sex;
    //用户住址
    private String address;
    //用户信誉度等级
    private int level;
    //用户信誉度积分
    private int scores;
    //用户头像
    private String logo;
    //用户地理位置
    private String location;
    //识别推送
    private String ota;


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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
