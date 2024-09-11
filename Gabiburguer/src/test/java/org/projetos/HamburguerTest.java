package org.projetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguerBase() {
        Hamburguer hamburguer = new PaoCarne();
        assertEquals(6.00, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new PaoCarne());
        assertEquals(8.00, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComOvoEBatataPalha() {
        Hamburguer hamburguer = new Ovo(new BatataPalha(new PaoCarne()));
        assertEquals(8.30, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComTodosIngredientes() {
        Hamburguer hamburguer = new Molho(new Alface(new Bacon(new Ovo(new BatataPalha(new Queijo(new PaoCarne()))))));
        assertEquals(11.40, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComOvoEAlface() {
        Hamburguer hamburguer = new Alface(new Ovo(new PaoCarne()));
        assertEquals(7.60, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBatataPalhaEQueijo() {
        Hamburguer hamburguer = new Queijo(new BatataPalha(new PaoCarne()));
        assertEquals(7.30, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComMolhoEBacon() {
        Hamburguer hamburguer = new Molho(new Bacon(new PaoCarne()));
        assertEquals(8.50, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEAlface() {
        Hamburguer hamburguer = new Queijo(new Alface(new PaoCarne()));
        assertEquals(6.60, hamburguer.getPreco());
    }
}
