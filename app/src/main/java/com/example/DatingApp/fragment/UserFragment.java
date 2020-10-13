package com.example.DatingApp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.DatingApp.activity.InformationUserActivity;
import com.example.DatingApp.activity.MainActivity;
import com.example.DatingApp.R;

public class UserFragment extends Fragment {

    private ImageView imgAvatarUser;
    private TextView tvNameUser;
    private TextView tvShowUser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        imgAvatarUser = view.findViewById(R.id.imgAvatarUser);
        tvNameUser = view.findViewById(R.id.tvNameUser);
        tvShowUser = view.findViewById(R.id.tvShowUser);


        imgAvatarUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), InformationUserActivity.class);
                getContext().startActivity(intent);
            }
        });
        tvNameUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), InformationUserActivity.class);
                getContext().startActivity(intent);
            }
        });
        tvShowUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), InformationUserActivity.class);
                getContext().startActivity(intent);
            }
        });


        MainActivity.imgOpition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SettingUserFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, fragment);
                transaction.commit();

            }
        });
    }
}
