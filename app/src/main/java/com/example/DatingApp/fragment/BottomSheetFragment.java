package com.example.DatingApp.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.DatingApp.R;
import com.example.DatingApp.adapter.AdapterViewpager;
import com.example.DatingApp.model.Meeting;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

import static com.example.DatingApp.fragment.HomeFragment.setupData;

public class BottomSheetFragment extends BottomSheetDialogFragment {
    List<Meeting> meetings;
    ViewPager vpMeeting;
    BottomSheetBehavior bottomSheetBehavior;
    AdapterViewpager adapterViewpager;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.fragment_bottom_sheet, null);


        vpMeeting = view.findViewById(R.id.vpMeeting);
        meetings = setupData();
        adapterViewpager = new AdapterViewpager(getContext(), meetings);
        vpMeeting.setAdapter(adapterViewpager);


        //set cardStackView
//        SetManagerStackCard setManagerStackCard = new SetManagerStackCard(getContext(),cardStackView);
//        setManagerStackCard.SetOptionCardManager();
        // set view
        dialog.setContentView(view);
        // set color
        ((View) view.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));
        bottomSheetBehavior = BottomSheetBehavior.from((View) view.getParent());
        bottomSheetBehavior.setPeekHeight(0);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {


            // khi mình thay đổi trạng thái của cái BottomSheetBehavior thì nó chạy vào onStateChanged
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

                //STATE_COLLAPSED là khi mà mình vuốt xuống thì nó làm gì đó.
                if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                    dismiss();
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        return dialog;
    }

}
