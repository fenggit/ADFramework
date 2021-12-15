package com.androiddaily.mvp.v1;

import com.androiddaily.mvp.common.model.IBaseModel;
import com.androiddaily.mvp.common.presenter.BasePresenter;
import com.androiddaily.mvp.v1.bean.Book;

import java.util.List;

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public class BookPresenter extends BasePresenter<IBookView> {
    private BookModel mBookModel;

    public BookPresenter() {
        this.mBookModel = new BookModel();
    }

    public void getBookList() {
        mBookModel.getBookList(new IBaseModel.OnLoaderListener<List<Book>>() {
            @Override
            public void onSuccess(List<Book> info) {
                if (getView() != null) {
                    getView().onBookList(info);
                }
            }

            @Override
            public void onError(String msg, String code) {
                if (getView() != null) {
                    getView().onBookList(null);
                }
            }
        });
    }
}
