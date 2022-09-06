package com.frank.base.router;

/**
 * @author duyang
 * @createTime 2022/8/15 19:52
 * @description * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */
public class RouterFragmentPath {

    /**
     * 运行组件
     */
    public static class Run {
        private static final String RUN = "/run";

        /*运行*/
        public static final String PAGE_RUN = RUN + "/Run";
    }

    /**
     * 设置组件
     */
    public static class Setting {
        private static final String SETTING = "/setting";

        /*设置*/
        public static final String PAGE_SETTING = SETTING + "/Setting";
    }

    /**
     * 主模块
     */
    public static class Home {
        private static final String HOME = "/home";

        /*主页*/
        public static final String PAGE_HOME = HOME + "/Home";
    }

    /**
     * 维护组件
     */
    public static class Maintain {
        private static final String MAINTAIN = "/maintain";

        /*维护*/
        public static final String PAGE_MAINTAIN = MAINTAIN + "/Maintain";
    }

    /**
     * 查看组件
     */
    public static class Look {
        private static final String LOOK = "/look";

        /*查看*/
        public static final String PAGE_LOOK = LOOK + "/Look";
    }

}
