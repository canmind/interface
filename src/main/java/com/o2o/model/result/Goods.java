package com.o2o.model.result;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.o2o.model.request.BaseBo;


/**
 * IDEA
 * 商品模型
 *
 * @Description Created by bowen.ma on 14-10-2.
 */
public class Goods extends BaseBo{

    private String id;
    //标题
    @NotBlank(message = "标题不能为空")
    @Length(max = 32, message = "标题长度不能大于32")
    private String title;
    //描述信息
    @NotBlank(message = "描述信息不能为空")
    @Length(max = 200, message = "描述信息长度不能大于200")
    private String desc;
    //商品热度
    private int hot;
    //商品价格
    @NotBlank(message = "商品价格不能为空")
    private double price;
    //商品所属地理位置
    @NotBlank(message = "地理位置不能为空")
    private String location;
    //相关图片
    private List<String> images;
    //所属用户
    private User user;

    public Goods() {
		super();
	}

	public Goods(String id, String title, String desc, List<String> images, String location) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.images = images;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
