package com.example.DatingApp.adapter.chatadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;

public class ChatNgangHolder extends RecyclerView.ViewHolder {

    public ImageView imgAvatarChatNgang;
    public TextView tvNameChatNgang;

    public ChatNgangHolder(@NonNull View itemView) {
        super(itemView);
        imgAvatarChatNgang = itemView.findViewById(R.id.imgAvatarChatNgang);
        tvNameChatNgang = itemView.findViewById(R.id.tvNameChatNgang);
    }
}
