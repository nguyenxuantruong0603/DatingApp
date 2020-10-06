package com.example.DatingApp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DatingApp.R;
import com.example.DatingApp.adapter.chatadapter.AdapterChatDoc;
import com.example.DatingApp.adapter.chatadapter.AdapterChatNgang;
import com.example.DatingApp.model.ChatModel;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    public static List<ChatModel> chatModelList;
    AdapterChatNgang adapterChatNgang;
    AdapterChatDoc adapterChatDoc;
    private RecyclerView rcChatNgang, rChatDoc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.chat_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        rcChatNgang = view.findViewById(R.id.rcChatNgang);
        rChatDoc = view.findViewById(R.id.rChatDoc);
        chatModelList = SetupData();
            InitView();
    }


    private void InitView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcChatNgang.setLayoutManager(layoutManager);
        rcChatNgang.setHasFixedSize(true);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rChatDoc.setLayoutManager(layoutManager2);
        rChatDoc.setHasFixedSize(true);

        adapterChatDoc = new AdapterChatDoc(getContext(), chatModelList);
        adapterChatNgang = new AdapterChatNgang(getContext(), chatModelList);
        rcChatNgang.setAdapter(adapterChatNgang);
        rChatDoc.setAdapter(adapterChatDoc);

    }

    public static List<ChatModel> SetupData() {

        chatModelList = new ArrayList<>();
        chatModelList.add(new ChatModel("Đầu Cắt Moi", "Người anh em cho xin cái địa chỉ", R.drawable.daucatmoi, 9, "30 phút"));
        chatModelList.add(new ChatModel("Nguyễn Hữu Đa", "Tôi năm nay 70 tuổi", R.drawable.nguyenhuuda, 2, "2 giờ"));
        chatModelList.add(new ChatModel("Bình Gold", "Ông bà già tao lo hết", R.drawable.binhgold, 3, "17 giờ"));
        chatModelList.add(new ChatModel("Thanh Niên Lớp 1", "À thế làm sao mà à ?", R.drawable.athelamsaomaa, 6, "25/09/2020"));
        chatModelList.add(new ChatModel("Ngô Bá Khá", "Tóc Bảnh như lông mèo", R.drawable.khabanh, 12, "27/09/2020"));
        chatModelList.add(new ChatModel("Khánh Sky", "Một mình tao chấp hetttttttttt !", R.drawable.khanhsky, 7, "50 phút"));
        chatModelList.add(new ChatModel("Đầu Cắt Moi", "Người anh em cho xin cái địa chỉ", R.drawable.daucatmoi, 9, "30 phút"));
        chatModelList.add(new ChatModel("Nguyễn Hữu Đa", "Tôi năm nay 70 tuổi", R.drawable.nguyenhuuda, 2, "2 giờ"));
        chatModelList.add(new ChatModel("Bình Gold", "Ông bà già tao lo hết", R.drawable.binhgold, 3, "17 giờ"));
        chatModelList.add(new ChatModel("Thanh Niên Lớp 1", "À thế làm sao mà à ?", R.drawable.athelamsaomaa, 6, "25/09/2020"));
        chatModelList.add(new ChatModel("Ngô Bá Khá", "Tóc Bảnh như lông mèo", R.drawable.khabanh, 9, "27/09/2020"));
        chatModelList.add(new ChatModel("Khánh Sky", "Một mình tao chấp hetttttttttt !", R.drawable.khanhsky, 7, "50 phút"));
        chatModelList.add(new ChatModel("Đầu Cắt Moi", "Người anh em cho xin cái địa chỉ", R.drawable.daucatmoi, 9, "30 phút"));
        chatModelList.add(new ChatModel("Nguyễn Hữu Đa", "Tôi năm nay 70 tuổi", R.drawable.nguyenhuuda, 2, "2 giờ"));
        chatModelList.add(new ChatModel("Bình Gold", "Ông bà già tao lo hết", R.drawable.binhgold, 3, "17 giờ"));
        chatModelList.add(new ChatModel("Thanh Niên Lớp 1", "À thế làm sao mà à ?", R.drawable.athelamsaomaa, 6, "25/09/2020"));
        chatModelList.add(new ChatModel("Ngô Bá Khá", "Tóc Bảnh như lông mèo", R.drawable.khabanh, 9, "27/09/2020"));
        chatModelList.add(new ChatModel("Khánh Sky", "Một mình tao chấp hetttttttttt !", R.drawable.khanhsky, 7, "50 phút"));
        return chatModelList;
    }

}
