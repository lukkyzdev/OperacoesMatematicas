package br.edu.operacoes;

public class Divisao extends OperacaoMatematica {
    
    @Override
    public double calcular(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Divisão por zero não é permitida.");
        }

        return a / b;
    }
}
