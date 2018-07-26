package whatever;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลข1ต้องได้ค่าเป็น1() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }

    @Test
    public void เลข2ต้องได้ค่าเป็น2() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }
    
    @Test
    public void เลข3ต้องได้ค่าเป็นFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข4ต้องได้ค่าเป็น4() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(4);
        assertEquals("4", result);
    }
    
    @Test
    public void เลข5ต้องได้ค่าเป็นBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void เลข6ต้องได้ค่าเป็นFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข7ต้องได้ค่าเป็น7() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(7);
        assertEquals("7", result);
    }
    
    @Test
    public void เลข8ต้องได้ค่าเป็น8() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(8);
        assertEquals("8", result);
    }
    
    @Test
    public void เลข9ต้องได้ค่าเป็นFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(9);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข10ต้องได้ค่าเป็นBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void เลข11ต้องได้ค่าเป็น11() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(11);
        assertEquals("11", result);
    }
    
    @Test
    public void เลข12ต้องได้ค่าเป็นFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(12);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข13ต้องได้ค่าเป็น13() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(13);
        assertEquals("13", result);
    }
    
    @Test
    public void เลข14ต้องได้ค่าเป็น14() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(14);
        assertEquals("14", result);
    }
    
    @Test
    public void เลข15ต้องได้ค่าเป็นFizzBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);
    }
  
}
