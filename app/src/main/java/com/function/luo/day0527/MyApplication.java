package com.function.luo.day0527;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by luo on 2019/6/11.
 */

public class MyApplication extends Application {
    private boolean debug = true;
    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug()) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();
            // 打印日志
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }
        //初始化
        ARouter.init(this);
    }


    public boolean isDebug() {
        return debug;
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
        //销毁
        ARouter.getInstance().destroy();
    }
}





