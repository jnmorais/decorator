package org.projetos;

public class Bacon extends HamburguerDecorator {
    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Bacon";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.00;
    }
}

