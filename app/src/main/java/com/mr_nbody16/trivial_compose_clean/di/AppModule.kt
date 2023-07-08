package com.mr_nbody16.trivial_compose_clean.di

import androidx.compose.ui.unit.Constraints
import com.mr_nbody16.trivial_compose_clean.network.QuestionApi
import com.mr_nbody16.trivial_compose_clean.respositories.QuestionRepository
import com.mr_nbody16.trivial_compose_clean.uitls.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): QuestionApi = retrofit.create(QuestionApi::class.java)

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    fun provideQuestionRepository(api : QuestionApi) = (QuestionRepository(api))




}