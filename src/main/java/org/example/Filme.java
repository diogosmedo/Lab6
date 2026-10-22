package org.example;

public class Filme {
    //NIVEL 1- Criação da primeira classe
    //Atributos iniciais
    private String titulo;
    private String genero;
    private int ano;
    // NIVEL 3 - Quantidade de cópias
    // Novo atributo para guardar a quantidade de cópias
    private int quantidade;

    // Construtor da classe Filme
    public Filme(String titulo, String genero, int ano, int quantidade) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.quantidade =quantidade;
    }

    // Métodos para alterar os atributo
    public void setTitulo(String newTitulo){
        titulo=newTitulo;
    }
    public void setGenero(String newGenero){
        genero=newGenero;
    }
    public void setAno(int newAno){
        ano=newAno;
    }
    public void setQuantidade(int newQuantidade){
        quantidade=newQuantidade;
    }


    public String getTitulo(){
        return titulo;
    }
    public String getGenero(){
        return genero;
    }
    public int getAno(){
        return ano;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // NIVEL 1 - Mostrar os dados do filme
    // NIVEL 3 - Exibir todas as informações, incluindo quantidade
    public void print(){
        System.out.println("Filme:");
        System.out.println("título:" + titulo);
        System.out.println("Género:" + genero);
        System.out.println("Ano:" + ano);
        System.out.println("Quantidade:" + quantidade);

    }

}
