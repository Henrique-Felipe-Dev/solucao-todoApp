package com.generation.todoandroid.model

data class Categoria (
    val id: Long,
    val descricao: String?,
    val tarefas: List<Tarefa>?
) {
}