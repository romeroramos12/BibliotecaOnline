package org.example.bibliotecaonline.model;

public class Livros {
    private String isbn;        // Código ISBN (obrigatório e único)
    private String titulo;      // Título do livro (obrigatório, máximo 50 caracteres)
    private String categoria;    // Categoria do livro (opcional)
    private int quantidade;      // Quantidade de livros (obrigatório)

    public Livros(String isbn, String titulo, String categoria, int quantidade) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
}
