package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guardaRoupaTest {

    GuardaRoupa gr;

    @BeforeEach
    void preparar() {
        gr = new GuardaRoupa(500);
    }

    @Test @DisplayName("Teste para analisar se o desconto funciona")
    void precoComDesconto() {
        assertEquals(180, gr.precoComDesconto(200, 10), 0.01);
    }

    @Test @DisplayName("Teste para confirmar se o item cabe no orcamento")
    void cabeNoOrcamento() {
        assertTrue(gr.cabeNoOrcamento(300));
    }

    @Test @DisplayName("Teste para confirmar se o item não cabe no orcamento")
    void naoCaberNoOrcamento () { assertFalse(gr.cabeNoOrcamento(501));}

    @Test @DisplayName("Teste para confirmar se o item é de Gala")
    void naoEhDeGala() {
        assertFalse(gr.ehDeGala(199));
    }

    @Test @DisplayName("Teste para confirmar se o item não é de Gala")
    void ehDeGala() { assertTrue(gr.ehDeGala(200));}

}