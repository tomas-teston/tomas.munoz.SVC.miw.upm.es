package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {

    private C22 c22;

    @BeforeEach
    void before() {
        this.c22 = new C22();
    }

    @Test
    void testmA() {
        assertEquals("mA", c22.mA());
    }

}
