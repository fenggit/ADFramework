package com.androiddaily.mvp.common.presenter;

import com.androiddaily.mvp.common.view.IBaseView;

import java.lang.ref.WeakReference;

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {
    private WeakReference<V> mViews;

    @Override
    public void onAttach(V view) {
        this.mViews = new WeakReference<>(view);
    }

    @Override
    public void onDetach() {
        if (mViews == null) {
            return;
        }
        mViews.clear();
        mViews = null;
    }

    @Override
    public V getView() {
        return mViews != null ? mViews.get() : null;
    }
}
