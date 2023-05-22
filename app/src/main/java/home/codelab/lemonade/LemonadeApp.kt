package home.codelab.lemonade

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.codelab.lemonade.ui.theme.AppDescriptionText
import home.codelab.lemonade.ui.theme.LemonadeTheme

@Composable
fun LemonadeApp(
    step: State<Int>,
    onClick: () -> Unit
) {
    val currentStep = step.value
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