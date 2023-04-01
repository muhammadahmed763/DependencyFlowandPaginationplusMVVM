package com.example.dependencyflowandpaginationmvvm.data.repositories

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.dependencyflowandpaginationmvvm.data.apiservice.ApiService
import com.example.dependencyflowandpaginationmvvm.data.modal.Movie
import com.example.dependencyflowandpaginationmvvm.data.modal.MovieResponse
import com.example.dependencyflowandpaginationmvvm.data.modal.NETWORK_PAGE_SIZE
import com.example.dependencyflowandpaginationmvvm.data.pagination.MoviePagingSource
import javax.inject.Inject

class RepositoryImp @Inject constructor(private val apiService: ApiService):Repository {
    override suspend fun getAllMovies(): LiveData<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = NETWORK_PAGE_SIZE,
                enablePlaceholders = false,
                initialLoadSize = 2
            ),
            pagingSourceFactory = {
                MoviePagingSource(apiService)
            }
            , initialKey = 1
        ).liveData
    }
}