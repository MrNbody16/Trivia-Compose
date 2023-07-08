package com.mr_nbody16.trivial_compose_clean.respositories

import android.util.Log
import android.widget.ArrayAdapter
import androidx.compose.ui.unit.Constraints
import com.mr_nbody16.trivial_compose_clean.model.DataOrException
import com.mr_nbody16.trivial_compose_clean.model.QuestionsModelItem
import com.mr_nbody16.trivial_compose_clean.network.QuestionApi
import com.mr_nbody16.trivial_compose_clean.uitls.Constants
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val data =
        DataOrException<ArrayList<QuestionsModelItem>, Boolean, Exception>()


    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionsModelItem>, Boolean, Exception> {
        try {
            data.loading = true
             data.data = api.getAllQuestions()
            if(data.data.toString().isNotEmpty())
                data.loading = false
        } catch (e: Exception) {
            data.e = e
            Log.d(Constants.TAG, "getAllQuestions: ")
        }
        return data
    }

}