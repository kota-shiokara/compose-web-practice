import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.css.Style
import content.Header
import style.AppStyleSheet
import style.Layout

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Layout{
            Header()
        }
    }
}