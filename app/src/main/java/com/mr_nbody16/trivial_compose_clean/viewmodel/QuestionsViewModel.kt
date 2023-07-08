package com.mr_nbody16.trivial_compose_clean.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mr_nbody16.trivial_compose_clean.model.DataOrException
import com.mr_nbody16.trivial_compose_clean.model.QuestionsModelItem
import com.mr_nbody16.trivial_compose_clean.respositories.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionsViewModel @Inject constructor(private val repo: QuestionRepository) : ViewModel() {

    val data : MutableState<DataOrException<ArrayList<QuestionsModelItem> , Boolean , Exception>> =
        mutableStateOf(DataOrException(null , true , Exception()))


    init {
        getAllQuestions()
    }

    private fun getAllQuestions() {
        viewModelScope.launch(Dispatchers.IO) {
            data.value = repo.getAllQuestions()
            if(data.value.data.toString().isNotEmpty()){
                data.value.loading = false
            }
        }
    }


}