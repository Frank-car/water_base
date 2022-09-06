package com.frank.setting;

import android.app.Application;

import com.frank.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @author duyang
 * @createTime 2022/8/16 15:14
 * @description
 */
public class SettingModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("设置模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("设置模块初始化 -- onInitLow");
        return false;
    }
}
