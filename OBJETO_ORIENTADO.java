package br.unipar.main;

import br.unipar.objetos.Pessoa;

public class Main {

    public static void main(String[] args) {

        String versao = "";
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Cleiton";
        pessoa1.idade = 18;
        pessoa1.sexo = "M";
        pessoa1.cpf = "089.208.709-93";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Taffe";
        pessoa2.idade = 32;
        pessoa2.sexo = "M";
        pessoa1.cpf = "1";

        System.out.println(pessoa1.nome);
        System.out.println(pessoa2.nome);

    }
}
