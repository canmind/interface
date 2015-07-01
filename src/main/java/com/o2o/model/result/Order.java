package com.o2o.model.result;

/**
 * IDEA
 * <p/>
 * 订单模型
 *
 * @Description Created by bowen.ma on 14-10-6.
 */
public class Order {

    //订单id
    private int id;
    //成交时间
    private long createTime;
    //数量
    private int count;
    //单价
    private int price;
    //订单总价
    private int total;
    //订单状态
    private int status;
    //交易类型方式
    private int tradeType;
    //商品信息
    private Goods goods;
    //买家信息
    private User buyer;
    //卖家信息
    private User seller;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTradeType() {
        return tradeType;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
