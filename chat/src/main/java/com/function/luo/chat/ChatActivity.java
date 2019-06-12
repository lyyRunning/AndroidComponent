package com.function.luo.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.function.luo.commonlib.Student;

/**
 * Created by luo on 2019/6/11.
 */

@Route(path = "/chat/ChatActivity")
public class ChatActivity extends AppCompatActivity {

    @Autowired(name = "name")
    public String name;

    @Autowired(name = "age")
    public int age;

    @Autowired(name = "test")
    public  Student student;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity_chat);
        ARouter.getInstance().inject(this);
        TextView tv_value = findViewById(R.id.tv_value);
        TextView tv_value2 = findViewById(R.id.tv_value2);

        tv_value.setText("name====="+name+"====age===="+age+"=======student======"+student);
        tv_value2.setText("name====="+student.getName()+"====time===="+student.getTime());
    }
}
