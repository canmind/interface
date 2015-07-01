package com.o2o.model.request;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-10-6.
 */
public class FeedBack extends BaseBo {

    @NotBlank(message = "建议内容不能为空")
    @Length(max = 200, message = "建议内容长度不能大于200")
    private String suggest;
    //联系方式
    @Length(max = 100, message = "联系方式不大于100")
    private String contact;

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
