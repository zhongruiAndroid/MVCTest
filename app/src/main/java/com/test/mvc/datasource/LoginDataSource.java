package com.test.mvc.datasource;

import com.test.mvc.bean.LoginRes;
import com.test.mvc.datasource.callback.DataCallback;
import com.test.mvc.datasource.inter.DataSource;

/***
 *   created by zhongrui on 2019/12/16
 */
public class LoginDataSource implements DataSource<LoginRes> {
    private static LoginDataSource singleObj;
    private LoginDataSource() {
    }
    public static LoginDataSource get(){
        if(singleObj==null){
            synchronized (LoginDataSource.class){
                if(singleObj==null){
                    singleObj=new LoginDataSource();
                }
            }
        }
        return singleObj;
    }

    @Override
    public void getData(String name, String pwd, DataCallback<LoginRes> callback) {
        if(callback==null){
            return;
        }
        if("123".equals(name)&&"123".equals(pwd)){
            LoginRes loginRes=new LoginRes();
            loginRes.name="123";
            loginRes.pwd="123";
            callback.onSuccess(loginRes);
        }else{
            callback.onError();
        }
    }
}
