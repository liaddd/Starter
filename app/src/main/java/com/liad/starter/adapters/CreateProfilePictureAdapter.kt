package com.liad.starter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.liad.starter.R
import com.liad.starter.utills.extensions.toEmoji

class CreateProfilePictureAdapter : RecyclerView.Adapter<CreateProfilePictureAdapter.ViewHolder>() {

    private val emojis = listOf(0x1F600, 0x1F607, 0x1F92A, 0x1F911, 0x1F634, 0x1F912, 0x1F637)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_picture_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = emojis.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = emojis[position].toEmoji()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.profile_picture_list_item_text_view)
    }

}
