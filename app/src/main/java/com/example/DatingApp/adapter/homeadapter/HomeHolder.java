package com.example.DatingApp.adapter.homeadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;

public class HomeHolder extends RecyclerView.ViewHolder {
    LinearLayout layout_Compass3;
    public ImageView imgAvatar,imgStatus;
    public TextView tvName;
    public HomeHolder(@NonNull View itemView) {
        super(itemView);


        imgAvatar = itemView.findViewById(R.id.imgAvatar);
        tvName = itemView.findViewById(R.id.tvName);
        layout_Compass3=itemView.findViewById(R.id.Layout_Compass3);
        imgStatus=itemView.findViewById(R.id.imgStatus);
    }
}
