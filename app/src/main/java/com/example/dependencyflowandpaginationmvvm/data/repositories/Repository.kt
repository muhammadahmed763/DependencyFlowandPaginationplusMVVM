package com.example.dependencyflowandpaginationmvvm.data.repositories

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.example.dependencyflowandpaginationmvvm.data.modal.Movie



interface Repository {
    suspend fun getAllMovies() : LiveData<PagingData<Movie>>
}