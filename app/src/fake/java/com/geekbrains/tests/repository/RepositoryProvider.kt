package com.geekbrains.tests.repository

import com.geekbrains.tests.presenter.RepositoryContract

object RepositoryProvider {
    fun provide() : RepositoryContract = FakeGitHubRepository()
}