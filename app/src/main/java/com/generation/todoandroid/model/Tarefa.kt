package com.generation.todoandroid.model

data class Tarefa (
    val id: Long,
    val nome: String,
    val descricao: String,
    val responsavel: String,
    val data: String,
    val status: Boolean,
    val categoria: Categoria
){
}