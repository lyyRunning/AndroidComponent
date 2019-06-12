package com.function.luo.day0527;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.function.luo.commonlib.Student;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt1)
    Button bt1;
    @BindView(R.id.bt2)
    Button bt2;
    @BindView(R.id.bt3)
    Button bt3;
    @BindView(R.id.bt4)
    Button bt4;
    private  Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);

    }

    @OnClick({R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.bt1:
                student = new Student();
                student.setName("小明");
                student.setTime("20190612");

                ARouter.getInstance().build("/chat/ChatActivity")
                        .withParcelable("test",student)
                        .withString("name","android")
                         .withInt("age",23).navigation();
                break;
            case R.id.bt2:
                ARouter.getInstance().build("/comtract/ComtractActivity").navigation();
                break;
            case R.id.bt3:
                ARouter.getInstance().build("/home/HomeActivity").navigation();
                break;
            case R.id.bt4:
                ARouter.getInstance().build("/mine/MineActivity").navigation();
                break;
            default:
        }
    }
}
