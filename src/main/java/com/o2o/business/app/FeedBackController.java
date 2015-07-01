package com.o2o.business.app;

import com.o2o.core.base.BaseController;
import com.o2o.model.request.FeedBack;
import com.o2o.model.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * IDEA
 * 提交app用户反馈接口
 *
 * @Description Created by bowen.ma on 14-10-6.
 */
@Controller
@RequestMapping("/app")
public class FeedBackController extends BaseController {


    @RequestMapping("/feedback.json")
    @ResponseBody
    public Result commitFeedBack(FeedBack feedBack) {
        String msg = feedBack.valid(feedBack);
        Result result = new Result();
        if (msg != null) {
            setStatusError(result, msg);
            return result;
        }
        setStatusOk(result, null);
        return result;
    }

}
