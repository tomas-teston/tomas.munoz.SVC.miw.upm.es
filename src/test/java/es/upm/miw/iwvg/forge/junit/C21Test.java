package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C21Test {

    private C21 c21;

    @BeforeEach
    void before() {
        this.c21 = new C21();
    }

    @Test
    void testm1() {
        assertEquals("m1", c21.m1());
    }

    @Test
    void testm2() {
        assertEquals("m2", c21.m2());
    }

}
