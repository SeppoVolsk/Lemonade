package home.codelab.lemonade

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppTitleText() {
    Box(
        modifier = Modifier
            .background(colorResource(id = R.color.title_background))
            .fillMaxWidth()

    ) {
        Text(
            text = stringResource(id = R.string.app_title_text),
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(Alignment.Center),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}