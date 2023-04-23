package com.example.e_news;

import com.example.e_news.Models.NewsHeadlines;

import java.util.List;


public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}