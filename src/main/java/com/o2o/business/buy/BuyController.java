package com.o2o.business.buy;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.o2o.core.base.BaseController;
import com.o2o.model.result.Goods;
import com.o2o.model.result.Result;
import com.o2o.model.result.User;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * IDEA
 * 买  首页接口
 *
 * @Description Created by bowen.ma on 14-10-2.
 */

@Controller
@RequestMapping("/buy")
public class BuyController extends BaseController {


    /**
     * 获取商品列表
     *
     * @return
     */
    @RequestMapping("/buylist.json")
    @ResponseBody
    public Result getBuyList() {

        //测试示例数据开始
        Result result = new Result();

        User user = new User();
        user.setId("1234");
        user.setUsername("陈海峰是演员");
        user.setToken(System.currentTimeMillis() + "");
        user.setLevel(2);
        user.setScores(100);
        user.setLocation("39.112,119.40");
        user.setAddress("北京市立水桥");
        user.setPhone("123456789");

        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i < 10; i++) {
            ArrayList<String> images = new ArrayList<String>();
            for (int j = 0; j < 5; j++) {
                images.add("www.baidu.com");
            }
            Goods goods = new Goods(i + "", "折扣iphone6", "iphone6是很好的", images, "39.112,113.40");
            goods.setUser(user);
            goodsList.add(goods);
        }
        setStatusOk(result, goodsList);
        return result;
    }


    /**
     * 获取交易历史接口
     *
     * @return
     */
    @RequestMapping("/history.json")
    @ResponseBody
    public Result getBuyHistoryList() {
        Result result = new Result();

        User user = new User();
        user.setId("123");
        user.setUsername("瑶瑶");
        user.setToken(System.currentTimeMillis() + "");
        user.setLevel(4);
        user.setScores(200);
        user.setLocation("39.112,119.40");
        user.setAddress("北京市酒仙桥");
        user.setPhone("987654321");

        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i < 5; i++) {
            ArrayList<String> images = new ArrayList<String>();
            for (int j = 0; j < 3; j++) {
                images.add("www.yaoyao.com");
            }
            Goods goods = new Goods(i + "", "折扣iphone6", "iphone6是很好的", images, "39.112,113.40");
            goods.setUser(user);
            goodsList.add(goods);
        }
        setStatusOk(result, goodsList);
        return result;
    }

}
