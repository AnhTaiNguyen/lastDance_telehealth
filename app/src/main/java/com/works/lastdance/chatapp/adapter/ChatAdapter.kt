package com.works.lastdance.chatapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.works.lastdance.chatapp.activity.ChatActivity

import com.works.lastdance.R
import com.works.lastdance.databinding.ChatUserItemLayoutBinding
import com.works.lastdance.patient.models.PatientData


class ChatAdapter(var context: Context, var list: ArrayList<PatientData>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>()
{
    inner class ChatViewHolder(view: View): RecyclerView.ViewHolder(view){
        var binding : ChatUserItemLayoutBinding = ChatUserItemLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_user_item_layout, parent, false))
    }
    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val user = list[position]
//        Glide.with(context).load(user.imageUrl).into(holder.binding.userImage)
        holder.binding.userName.text = user.email

        holder.itemView.setOnClickListener{
            val intent= Intent(context, ChatActivity::class.java)
            intent.putExtra("UID", user.UID)
            context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
        return list.size
    }


}