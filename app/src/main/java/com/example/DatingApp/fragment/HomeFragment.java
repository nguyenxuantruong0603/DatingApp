package com.example.DatingApp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.DatingApp.R;
import com.example.DatingApp.adapter.homeadapter.AdapterHome;
import com.example.DatingApp.model.Meeting;
import com.example.DatingApp.setting.CustomItemDecorator;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView rcCompass3;
    AdapterHome adapterHome;
    public static List<Meeting> meetings;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcCompass3 = view.findViewById(R.id.rcCompass);
        meetings = setupData();
        initView();


    }

    private void initView() {
        adapterHome = new AdapterHome(getContext(), meetings);
        rcCompass3.setAdapter(adapterHome);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        manager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        rcCompass3.addItemDecoration(new CustomItemDecorator(getResources().getDimensionPixelSize(R.dimen._16sdp), getResources().getDimensionPixelSize(R.dimen._90sdp)));
        rcCompass3.setLayoutManager(manager);
        rcCompass3.setHasFixedSize(true);
    }

    public static List<Meeting> setupData() {
        meetings = new ArrayList<>();
        meetings.add(new Meeting("MARIA OZAWA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA FUKAMADA", 11, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 20, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 22, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 32, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 12, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 25, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 42, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 65, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 52, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 87, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 67, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 98, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 54, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 32, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA", 19, R.drawable.gaixinh3));
        meetings.add(new Meeting("MARIA OZAWA", 19, R.drawable.gaixinh3));
        return meetings;
    }

}
