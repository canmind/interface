package com.o2o.business.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.o2o.core.base.BaseController;
import com.o2o.model.result.Answer;
import com.o2o.model.result.App;
import com.o2o.model.result.Help;
import com.o2o.model.result.Result;
import com.o2o.model.result.Update;

/**
 * IDEA
 * <p/>
 * 升级接口
 * 
 * @Description Created by bowen.ma on 14-10-2.
 */

@Controller
@RequestMapping("/app")
public class UpdateController extends BaseController {

	@RequestMapping("/update.json")
	@ResponseBody
	public Result update() {
		Result result = new Result();
		Update update = new Update(false, 1, "www.baidu.com");
		setStatusOk(result, update);
		return result;
	}
	
	/**
	 * 好应用推荐
	 * @param location
	 * @return
	 */
	@RequestMapping("/apps.json")
	@ResponseBody
	public Result apps(String location) {
		Result result = new Result();
		if (location == null) {
			// 采用默认方式下发
		}
		List<App> apps = new ArrayList<App>();
		App app1 = new App(
				1,
				"淘宝 - Taobao for iPhone 随时随地，想淘就淘",
				"手机淘宝（iPhone版）是阿里巴巴专为iPhone手机用户推出的满足其生活消费和线上购物需求的软件，具有查看附近的生活优惠信息、商品搜索、浏览、购买、支付、收藏、物流查询、旺旺沟通等在线功能，成为了用户方便快捷的生活消费入口。",
				"http://a5.mzstatic.com/us/r30/Purple3/v4/8c/f0/e5/8cf0e533-e6d8-545e-7e31-bfa7b3d26f68/mzl.sdnpemnu.350x350-75.jpg",
				"4.8.1",
				"39.3 MB",
				"2014年09月16日",
				"https://itunes.apple.com/cn/app/tao-bao-taobao-for-iphone/id387682726?mt=8",
				"https://itunes.apple.com/cn/app/tao-bao-taobao-for-iphone/id387682726?mt=8",
				1000l);
		App app2 = new App(
				2,
				"京东",
				"京东是中国最大的综合网购平台，正品行货、机打发票、售后上门取件、省钱又放心，商品品类覆盖家电、数码通讯、电脑、家居百货、服装服饰、母婴、图书、食品等12大类数万个品牌百万种优质商品，是网购用户的首选平台。",
				"http://a5.mzstatic.com/us/r30/Purple3/v4/8c/f0/e5/8cf0e533-e6d8-545e-7e31-bfa7b3d26f68/mzl.sdnpemnu.350x350-75.jpg",
				"3.8.0", "29.0 MB", "2014年08月29日",
				"https://itunes.apple.com/cn/app/jing-dong/id414245413?mt=8",
				"https://itunes.apple.com/cn/app/jing-dong/id414245413?mt=8",
				1010l);
		apps.add(app1);
		apps.add(app2);
		setStatusOk(result, apps);
		return result;
	}
	/**
	 * 帮助
	 * @return
	 */
	@RequestMapping("/help.json")
	@ResponseBody
	public Result help(String location) {
		Result result = new Result();
		if (location == null) {
			// 采用默认方式下发
		}
		List<Help> helps = new ArrayList<Help>();
		List<Answer> answer = new ArrayList<Answer>();
		Answer answer1 = new Answer("用支付宝支付，可选择绑定支付宝账户以便支付更便利。",1);
		Answer answer2 = new Answer("用银行卡支付，需要开通网银。",2);
		answer.add(answer1);
		answer.add(answer2);
		Help help = new Help("支持哪些支付方式？",1,answer);
		helps.add(help);
		setStatusOk(result, helps);
		return result;
	}
}
