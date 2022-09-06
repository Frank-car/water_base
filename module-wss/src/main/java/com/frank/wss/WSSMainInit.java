package com.frank.wss;

import android.app.Application;

import com.frank.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @author duyang
 * @createTime 2022/9/5 20:15
 * @description 采样器主业务模块初始化
 */
public class WSSMainInit  implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("主业务模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("主业务模块初始化 -- onInitLow");
        return false;
    }
}