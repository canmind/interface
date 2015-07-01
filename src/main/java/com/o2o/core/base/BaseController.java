package com.o2o.core.base;

import com.o2o.model.result.Result;

/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-9-28.
 */
public class BaseController {

    private static final int STATUS_OK = 0;
    private static final int STATUS_ERR_PARAMS = -1;
    private static final int STATUS_ERR = -1;
    private static final String STATUS_OK_MESSAGE = "操作成功";
    private static final String STATUS_ERROR_MESSAGE = "操作失败";


    /**
     * 设置成功参数
     *
     * @param result
     */
	public void setStatusOk(Result result, Object object) {
        result.setCode(STATUS_OK);
        result.setMessage(STATUS_OK_MESSAGE);
        result.setData(object);
    }
    /**
     * 设置失败参数
     *
     * @param result
     */

    public void setStatusErr(Result result,String msg,Object obj) {
        result.setCode(STATUS_ERR);
        result.setMessage(msg);
        result.setData(obj);
    }

    /**
     * 设置失败参数
     *
     * @param result
     */

    public void setStatusError(Result result,String msg) {
        result.setCode(STATUS_ERR_PARAMS);
        result.setMessage(msg);
        result.setData(null);
    }


    /**
     * 公共参数传递有误
     *
     * @return
     */
    public Result publicParamsError() {
        Result result = new Result();
        result.setCode(-100);
        result.setMessage("基础参数缺失");
        return result;
    }


}
