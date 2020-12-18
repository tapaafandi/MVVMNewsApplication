package com.tapaafandi.mvvmnewsapplication.ui

import androidx.lifecycle.ViewModel
import com.tapaafandi.mvvmnewsapplication.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}