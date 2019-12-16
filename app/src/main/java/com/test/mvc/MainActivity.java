package com.test.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.test.mvc.control.LoginControl;

public class MainActivity extends AppCompatActivity {

    private LoginControl loginControl;
    private EditText etName;
    private EditText etPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginControl = new LoginControl(this);

        etName = findViewById(R.id.etName);
        etPwd = findViewById(R.id.etName);
        View btLogin=findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginControl.login(etName.getText().toString(),etPwd.getText().toString());
            }
        });
    }

    public void showMsg(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
