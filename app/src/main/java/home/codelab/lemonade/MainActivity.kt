package home.codelab.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.codelab.lemonade.ui.theme.AppDescriptionText
import home.codelab.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var initialStep = 0
        val stepState = mutableStateOf(value = initialStep)
        setContent {
            LemonadeApp(stepState) {
                if (stepState.value in 0..2) {
                    stepState.value++
                } else {
                    stepState.value = 0
                }
            }
        }
    }
}


@Composable
fun LemonadeApp(
    step: State<Int>,
    onClick: () -> Unit
) {
    var currentStep = step.value
    LemonadeTheme {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            AppTitleText()
            Spacer(Modifier.height(160.dp))
            AppImageButton(
                images[currentStep],
                onClick
            )
            Spacer(Modifier.height(32.dp))
            AppDescriptionText(descriptions[currentStep])
        }

    }
}

private val images = listOf<Int>(
    R.drawable.lemon_tree,
    R.drawable.lemon_squeeze,
    R.drawable.lemon_drink,
    R.drawable.lemon_restart
)
private val descriptions = listOf<Int>(
    R.string.lemon_tree,
    R.string.lemon,
    R.string.glass_of_lemonade,
    R.string.empty_glass
)

