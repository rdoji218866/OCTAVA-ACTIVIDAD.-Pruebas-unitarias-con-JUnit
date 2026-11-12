package org.prueba8;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @org.junit.jupiter.api.Test
    void arregloCon3cerosDevuelve3() {
        int[] x = {0,0,1,0};
        int cantidadDeCeros = ArrayOperations.numZero(x);
        assertEquals(3,cantidadDeCeros);
    }

    @org.junit.jupiter.api.Test
    void arregloSinCerosDevuelve0() {
        int[] x = {6,7,1,8};
        int cantidadDeCeros = ArrayOperations.numZero(x);
        assertEquals(0,cantidadDeCeros);
    }

    @org.junit.jupiter.api.Test
    void arregloVacioDevuelve0() {
        int[] x = {};
        int cantidadDeCeros = ArrayOperations.numZero(x);
        assertEquals(0,cantidadDeCeros);
    }

    @org.junit.jupiter.api.Test
        void arregloConNegativosSinCerosDevuelve0() {
        int[] x = {-6,-8,-1,-18};
        int cantidadDeCeros = ArrayOperations.numZero(x);
        assertEquals(0,cantidadDeCeros);
    }

    @org.junit.jupiter.api.Test
    void siTodosSon0DevuelveElTamanioDelArreglo() {
        int[] x = {0,0,0,0,0,0};
        int cantidadDeCeros = ArrayOperations.numZero(x);
        assertEquals(x.length,cantidadDeCeros);
    }
}