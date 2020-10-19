package com.hk.myspringboot.config.appresult;

import lombok.Data;

@Data
public class AppResult<T> {
    private boolean result;
    private  String msg;
    private  T list;
}
