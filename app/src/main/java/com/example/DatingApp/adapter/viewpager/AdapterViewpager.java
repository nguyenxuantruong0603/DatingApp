package com.example.DatingApp.adapter.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.DatingApp.R;
import com.example.DatingApp.model.Meeting;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterViewpager extends PagerAdapter {
    private Context context;
    private List<Meeting> meetingList;
    ImageView imgBottomSheetAvatar;
    TextView tvBottomSheetName;
    TextView tvBottomSheetLocation;
    TextView tvBottomSheetAge;
    FloatingActionButton floatingActionButtonCanel, floatingActionButtonLike, floatingActionButtonLove;


    public AdapterViewpager(Context context, List<Meeting> meetingList) {
        this.context = context;
        this.meetingList = meetingList;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_viewpager_meeting, container, false);


        imgBottomSheetAvatar = view.findViewById(R.id.imgBottomSheetAvatar);
        tvBottomSheetName = view.findViewById(R.id.tvBottomSheetName);
        tvBottomSheetLocation = view.findViewById(R.id.tvBottomSheetLocation);
        tvBottomSheetAge = view.findViewById(R.id.tvBottomSheetAge);
        floatingActionButtonCanel = view.findViewById(R.id.floating_action_button_canel_Home);
        floatingActionButtonLike = view.findViewById(R.id.floating_action_button_like_Home);
        floatingActionButtonLove = view.findViewById(R.id.floating_action_button_love_Home);



        Meeting meeting = meetingList.get(position);
        Picasso.get().load(meeting.getAvatar()).into(imgBottomSheetAvatar);
        tvBottomSheetName.setText(meeting.getName());
        tvBottomSheetAge.setText(meeting.getAge() + "");
        tvBottomSheetLocation.setText("Nguyễn Cơ Thạch");
        floatingActionButtonCanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Canel", Toast.LENGTH_SHORT).show();
            }
        });

        floatingActionButtonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Like", Toast.LENGTH_SHORT).show();
            }
        });

        floatingActionButtonLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Love", Toast.LENGTH_SHORT).show();
            }
        });
        container.addView(view);
        return view;

    }

    @Override
    public int getCount() {
        return meetingList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
