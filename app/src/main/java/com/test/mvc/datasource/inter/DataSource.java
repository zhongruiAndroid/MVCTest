package com.test.mvc.datasource.inter;

import com.test.mvc.datasource.callback.DataCallback;

/***
 *   created by zhongrui on 2019/12/16
 */
public interface DataSource<T> {
    void getData(String name,String pwd,DataCallback<T> callback);
}
