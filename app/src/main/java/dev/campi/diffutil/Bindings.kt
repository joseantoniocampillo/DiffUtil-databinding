package dev.campi.diffutil

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Objeto>?) {
    val adapter = recyclerView.adapter as CustomAdapter
    data?.let {
        adapter.submitList(data)
    }
}