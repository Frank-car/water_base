package com.frank.wss.ui;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.frank.base.router.RouterActivityPath;
import com.frank.base.router.RouterFragmentPath;
import com.frank.wss.BR;
import com.frank.wss.R;
import com.frank.wss.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {

    private List<Fragment> mFragments;

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        // 初始化Fragment
        initFragment();
        // 初始化底部Button
        //initBottomTab();
    }

    /**
     * 初始化Fragment
     */
    private void initFragment() {
        Fragment runFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Run.PAGE_RUN).navigation();
        Fragment setFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Setting.PAGE_SETTING).navigation();
        Fragment mainFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGE_HOME).navigation();
        Fragment maintainFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Maintain.PAGE_MAINTAIN).navigation();
        Fragment lookFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Look.PAGE_LOOK).navigation();

        mFragments = new ArrayList<>();
        mFragments.add(runFragment);
        mFragments.add(setFragment);
        mFragments.add(mainFragment);
        mFragments.add(maintainFragment);
        mFragments.add(lookFragment);

        if (runFragment != null) {
            // 默认选择主界面
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frameLayout, runFragment);
            transaction.commitAllowingStateLoss();
        }
    }

    /**
     * 初始化底部Button
     */
    private void initBottomTab() {
        NavigationController navigationController = binding.pagerBottomTab.material()
                .addItem(R.mipmap.run,"运行")
                .addItem(R.mipmap.set, "设置")
                .addItem(R.mipmap.main, "")
                .addItem(R.mipmap.maintain, "维护")
                .addItem(R.mipmap.look, "查看")
                .setDefaultColor(ContextCompat.getColor(this, R.color.textColorVice))
                .build();
        // 底部按钮点击事件监听
        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                Fragment currentFragment = mFragments.get(index);
                if (currentFragment != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frameLayout, currentFragment);
                    transaction.commitAllowingStateLoss();
                }
            }

            @Override
            public void onRepeat(int index) {

            }
        });
    }
}