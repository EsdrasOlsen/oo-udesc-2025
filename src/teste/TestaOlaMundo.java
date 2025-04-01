package teste;

import java.util.Scanner;

public class TestaOlaMundo {
    public static void main(String[] args) {
        //instanciando um objeto: nome da classe, nome do objeto, nome da classe
        OlaMundo xyz = new OlaMundo();
        xyz.imprimirDados();
        xyz.imprimir("esdras", 19);

    int valor;
    Scanner lerDados = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = lerDados.nextLine();
    System.out.print("Digite sua idade: ");
    valor = lerDados.nextInt();
    xyz.imprimir(nome, valor);
    }
}