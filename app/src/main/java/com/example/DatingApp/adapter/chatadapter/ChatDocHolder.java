package com.example.DatingApp.adapter.chatadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;

public class ChatDocHolder extends RecyclerView.ViewHolder {

     ImageView imgAvatarDoc;
     TextView tvNameChatDoc;
     TextView tvMessageChat;
     TextView tvTimeChatDoc;
     TextView tvNumberChat;


    public ChatDocHolder(@NonNull View itemView) {
        super(itemView);
        imgAvatarDoc = itemView.findViewById(R.id.imgAvatarDoc);
        tvNameChatDoc = itemView.findViewById(R.id.tvNameChatDoc);
        tvMessageChat = itemView.findViewById(R.id.tvMessageChat);
        tvTimeChatDoc = itemView.findViewById(R.id.tvTimeChatDoc);
        tvNumberChat = itemView.findViewById(R.id.tvNumberChat);

    }
}
