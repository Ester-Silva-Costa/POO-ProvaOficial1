package br.com.poo.oficial1;

public class Professor extends Funcionario {

    double salario;
    private Object Professor;

    @Override
    public double getSalarioPrimeiraParcela() {
        return salario;
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
