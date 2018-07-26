package whatever;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void ส่ง2ได้เลข2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2",result);
    }
    @Test
    public void ส่ง3ได้เลข3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3",result);
    }
    
    @Test
    public void ส่ง4ได้เลข22() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22",result);
    }
    
    @Test
    public void ส่ง6ได้เลข23() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23",result);
    }
    @Test
    public void ส่ง8ได้เลข222() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("222",result);
    }
    @Test
    public void ส่ง10ได้เลข25() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25",result);
    }
    @Test
    public void ส่ง12ได้เลข223() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("223",result);
    }

}
