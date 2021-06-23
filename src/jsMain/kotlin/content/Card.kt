package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div

@Composable
fun Card(content: @Composable () -> Unit){
    Div(
            attrs = {
                classes("card")
            }
    ){
        content()
    }
}