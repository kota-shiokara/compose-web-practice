package model

import com.arkivanov.decompose.value.Value

interface TodoMain {

    val models: Value<Model>

    fun onItemClicked(id: Long)

    fun onItemDoneChanged(id: Long, isDone: Boolean)

    fun onItemDeleteClicked(id: Long)

    fun onInputTextChanged(text: String)

    fun onAddItemClicked()

    data class Model(
            val title: String,
            val items: List<TodoItem>
    )
}