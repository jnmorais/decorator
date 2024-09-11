package org.projetos;

public class Ovo extends HamburguerDecorator {
    public Ovo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Ovo";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.50;
    }
}

