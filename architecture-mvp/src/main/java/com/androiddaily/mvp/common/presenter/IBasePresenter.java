package com.androiddaily.mvp.common.presenter;

import com.androiddaily.mvp.common.view.IBaseView;

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public interface IBasePresenter<V extends IBaseView> {
    void onAttach(V view);

    void onDetach();

    V getView();

}
