package com.example.dependencyflowandpaginationmvvm.data.viewmodal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.dependencyflowandpaginationmvvm.data.modal.Movie
import com.example.dependencyflowandpaginationmvvm.data.modal.MovieResponse
import com.example.dependencyflowandpaginationmvvm.data.repositories.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModal @Inject constructor(private val repository: Repository):ViewModel() {

    val errorMessage = MutableLiveData<String>()



    suspend fun getMovieList(): LiveData<PagingData<Movie>> {
        return repository.getAllMovies().cachedIn(viewModelScope)
    }


}