package com.example.tablenews.adapter;

import com.example.tablenews.NewPost;

import java.util.List;

public interface DataSender {
    public void onDataRecived(List<NewPost> listData);
}

