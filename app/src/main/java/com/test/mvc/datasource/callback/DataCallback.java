package com.test.mvc.datasource.callback;

/***
 *   created by zhongrui on 2019/12/16
 */
public interface DataCallback<T> {
    void onSuccess(T data);
    void onError();
}
