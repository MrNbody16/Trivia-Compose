package com.mr_nbody16.trivial_compose_clean.ui.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.mr_nbody16.trivial_compose_clean.ui.component.Questions
import com.mr_nbody16.trivial_compose_clean.viewmodel.QuestionsViewModel


@Composable
fun TriviaHome(viewModel : QuestionsViewModel = hiltViewModel() ) {
    Questions(viewModel = viewModel)


}
