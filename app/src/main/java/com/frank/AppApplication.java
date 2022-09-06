package com.frank;

import android.content.Context;

import com.bytedance.boost_multidex.BoostMultiDex;
import com.frank.base.config.ModuleLifecycleConfig;

import me.goldze.mvvmhabit.base.BaseApplication;

/**
 * @author duyang
 * @createTime 2022/8/8 21:43
 * @description
 */
public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件（靠前）
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);

        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        BoostMultiDex.install(base);
    }
}
