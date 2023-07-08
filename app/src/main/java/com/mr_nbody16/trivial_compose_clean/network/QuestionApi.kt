package com.mr_nbody16.trivial_compose_clean.network

import com.mr_nbody16.trivial_compose_clean.model.QuestionsModel
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions() : QuestionsModel



}