package com.example.DatingApp.adapter.homeadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;
import com.example.DatingApp.fragment.BottomSheetFragment;
import com.example.DatingApp.model.Meeting;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<HomeHolder> {

    private Context context;
    private List<Meeting> favoriteList;

    public AdapterHome(Context context, List<Meeting> favoriteList) {
        this.context = context;
        this.favoriteList = favoriteList;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycle_home, parent, false);
        HomeHolder homeHolder = new HomeHolder(view);
        return homeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        Meeting meeting = favoriteList.get(position);
        holder.tvName.setText(meeting.getName());
        Picasso.get().load(meeting.getAvatar()).into(holder.imgAvatar);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetFragment bottomSheetDialog = new BottomSheetFragment();
                bottomSheetDialog.show(((AppCompatActivity) context).getSupportFragmentManager(), "Bottom Sheet Dialog Fragment");
            }
        });
    }

    @Override
    public int getItemCount() {
        return favoriteList.size();
    }



}
