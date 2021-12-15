package com.androiddaily.mvp.v1;

import com.androiddaily.mvp.common.view.IBaseView;
import com.androiddaily.mvp.v1.bean.Book;

import java.util.List;

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public interface IBookView extends IBaseView {
    void onBookList(List<Book> bookList);
}
