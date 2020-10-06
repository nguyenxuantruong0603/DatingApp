package com.example.DatingApp.CardStackView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;
import com.example.DatingApp.model.Meeting;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterCardStack extends RecyclerView.Adapter<AdapterCardStack.CardStackHolder> {


    private List<Meeting> meetingList;


    public AdapterCardStack(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    @NonNull
    @Override
    public CardStackHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_stack_view, parent, false);
        CardStackHolder cardStackHolder = new CardStackHolder(view);
        return cardStackHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardStackHolder holder, int position) {

        Meeting meeting = meetingList.get(position);
        Picasso.get().load(meeting.getAvatar()).into(holder.imgCardStackAvatar);
        holder.tvCardStackAge.setText(meeting.getAge() + "");
        holder.tvCardStackName.setText(meeting.getName());
        holder.tvCardStackLocation.setText("Phạm Văn Đồng");
    }

    @Override
    public int getItemCount() {
        return meetingList.size();
    }

    class CardStackHolder extends RecyclerView.ViewHolder {

        ImageView imgCardStackAvatar;
        TextView tvCardStackName, tvCardStackLocation, tvCardStackAge;
        FloatingActionButton floatingActionButtonCanel, floatingActionButtonLike, floatingActionButtonLove;

        public CardStackHolder(@NonNull View itemView) {
            super(itemView);
            imgCardStackAvatar = itemView.findViewById(R.id.imgCardStackAvatar);
            tvCardStackName = itemView.findViewById(R.id.tvCardStackName);
            tvCardStackLocation = itemView.findViewById(R.id.tvCardStackLocation);
            tvCardStackAge = itemView.findViewById(R.id.tvCardStackAge);
            floatingActionButtonCanel = itemView.findViewById(R.id.floating_action_button_canel);
            floatingActionButtonLike = itemView.findViewById(R.id.floating_action_button_like);
            floatingActionButtonLove = itemView.findViewById(R.id.floating_action_button_love);

        }
    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }
}
