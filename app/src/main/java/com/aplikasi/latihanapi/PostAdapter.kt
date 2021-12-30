package com.aplikasi.latihanapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val list: ArrayList<PostItem>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var tvJudul: TextView? = null
        var tvKomplain: TextView? = null

        init{
            tvJudul = itemView.findViewById(R.id.tvJudul)
            tvKomplain = itemView.findViewById(R.id.tvkomplain)
        }

        fun bind(postResponse: PostItem){
            val judul = "judul: ${postResponse.judul}"
            val komplain = "komplain: ${postResponse.jenis_komplain}"
            tvJudul?.text = judul
            tvKomplain?.text = komplain
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)

        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])

    }

    override fun getItemCount(): Int = list.size
}