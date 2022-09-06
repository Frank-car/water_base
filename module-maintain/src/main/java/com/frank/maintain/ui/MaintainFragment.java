package com.frank.maintain.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.frank.base.router.RouterFragmentPath;
import com.frank.maintain.BR;
import com.frank.maintain.R;
import com.frank.maintain.databinding.FragmentMaintainBinding;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * @author duyang
 * @createTime 2022/8/16 14:07
 * @description 维护模块主界面
 */
@Route(path = RouterFragmentPath.Maintain.PAGE_MAINTAIN)
public class MaintainFragment extends BaseFragment<FragmentMaintainBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_maintain;
    }

    @Override
    public int initVariableId() {
        return BR.viewmodel;
    }
}
