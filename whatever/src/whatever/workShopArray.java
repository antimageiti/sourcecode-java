package whatever;

import static org.junit.Assert.*;

import org.junit.Test;

public class workShopArray {

    @Test
    public void ส่ง1ได้1() {
        Sort sort = new Sort();
        int[] input = {1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1}, sorted);
    }
    @Test
    public void ส่ง12ได้12() {
        Sort sort = new Sort();
        int[] input = {1,2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    @Test
    public void ส่ง21ได้12() {
        Sort sort = new Sort();
        int[] input = {2,1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    @Test
    public void ส่ง123ได้123() {
        Sort sort = new Sort();
        int[] input = {1,2,3};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3}, sorted);
    }
    @Test
    public void ส่ง312ได้123() {
        Sort sort = new Sort();
        int[] input = {3,1,2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3}, sorted);
    }
    @Test
    public void ส่ง54321ได้12345() {
        Sort sort = new Sort();
        int[] input = {5,4,3,2,1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3,4,5}, sorted);
    }

}
