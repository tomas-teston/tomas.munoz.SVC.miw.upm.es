package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C52Test {

    private C52 c52;

    @BeforeEach
    void before() {
        this.c52 = new C52();
    }

    @Test
    void testmA() {
        assertEquals("mA", c52.mA());
    }

}
