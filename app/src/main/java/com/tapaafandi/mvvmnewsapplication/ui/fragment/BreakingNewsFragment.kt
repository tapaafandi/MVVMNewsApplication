package com.tapaafandi.mvvmnewsapplication.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tapaafandi.mvvmnewsapplication.R
import com.tapaafandi.mvvmnewsapplication.ui.NewsActivity
import com.tapaafandi.mvvmnewsapplication.ui.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}