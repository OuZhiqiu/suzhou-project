package com.hk.myspringboot.config.appresult;

public class AppResultBuilder {
    //成功，不返回具体数据
    public static <T> AppResult<T> successNoData(ResultCode code){
        AppResult<T> result = new AppResult<T>();
        result.setMsg(code.getMsg());
        result.setResult(true);
        return result;
    }
    //成功，返回数据
    public static <T> AppResult<T> success(T t, ResultCode code){
        AppResult<T> result = new AppResult<T>();
        result.setMsg(code.getMsg());
        result.setList(t);
        result.setResult(true);
        return result;
    }

    //失败，返回失败信息
    public static <T> AppResult<T> faile(ResultCode code){
        AppResult<T> result = new AppResult<T>();
        result.setMsg(code.getMsg());
        result.setResult(false);
        return result;
    }
}
