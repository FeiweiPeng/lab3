import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testintReverse(){
    int[] intlist = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(intlist));
  }

  @Test
  public void testintReverseInPlace(){
    int[] intlist2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(intlist2));
  }
  
  @Test
  public void testintAverage(){
    double[] intlist3 = {0.0, 2.0, 4, 5, 6, 8};
    double result = 25.0/5;
    assertEquals(result, ArrayExamples.averageWithoutLowest(intlist3),0.0001);
  }

  @Test
  public void testintAverageEmpty(){
    double[] emplist = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(emplist), 0.0001);
  }

  @Test
  public void testintAveragemulti(){
    double[] intlist4 = {3, 3, 4, 5, 3};
    double result1 = 9.0/2;
    assertEquals(result1, ArrayExamples.averageWithoutLowest(intlist4), 0.0001);
  }
}
