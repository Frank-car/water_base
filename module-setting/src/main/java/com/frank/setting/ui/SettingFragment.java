package com.frank.setting.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.frank.base.router.RouterFragmentPath;
import com.frank.setting.BR;
import com.frank.setting.R;
import com.frank.setting.databinding.FragmentSettingBinding;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * @author duyang
 * @createTime 2022/8/16 14:24
 * @description 设置模块主界面
 */
@Route(path = RouterFragmentPath.Setting.PAGE_SETTING)
public class SettingFragment extends BaseFragment<FragmentSettingBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_setting;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
