package model;

import org.w3c.dom.ls.LSOutput;

public class Aluno {

    String nome;
    int idade;
    double [] notas;

    public Aluno(String nome, int idade, double [] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public Aluno() {

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }




    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double [] getNotas() {
        return notas;
    }




    public double CalculaMediaNota() {

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

            return soma / notas.length;
    }

//Teste
    public boolean aprovado(){
        return CalculaMediaNota() >= 7;
    }
    public void ExibirDados() {

        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Média " + CalculaMediaNota());
        System.out.println("Aprovado " + (aprovado() ? "Sim" : "Não"));

    }



}

