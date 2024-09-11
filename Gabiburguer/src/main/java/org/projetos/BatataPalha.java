package org.projetos;

public class BatataPalha extends HamburguerDecorator {
    public BatataPalha(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Batata Palha";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.80;
    }
}

