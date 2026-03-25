package br.edu.operacoes;

public class Main {
    public static void main(String[] args) {
    OperacaoMatematica minhaSoma = new Soma();
    OperacaoMatematica minhaDivisao = new Divisao();
    
    try {
        double resultadoSoma = minhaSoma.calcular(10, 5);
        System.out.println("Resultado da soma: " + resultadoSoma);

        double resultadoDivisao = minhaDivisao.calcular(20, 2);
        System.out.println("Resultado da divisão: " + resultadoDivisao);

        System.out.println("Tentando dividir 20 por zero...");
        minhaDivisao.calcular(20, 0);

    } catch (DivisaoPorZeroException e) {
        System.err.println("Erro: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("Erro inesperado: " + e.getMessage());
    }

    }
}
