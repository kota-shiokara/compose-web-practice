package style

import org.jetbrains.compose.web.css.*

object MySection: StyleSheet(AppStyleSheet) {
    val mySection by style {
        property("box-sizing", "border-box")
        property("padding-bottom", 96.px)
        property("padding-top", 1.px)
        backgroundColor("#fff")
    }

    val mySectionBgLight by style {
        color(Color.RGB(0, 0, 0))
        backgroundColor("#ffffff")
    }

    val mySectionBgDark by style {
        color(Color.RGB(255, 255, 255))
        backgroundColor("#000000")
    }
}