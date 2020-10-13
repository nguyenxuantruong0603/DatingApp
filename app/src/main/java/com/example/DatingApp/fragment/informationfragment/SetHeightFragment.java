package com.example.DatingApp.fragment.informationfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.fragment.app.Fragment;

import com.example.DatingApp.R;


public class SetHeightFragment extends Fragment {
    private String title;
    private int page;
    private ImageView imgCancel;
    private TextView tvSetHeight;
    private AppCompatSeekBar sbSetHeight;
    private ImageView imgSaveHine;
    private TextView tvNextHine;

    public static SetHeightFragment newInstance(int page, String title) {
        SetHeightFragment fragmentFirst = new SetHeightFragment();
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
        View view = inflater.inflate(R.layout.fragment_set_height, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        imgCancel = view.findViewById(R.id.imgCancel);
        tvSetHeight = view.findViewById(R.id.tvSetHeight);
        sbSetHeight = view.findViewById(R.id.sbSetHeight);
        imgSaveHine = view.findViewById(R.id.imgSaveHine);
        tvNextHine = view.findViewById(R.id.tvNextHine);

        imgCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        tvNextHine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        sbSetHeight.setMax(200);
        sbSetHeight.setProgress(150);
        sbSetHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvSetHeight.setText(i + "cm");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}