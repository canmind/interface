/**
 *
 */
package com.o2o.model.result;

/**
 * 好应用推荐
 *
 * @author lenovo
 */
public class App {
    //主键
    private int id;
    //应用名称
    private String name;
    //描述
    private String desc;
    //图标
    private String icon;
    //版本
    private String version;
    //大小
    private String size;
    //日期
    private String date;
    //下载地址
    private String url;
    //点击统计
    private String clickUrl;
    //平台
    private String platform;
    //下载量
    private Long total;


    public App(int id, String name, String desc, String icon, String version,
               String size, String date, String url, String clickUrl, Long total) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.icon = icon;
        this.version = version;
        this.size = size;
        this.date = date;
        this.url = url;
        this.clickUrl = clickUrl;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
