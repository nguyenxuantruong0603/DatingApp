package com.example.DatingApp.adapter.chatadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;
import com.example.DatingApp.model.ChatModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterChatNgang extends RecyclerView.Adapter<ChatNgangHolder> {

    private Context context;
    private List<ChatModel> chatModelList;

    public AdapterChatNgang(Context context, List<ChatModel> chatModelList) {
        this.context = context;
        this.chatModelList = chatModelList;
    }

    @NonNull
    @Override
    public ChatNgangHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycle_chat_ngang, parent, false);
        ChatNgangHolder chatNgangHolder = new ChatNgangHolder(view);
        return chatNgangHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatNgangHolder holder, int position) {

        ChatModel chatModel = chatModelList.get(position);
        holder.tvNameChatNgang.setText(chatModel.getName());
        Picasso.get().load(chatModel.getAvatar()).into(holder.imgAvatarChatNgang);


    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }
}
