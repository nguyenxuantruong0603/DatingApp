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
import androidx.fragment.app.Fragment;

import com.example.DatingApp.R;


public class SetWeighttFragment extends Fragment {
    private String title;
    private int page;
    private TextView tvSetWeight;
    private SeekBar sbSetWeight;
    private ImageView imgSaveWine, imgCancel;
    private TextView tvNextWine;

    public static SetWeighttFragment newInstance(int page, String title) {
        SetWeighttFragment fragmentFirst = new SetWeighttFragment();
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
        View view = inflater.inflate(R.layout.fragment_set_weight, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvSetWeight = view.findViewById(R.id.tvSetWeight);
        sbSetWeight = view.findViewById(R.id.sbSetWeight);
        imgSaveWine = view.findViewById(R.id.imgSaveWine);
        tvNextWine = view.findViewById(R.id.tvNextWine);
        imgCancel = view.findViewById(R.id.imgCancel);
        imgCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        tvNextWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        sbSetWeight.setMax(120);
        sbSetWeight.setProgress(50);
        sbSetWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvSetWeight.setText(i + "kg");
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