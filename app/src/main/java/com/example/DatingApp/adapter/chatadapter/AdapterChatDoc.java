package com.example.DatingApp.adapter.chatadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.activity.ChatActivity;
import com.example.DatingApp.R;
import com.example.DatingApp.model.ChatModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterChatDoc extends RecyclerView.Adapter<ChatDocHolder> {
    private Context context;
    private List<ChatModel> chatModelList;

    public AdapterChatDoc(Context context, List<ChatModel> chatModelList) {
        this.context = context;
        this.chatModelList = chatModelList;
    }

    @NonNull
    @Override
    public ChatDocHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycle_chat_doc, parent, false);
        ChatDocHolder chatDocHolder = new ChatDocHolder(view);
        return chatDocHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatDocHolder holder, int position) {

        ChatModel chatModel = chatModelList.get(position);
        holder.tvMessageChat.setText(chatModel.getMessage());
        holder.tvNameChatDoc.setText(chatModel.getName());
        holder.tvTimeChatDoc.setText(chatModel.getTime());
        holder.tvNumberChat.setText(chatModel.getNumberMessage()+"");
        Picasso.get().load(chatModel.getAvatar()).into(holder.imgAvatarDoc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, ChatActivity.class);
                intent.putExtra("NAME",chatModel.getName());
                intent.putExtra("AVATAR",chatModel.getAvatar());
                intent.putExtra("MESSAGE",chatModel.getMessage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }
}
