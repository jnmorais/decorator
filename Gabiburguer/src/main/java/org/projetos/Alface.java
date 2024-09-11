package org.projetos;

public class Alface extends HamburguerDecorator {
    public Alface(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Alface";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.10;
    }
}

