package org.projetos;

public class PaoCarne implements Hamburguer {

    @Override
    public String getDescricao() {
        return "Pao e carne";
    }

    @Override
    public double getPreco() {
        return 6.00;
    }
}
