package com.frank.base.config;

/**
 * @author duyang
 * @createTime 2022/8/16 14:54
 * @description 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */
public class ModuleLifecycleReflexs {

    private static final String BaseInit     = "com.frank.base.base.BaseModuleInit";
    //主业务模块
    private static final String WSSMainInit  = "com.frank.wss.WSSMainInit";
    //运行模块
    private static final String RunInit      = "com.frank.run.RunModuleInit";
    //设置模块
    private static final String SettingInit  = "com.frank.setting.SettingModuleInit";
    //首页模块
    private static final String HomeInit     = "com.frank.home.HomeModuleInit";
    //维护模块
    private static final String MaintainInit = "com.frank.maintain.MaintainModuleInit";
    //查看模块
    private static final String LookInit     = "com.frank.look.LookModuleInit";

    public static String[] initModuleNames = {BaseInit, WSSMainInit, RunInit, SettingInit, HomeInit, MaintainInit, LookInit};

}
