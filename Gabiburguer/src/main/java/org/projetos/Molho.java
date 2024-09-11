package org.projetos;

public class Molho extends HamburguerDecorator {
    public Molho(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Molho";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.50;
    }
}

