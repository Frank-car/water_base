package com.frank.run.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.frank.base.router.RouterFragmentPath;
import com.frank.run.BR;
import com.frank.run.R;
import com.frank.run.databinding.FragmentRunBinding;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * @author duyang
 * @createTime 2022/8/15 21:00
 * @description 运行模块主界面
 */
@Route(path = RouterFragmentPath.Run.PAGE_RUN)
public class RunFragment extends BaseFragment<FragmentRunBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_run;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
