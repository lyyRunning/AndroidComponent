package com.function.luo.mine;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 *
 * @author luo
 * @date 2019/6/11
 */
@Route(path = "/mine/MineActivity")
public class MineActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine_activity_main);
        ARouter.getInstance().inject(this);
    }
}
