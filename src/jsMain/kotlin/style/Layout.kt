package style

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main

// 公式のexampleから借用
@Composable
fun Layout(content: @Composable () -> Unit){
    Div({
        style{
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            height(100.percent)
            margin(0.px)
            property("box-sizing", "border-box")
        }
    }){
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            property("flex", "1 0 auto")
            property("box-sizing", "border-box")
        }
    }) {
        content()
    }
}