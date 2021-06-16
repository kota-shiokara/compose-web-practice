package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.MySection


@Composable
fun Header(){
    Section(attrs = {
        classes(MySection.mySectionBgDark)
    }){
        Div {
            Text("ToDo App")
        }
    }
}