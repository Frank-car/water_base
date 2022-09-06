package com.frank.home.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.frank.base.router.RouterFragmentPath;
import com.frank.home.BR;
import com.frank.home.R;
import com.frank.home.databinding.FragmentHomeBinding;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * @author duyang
 * @createTime 2022/8/16 14:33
 * @description 主页
 */
@Route(path = RouterFragmentPath.Home.PAGE_HOME)
public class HomeFragment extends BaseFragment<FragmentHomeBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewmodel;
    }
}
