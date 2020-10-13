package com.example.DatingApp.fragment.informationfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.fragment.app.Fragment;

import com.example.DatingApp.R;


public class SetLanguageFragment extends Fragment {
    private String title;
    private int page;
    private AppCompatRadioButton rdTiengViet;
    private AppCompatRadioButton rdTiengAnh;
    private AppCompatRadioButton rdTiengHan;
    private AppCompatRadioButton rdTiengNhat;
    private AppCompatRadioButton rdTiengNga;
    private ImageView imgSaveLanguague,imgCancel;
    private TextView tvNextLanguage;

    public static SetLanguageFragment newInstance(int page, String title) {
        SetLanguageFragment fragmentFirst = new SetLanguageFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_set_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rdTiengViet = view.findViewById(R.id.rdTiengViet);
        rdTiengAnh = view.findViewById(R.id.rdTiengAnh);
        rdTiengHan = view.findViewById(R.id.rdTiengHan);
        rdTiengNhat = view.findViewById(R.id.rdTiengNhat);
        rdTiengNga = view.findViewById(R.id.rdTiengNga);
        imgSaveLanguague = view.findViewById(R.id.imgSaveLanguague);
        tvNextLanguage = view.findViewById(R.id.tvNextLanguage);
        imgCancel=view.findViewById(R.id.imgCancel);
        imgSaveLanguague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Save Languague Fragment", Toast.LENGTH_SHORT).show();
            }
        });
        tvNextLanguage.setOnClickListener(new View.OnClickListener() {
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