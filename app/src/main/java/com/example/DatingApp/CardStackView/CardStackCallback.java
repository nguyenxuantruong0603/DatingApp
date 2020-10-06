package com.example.DatingApp.CardStackView;

import androidx.recyclerview.widget.DiffUtil;

import com.example.DatingApp.model.Meeting;

import java.util.List;

public class CardStackCallback extends DiffUtil.Callback {

    private List<Meeting> old,baru;

    public CardStackCallback(List<Meeting> old, List<Meeting> baru) {
        this.old = old;
        this.baru = baru;
    }

    @Override
    public int getOldListSize() {
        return old.size();
    }

    @Override
    public int getNewListSize() {
        return baru.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition).getAvatar() == baru.get(newItemPosition).getAvatar();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition) == baru.get(newItemPosition);
    }
}
