package com.androiddaily.mvp.common.model;


/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public interface IBaseModel {
    interface OnLoaderListener<T> {
        void onSuccess(T info);

        void onError(String msg, String code);
    }
}
