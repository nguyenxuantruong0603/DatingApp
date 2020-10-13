package com.example.DatingApp.CardStackView;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;
import com.example.DatingApp.model.Meeting;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.DatingApp.fragment.MeetingFragment.manager;

public class AdapterCardStack extends RecyclerView.Adapter<AdapterCardStack.CardStackHolder> {


    private List<Meeting> meetingList;
    Context context;
    boolean Check = false;

    public AdapterCardStack(List<Meeting> meetingList, Context context) {
        this.meetingList = meetingList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardStackHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardstack, parent, false);
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

        boolean isExpanded = meetingList.get(position).isExpanded();


        Log.e("EXPEND", isExpanded + "");
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        if (isExpanded == true) {
            holder.getSizeScreen(holder.relativeLayout_image);
            manager.setCanScrollHorizontal(false);
        } else {
            manager.setCanScrollHorizontal(true);
        }
        holder.imgCardStackAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Meeting meeting = meetingList.get(position);
                meeting.setExpanded(!meeting.isExpanded());
                notifyItemChanged(position);


            }
        });

    }


    @Override
    public int getItemCount() {
        return meetingList.size();
    }

    class CardStackHolder extends RecyclerView.ViewHolder {
        LinearLayout expandableLayout;
        RelativeLayout relativeLayout_image;
        ImageView imgCardStackAvatar;
        TextView tvCardStackName, tvCardStackLocation, tvCardStackAge;
        FloatingActionButton floatingActionButtonCanel, floatingActionButtonLike, floatingActionButtonLove;

        public CardStackHolder(@NonNull View itemView) {
            super(itemView);
            imgCardStackAvatar = itemView.findViewById(R.id.imgCardStackAvatar);
            tvCardStackName = itemView.findViewById(R.id.tvCardStackName);
            tvCardStackLocation = itemView.findViewById(R.id.tvCardStackLocation);
            tvCardStackAge = itemView.findViewById(R.id.tvCardStackAge);
            floatingActionButtonCanel = itemView.findViewById(R.id.floating_action_button_canel_Meeting);
            floatingActionButtonLike = itemView.findViewById(R.id.floating_action_button_like_Home);
            floatingActionButtonLove = itemView.findViewById(R.id.floating_action_button_love_Home);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            relativeLayout_image = itemView.findViewById(R.id.relativeLayout_image);
        }

        public void getSizeScreen(RelativeLayout layout) {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            //if you need three fix imageview in width
            int devicewidth = displaymetrics.widthPixels;
            //if you need 4-5-6 anything fix imageview in height
            int deviceheight = (displaymetrics.heightPixels) - (displaymetrics.heightPixels) / 4;
            // layout.getLayoutParams().width = devicewidth;
            //if you need same height as width you can set devicewidth in holder.image_view.getLayoutParams().height
            layout.getLayoutParams().height = deviceheight;
        }

    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }
}
