package com.tapaafandi.mvvmnewsapplication.repository

import com.tapaafandi.mvvmnewsapplication.api.RetrofitInstance
import com.tapaafandi.mvvmnewsapplication.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}