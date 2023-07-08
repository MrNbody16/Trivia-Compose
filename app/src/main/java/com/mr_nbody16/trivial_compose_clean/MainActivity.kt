package com.mr_nbody16.trivial_compose_clean

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.mr_nbody16.trivial_compose_clean.ui.screen.TriviaHome
import com.mr_nbody16.trivial_compose_clean.ui.theme.TrivialComposecleanTheme
import com.mr_nbody16.trivial_compose_clean.uitls.Constants
import com.mr_nbody16.trivial_compose_clean.viewmodel.QuestionsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrivialComposecleanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TriviaHome()
                }
            }
        }
    }
}












@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrivialComposecleanTheme {
    }
}