package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // NIVEL 2 - Leitura de dados
        // Utilizar Scanner para ler os dados pelo teclado
        Scanner scan = new Scanner(System.in);

        // NIVEL 2 - Leitura de dados do filme 1
        System.out.print("Título do filme 1: ");
        String titulo = scan.nextLine();

        System.out.print("Género do filme 1: ");
        String genero = scan.nextLine();

        System.out.print("Ano do filme 1: ");
        int ano = scan.nextInt();

        // NIVEL 3 - Quantidade de cópias
        System.out.print("Quantidade do filme 1: ");
        int quantidade = scan.nextInt();
        scan.nextLine();

        // NIVEL 1 - Criar um objeto da classe Filme
        Filme f = new Filme(titulo, genero, ano, quantidade);

        // NIVEL 2 - Leitura de dados de filme 2
        System.out.print("\nTítulo do filme 2: ");
        String titulo2 = scan.nextLine();

        System.out.print("Género do filme 2: ");
        String genero2 = scan.nextLine();

        System.out.print("Ano do filme 2: ");
        int ano2 = scan.nextInt();

        //NIVEL 3 - Quantidade de cópias
        System.out.print("Quantidade do filme 2: ");
        int quantidade2 = scan.nextInt();
        scan.nextLine();

        Filme f2 = new Filme(titulo2, genero2, ano2, quantidade2);



        //NIVEL 4 - Vários filmes
        //Leitura dos dados do terceiro filme
        System.out.print("Título do filme 3:");
        String titulo3 = scan.nextLine();

        System.out.print("Género do filme 3: ");
        String genero3 = scan.nextLine();

        System.out.print("Ano do filme 3: ");
        int ano3 = scan.nextInt();

        //NIVEL 3- Quantidade de cópias
        System.out.print("Quantidade do filme 3: ");
        int quantidade3 = scan.nextInt();

        Filme f3 = new Filme(titulo3, genero3, ano3, quantidade3);


        // NIVEL 4 - Vários filmes
        // Apresentar o catalogo completo
        System.out.println("\n CATÁLOGO DA VIDEOTECA");

        System.out.println("\n Filme 1 ");
        f.print();

        System.out.println("\n Filme 2 ");
        f2.print();

        System.out.println("\n Filme 3 ");
        f3.print();

        scan.close();
    }

}