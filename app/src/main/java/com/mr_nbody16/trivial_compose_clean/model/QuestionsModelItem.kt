package com.mr_nbody16.trivial_compose_clean.model

import com.google.gson.annotations.SerializedName

data class QuestionsModelItem(
    @SerializedName("answer")
    val answer: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("choices")
    val choices: List<String>,
    @SerializedName("question")
    val question: String
)