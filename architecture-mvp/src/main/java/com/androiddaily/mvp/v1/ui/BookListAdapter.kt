package com.androiddaily.mvp.v1.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androiddaily.mvp.databinding.ItemBookBinding
import com.androiddaily.mvp.v1.bean.Book

/**
 * author: ant
 * date: 2021/12/15
 * desc：
 */
class BookListAdapter : RecyclerView.Adapter<BookListHolder>() {
    var list: List<Book> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookListHolder(binding)
    }

    override fun onBindViewHolder(holder: BookListHolder, position: Int) {
        holder.bindViewData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class BookListHolder(var binding: ItemBookBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bindViewData(book: Book) {
        binding.bookImage.setImageResource(book.imageResource)
        binding.bookTitle.text = book.title
    }

}