package model;

public class Aluno {

    String nome;
    int idade;
    double [] notas;

    public Aluno(String nome, int idade, double [] notas) {
        this.nome = nome;
        this.idade = idade;
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
}

