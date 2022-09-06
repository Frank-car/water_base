package com.frank.look;

import android.app.Application;

import com.frank.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @author duyang
 * @createTime 2022/8/16 15:12
 * @description
 */
public class LookModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("查看模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("查看模块初始化 -- onInitLow");
        return false;
    }
}
