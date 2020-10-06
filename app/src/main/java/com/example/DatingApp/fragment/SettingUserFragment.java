package com.example.DatingApp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.DatingApp.MainActivity;
import com.example.DatingApp.R;

public class SettingUserFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting_user, container, false);
        return view;

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MainActivity.tvSetting.setVisibility(View.VISIBLE);
        MainActivity.imgBackButton.setVisibility(View.VISIBLE);
        MainActivity.imgOpition.setVisibility(View.GONE);
        MainActivity.tvTitle.setVisibility(View.GONE);

        MainActivity.imgBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new UserFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, fragment);
                transaction.commit();
                MainActivity.tvSetting.setVisibility(View.GONE);
                MainActivity.imgBackButton.setVisibility(View.GONE);
                MainActivity.imgOpition.setVisibility(View.VISIBLE);
                MainActivity.tvTitle.setVisibility(View.VISIBLE);
            }
        });

    }
}
