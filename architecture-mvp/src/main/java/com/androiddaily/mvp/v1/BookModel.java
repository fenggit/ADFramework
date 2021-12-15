package com.androiddaily.mvp.v1;

import android.os.SystemClock;

import com.androiddaily.mvp.common.model.IBaseModel;
import com.androiddaily.mvp.v1.bean.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
public class BookModel implements IBaseModel {

    public void getBookList(OnLoaderListener<List<Book>> listener) {
        // 模拟 网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 假设数据请求
                SystemClock.sleep(2000);

                List<Book> bookList = new ArrayList<>();
                bookList.add(new Book("Android", android.R.drawable.ic_menu_call));
                bookList.add(new Book("Java", android.R.drawable.ic_menu_compass));
                bookList.add(new Book("Kotlin", android.R.drawable.ic_menu_camera));

                listener.onSuccess(bookList);
            }
        }).start();
    }
}
