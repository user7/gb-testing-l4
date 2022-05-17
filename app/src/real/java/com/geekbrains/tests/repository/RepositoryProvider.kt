package com.geekbrains.tests.repository

import com.geekbrains.tests.presenter.RepositoryContract

object RepositoryProvider {
    fun provide(): RepositoryContract {
        Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GitHubApi::class.java)
    }
}