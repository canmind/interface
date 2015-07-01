package com.o2o.model.request;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-10-5.
 */
public class Search extends BaseBo {

    //按哪种方式搜索
    private int type;
    @NotBlank(message = "key内容不能为null")
    @Length(max = 30, message = "建议内容长度不能大于30")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
