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


public class SetWineFragment extends Fragment {
    private String title;
    private int page;
    private AppCompatRadioButton rdAllwayWine;
    private AppCompatRadioButton rdLikeWine;
    private AppCompatRadioButton rdNoWine;
    private AppCompatRadioButton rdHateWine;
    private AppCompatRadioButton rdNoViewWine;
    private ImageView imgSaveWine, imgCancel;
    private TextView tvNextWine;

    public static SetWineFragment newInstance(int page, String title) {
        SetWineFragment fragmentFirst = new SetWineFragment();
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
        return inflater.inflate(R.layout.fragment_set_wine, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rdAllwayWine = view.findViewById(R.id.rdAllwayWine);
        rdLikeWine = view.findViewById(R.id.rdLikeWine);
        rdNoWine = view.findViewById(R.id.rdNoWine);
        rdHateWine = view.findViewById(R.id.rdHateWine);
        rdNoViewWine = view.findViewById(R.id.rdNoViewWine);
        imgSaveWine = view.findViewById(R.id.imgSaveWine);
        tvNextWine = view.findViewById(R.id.tvNextWine);
        imgCancel = view.findViewById(R.id.imgCancel);

        tvNextWine.setOnClickListener(new View.OnClickListener() {
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