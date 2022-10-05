package com.sryang.torangscreenfilter.di

import com.sryang.torang_repository.repository.*
import com.sryang.torang_repository.repository.impl.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MyReviewsRepositoryProvider() {
    @Binds
    abstract fun provideMyReviewsRepository(myReviewsRepositoryImpl: MyReviewsRepositoryImpl): MyReviewsRepository

    @Binds
    abstract fun provideLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository

    @Binds
    abstract fun provideMyReviewRepository(myReviewRepositoryImpl: MyReviewRepositoryImpl): MyReviewRepository

    @Binds
    abstract fun provideNationRepository(nationRepositoryImpl: NationRepositoryImpl): NationRepository

//    @Binds
//    abstract fun provideFindRepository(findRepository: TestFindRepositoryImpl): FindRepository

    @Binds
    abstract fun provideFindRepository(findRepository: FindRepositoryImpl): FindRepository

    @Binds
    abstract fun provideFilterRepository(filterRepository: FilterRepositoryImpl): FilterRepository
}