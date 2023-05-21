package home.codelab.lemonade

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import home.codelab.lemonade.ui.theme.Shapes

@Composable
fun AppImageButton(imageId: Int, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(24.dp),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.button_background))
    ) {
        Image(
            modifier = Modifier.padding(24.dp),
            painter = painterResource(id = imageId),
            contentDescription = imageId.toString()
        )
    }
}