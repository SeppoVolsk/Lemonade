package home.codelab.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val initialStep = 0
        val stepState = mutableStateOf(value = initialStep)
        val counterState = mutableStateOf(value = 0)
        var clicksRequired: Int? = null

        setContent {
            LemonadeApp(stepState) {
                when (stepState.value) {
                    1 -> {
                        clicksRequired = clicksRequired ?: (2..4).random()
                        counterState.value++
                        if (counterState.value == clicksRequired) {
                            clicksRequired = null
                            counterState.value = 0
                            stepState.value++
                        }
                    }
                    0, 2 -> stepState.value++
                    3 -> stepState.value = 0
                }
            }
        }
    }
}



