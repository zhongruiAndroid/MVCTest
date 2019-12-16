package com.test.mvc.control;

import com.test.mvc.MainActivity;
import com.test.mvc.bean.LoginRes;
import com.test.mvc.datasource.LoginDataSource;
import com.test.mvc.datasource.callback.DataCallback;

/***
 *   created by zhongrui on 2019/12/16
 */
public class LoginControl {
    private  MainActivity mainActivity;
    public LoginControl(MainActivity activity) {
        this.mainActivity=activity;
    }
    public void login(String name,String pwd){
        LoginDataSource.get().getData(name, pwd, new DataCallback<LoginRes>() {
            @Override
            public void onSuccess(LoginRes data) {
                mainActivity.showMsg("登录成功");
            }
            @Override
            public void onError() {
                mainActivity.showMsg("登录失败");
            }
        });
    }

}
