package com.androiddaily.mvp.v1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddaily.mvp.databinding.ActivityBookListBinding
import com.androiddaily.mvp.v1.BookPresenter
import com.androiddaily.mvp.v1.IBookView
import com.androiddaily.mvp.v1.bean.Book

class BookListActivity : AppCompatActivity(), IBookView {
    lateinit var bookPresenter: BookPresenter
    lateinit var binding: ActivityBookListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bookPresenter = BookPresenter()
        bookPresenter.onAttach(this)
        bookPresenter.getBookList()
    }

    override fun onBookList(bookList: MutableList<Book>) {
        runOnUiThread {
            val adapter = BookListAdapter()
            adapter.list = bookList

            binding.list.adapter = adapter
            binding.list.layoutManager = LinearLayoutManager(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        bookPresenter.onDetach()
    }
}