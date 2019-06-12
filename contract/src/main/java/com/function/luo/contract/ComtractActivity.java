package com.function.luo.contract;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by luo on 2019/6/11.
 */
@Route(path = "/comtract/ComtractActivity")
public class ComtractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contract_activity_comtract);
        ARouter.getInstance().inject(this);
    }
}
