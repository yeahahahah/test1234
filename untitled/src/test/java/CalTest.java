import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void cal() {

        Cal a = new Cal();
        int expected=3;
        assertEquals(expected,a.Cal(1,2));
    }

    @Test
    void cal2() {


        int expected=5;
        assertEquals(expected,new Cal().Cal(4,1));
    }


    @Test
    void calMinus() {

        int expected=4;
        assertEquals(expected,new Cal().calMinus(7,3));

    }
}