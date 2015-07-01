package com.o2o.model.result;

/**
 * IDEA
 * <p/>
 * 升级模型
 *
 * @Description Created by bowen.ma on 14-10-2.
 */
public class Update {

    //是否有效  有效时后面参数可用
    private boolean isEffective;
    //是否强制升级 1强升 2非强升
    private int force;

    private String url;

    public Update(boolean isEffective, int force, String url) {
        this.isEffective = isEffective;
        this.force = force;
        this.url = url;
    }

    public boolean isEffective() {
        return isEffective;
    }

    public void setEffective(boolean isEffective) {
        this.isEffective = isEffective;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
