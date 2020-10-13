package com.example.DatingApp.fragment.informationfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.fragment.app.Fragment;

import com.example.DatingApp.R;


public class SetSmokeFragment extends Fragment {
    private String title;
    private int page;
    private AppCompatRadioButton rdLikeSmoke;
    private AppCompatRadioButton rdAllwaySmoke;
    private AppCompatRadioButton rdHateSmoke;
    private AppCompatRadioButton rdOftenSmoke;
    private AppCompatRadioButton rdNoViewSmoke;
    private ImageView imgSaveSmoke,imgCancel;
    private TextView tvNextSmoke;

    public static SetSmokeFragment newInstance(int page, String title) {
        SetSmokeFragment fragmentFirst = new SetSmokeFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_set_smoke, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        rdLikeSmoke = view.findViewById(R.id.rdLikeSmoke);
        rdAllwaySmoke = view.findViewById(R.id.rdAllwaySmoke);
        rdHateSmoke = view.findViewById(R.id.rdHateSmoke);
        rdOftenSmoke = view.findViewById(R.id.rdOftenSmoke);
        rdNoViewSmoke = view.findViewById(R.id.rdNoViewSmoke);
        imgSaveSmoke = view.findViewById(R.id.imgSaveSmoke);
        tvNextSmoke = view.findViewById(R.id.tvNextSmoke);
        imgCancel=view.findViewById(R.id.imgCancel);
        tvNextSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        imgCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

    }
}