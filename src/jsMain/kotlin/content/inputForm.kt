package content

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.jetbrains.compose.web.dom.*

@Composable
fun InputForm(
        text: String,
        onTextChanged: (String) -> Unit,
        onAddClicked: () -> Unit
){
    Div {
        InputArea(
                text = text,
                onTextChanged = onTextChanged,
                attrs = {

                }
        )

        SubmitButton(
                onClick = onAddClicked,
                text = "Submit",
                attrs = {

                }
        )
    }
}

@Composable
fun InputArea(
        text: String,
        onTextChanged: (String) -> Unit,
        attrs: AttrBuilderContext<*> = {}
){
    Div(
            attrs = {
                attrs()
            }
    ){
        TextArea(
                value = text,
                attrs = {
                    onTextInput { onTextChanged(it.inputValue) }
                }
        )
    }
}

@Composable
fun SubmitButton(
        onClick: () -> Unit,
        text: String,
        attrs: AttrBuilderContext<*> = {}
){
    A(
            attrs = {
                this.onClick { onClick() }
                attrs()
            }
    ){
        Text(text)
    }
}