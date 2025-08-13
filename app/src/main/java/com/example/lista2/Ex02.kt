package com.example.lista2

fun filmes(){
    var filmes = mutableListOf("Hora do Pesadelo", "Sexta-Feira 13", "Halloween")
    filmes.add("Massacre da Serra-elétrica")
    filmes.add("Pânico")
    filmes.remove("Halloween")
    print(filmes)
}
fun main(){
    filmes()
}