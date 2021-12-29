package com.androiddaily.mvp.common;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.androiddaily.mvp.common.presenter.BasePresenter;
import com.androiddaily.mvp.common.view.IBaseView;

/**
 * author: ant
 * date: 2021/12/17
 * desc：
 */
public abstract class CommonActivity<P extends BasePresenter<V>, V extends IBaseView> extends AppCompatActivity implements IBaseView {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();
        mPresenter.onAttach((V) this);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
