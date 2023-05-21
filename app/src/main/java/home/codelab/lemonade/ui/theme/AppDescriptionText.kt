package home.codelab.lemonade.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun AppDescriptionText(textId: Int) {
    Text(text = stringResource(id = textId), modifier = Modifier.padding(horizontal = 48.dp))
}