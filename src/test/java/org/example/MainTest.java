package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Validacion exitosa de la secuencia")
    void isValidacionSecuencia_exitoso() {
        // Give
        String[] secuencia = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};

        // When
        Boolean isValidacion=Main.isValidacionSecuencia(secuencia);

        // Then
        Assertions.assertTrue(isValidacion);
    }
}