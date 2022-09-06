package com.frank.maintain;

import android.app.Application;

import com.frank.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @author duyang
 * @createTime 2022/8/16 15:13
 * @description
 */
public class MaintainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("维护模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("维护模块初始化 -- onInitLow");
        return false;
    }
}
