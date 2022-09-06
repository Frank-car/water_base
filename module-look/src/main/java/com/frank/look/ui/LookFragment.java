package com.frank.look.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.frank.base.router.RouterFragmentPath;
import com.frank.look.BR;
import com.frank.look.R;
import com.frank.look.databinding.FragmentLookBinding;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * @author duyang
 * @createTime 2022/8/16 14:40
 * @description 查看模块主页面
 */
@Route(path = RouterFragmentPath.Look.PAGE_LOOK)
public class LookFragment extends BaseFragment<FragmentLookBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_look;
    }

    @Override
    public int initVariableId() {
        return BR.viewmodel;
    }
}
