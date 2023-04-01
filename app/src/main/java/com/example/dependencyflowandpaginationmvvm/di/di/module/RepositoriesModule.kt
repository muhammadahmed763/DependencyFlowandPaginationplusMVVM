package com.example.dependencyflowandpaginationmvvm.di.di.module

import com.example.dependencyflowandpaginationmvvm.data.repositories.Repository
import com.example.dependencyflowandpaginationmvvm.data.repositories.RepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoriesModule {

    @Binds
    fun mainRepository(mainRepositoryImpl: RepositoryImp) : Repository
}