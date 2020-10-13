package com.example.DatingApp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;

import com.example.DatingApp.CardStackView.AdapterCardStack;
import com.example.DatingApp.CardStackView.CardStackCallback;
import com.example.DatingApp.R;
import com.example.DatingApp.activity.MainActivity;
import com.example.DatingApp.activity.SelectiveActivity;
import com.example.DatingApp.model.Meeting;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

import static com.example.DatingApp.fragment.HomeFragment.setupData;

public class MeetingFragment extends Fragment {
    CardStackView cardStackView;
    public static CardStackLayoutManager manager;
    AdapterCardStack adapterCardStack;
    FrameLayout layout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.meeting_fragment, container, false);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        cardStackView = view.findViewById(R.id.card_stack_view_meeting);
        manager = new CardStackLayoutManager(getContext(), new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {

                Log.e("CardStackView", "onCardDragging" + direction.name() + "ratio" + ratio);
            }

            @Override
            public void onCardSwiped(Direction direction) {
                Log.e("onCardSwiped", "onCardSwiped: p=" + manager.getTopPosition() + " d=" + direction);

                // Paginating
                if (manager.getTopPosition() == adapterCardStack.getItemCount() - 5) {
                    paginate();
                }
            }

            @Override
            public void onCardRewound() {
                Log.e("TAG", "onCardRewound: " + manager.getTopPosition());
            }

            @Override
            public void onCardCanceled() {
                Log.e("TAG", "onCardCanceled: " + manager.getTopPosition());
            }

            @Override
            public void onCardAppeared(View view, int position) {
                TextView tv = view.findViewById(R.id.tvCardStackName);

                Log.e("TAG", "onCardAppeared: " + position + ", nama: " + tv.getText());

            }

            @Override
            public void onCardDisappeared(View view, int position) {
                TextView tv = view.findViewById(R.id.tvCardStackName);
                Log.e("TAG", "onCardDisappeared: " + position + ", nama: " + tv.getText());
            }
        });

        manager.setStackFrom(StackFrom.None);
        manager.setVisibleCount(3);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(40.0f);
        manager.setDirections(Direction.FREEDOM);
        manager.setCanScrollVertical(false);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        adapterCardStack = new AdapterCardStack(addList(), getContext());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapterCardStack);
        cardStackView.setItemAnimator(new DefaultItemAnimator());


        MainActivity.imgOpition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SelectiveActivity.class);
                getContext().startActivity(intent);
            }
        });

    }

    private List<Meeting> addList() {
        setupData();
        return setupData();
    }


    private void paginate() {
        List<Meeting> old = adapterCardStack.getMeetingList();
        List<Meeting> baru = new ArrayList<>(addList());
        CardStackCallback callback = new CardStackCallback(old, baru);
        DiffUtil.DiffResult hasil = DiffUtil.calculateDiff(callback);
        adapterCardStack.setMeetingList(baru);
        hasil.dispatchUpdatesTo(adapterCardStack);
    }
}
