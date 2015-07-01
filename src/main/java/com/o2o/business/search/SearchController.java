package com.o2o.business.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.o2o.core.base.BaseController;
import com.o2o.model.request.Search;
import com.o2o.model.result.Goods;
import com.o2o.model.result.Result;
import com.o2o.model.result.SearchTag;
import com.o2o.model.result.SearchType;
import com.o2o.model.result.User;

/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-10-5.
 */
@Controller
@RequestMapping("/search")
public class SearchController extends BaseController {


    /**
     * 搜索结果接口
     *
     * @param search
     * @return
     */
    @RequestMapping("/search.json")
    @ResponseBody
    public Result searchGood(Search search) {
        search.valid(search);
        Result result = new Result();
        if (search.getKey() != null) {
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
                    images.add("www.sina.com");
                }
                Goods goods = new Goods(i + "", "折扣iphone6", "iphone6是很好的", images, "39.112,113.40");
                goods.setUser(user);
                goods.setPrice(208);
                goodsList.add(goods);
            }
            setStatusOk(result, goodsList);
        } else {
            setStatusErr(result, "搜索参数错误", null);
        }
        return result;
    }


    /**
     * 获取搜索热词接口 依据地区下发
     *
     * @param location
     * @return
     */
    @RequestMapping("/tag.json")
    @ResponseBody
    public Result getSearchTag(String location) {
        Result result = new Result();
        if (location == null) {
            //采用默认方式下发
        }
        ArrayList<SearchTag> tags = new ArrayList<SearchTag>();
        SearchTag tag = new SearchTag("演员", 1008);
        tags.add(tag);
        setStatusOk(result, tags);
        return result;
    }

    /**
     * 获取搜索热词接口 依据地区下发
     *
     * @param location
     * @return
     */
    @RequestMapping("/type.json")
    @ResponseBody
    public Result getSearchType(String token,String location) {
        Result result = new Result();
        if (location == null) {
            //采用默认方式下发
        }
        List<SearchType> types = new ArrayList<SearchType>();

        List<SearchType> type1 = new ArrayList<SearchType>();
        SearchType type1_1 = new SearchType(11, "苹果", "iphone", 1, null);
        SearchType type1_2 = new SearchType(12, "三星", "s4", 2, null);
        SearchType type1_3 = new SearchType(13, "诺基亚", "1110", 2, null);
        type1.add(type1_1);
        type1.add(type1_2);
        type1.add(type1_3);
        SearchType type = new SearchType(1, "二手手机", "手机号码", 1, type1);
        types.add(type);
        setStatusOk(result, types);
        return result;
    }

}
