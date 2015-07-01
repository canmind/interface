package com.o2o.model.result;

/**
 * IDEA
 * 搜索热词
 *
 * @Description Created by bowen.ma on 14-10-5.
 */
public class SearchTag {

    //热词标签
    private String tag;
    //热词热度,后端方便排序所引入
    private int hot;

    public SearchTag(String tag, int hot) {
        this.tag = tag;
        this.hot = hot;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }
}
