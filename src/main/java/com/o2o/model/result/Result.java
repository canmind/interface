package com.o2o.model.result;



/**
 * IDEA
 * <p/>
 * 通用结果类
 *
 * @Description Created by bowen.ma on 14-10-2.
 */

public class Result {


    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

    
}
