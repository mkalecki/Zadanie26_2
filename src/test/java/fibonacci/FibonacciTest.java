package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    private FibonacciCalc fibonacciCalc;

    @Before
    public void init(){
        fibonacciCalc = new FibonacciCalc();
    }

    @Test
    public void shouldReturn2from7 (){
        //given
        int input = 7;

        //when
        int result = fibonacciCalc.calculate(input);

        //then
        assertThat(result,is(2));
    }

    @Test
    public void shouldReturn10from9 (){
        //given
        int input = 9;

        //when
        int result = fibonacciCalc.calculate(input);

        //then
        assertThat(result,is(10));
    }

    @Test
    public void shouldReturn10from34 (){
        //given
        int input = 34;

        //when
        int result = fibonacciCalc.calculate(input);

        //then
        assertThat(result,is(10));
    }

    @Test
    public void shouldReturn2from8 (){
        //given
        int input = 8;

        //when
        int result = fibonacciCalc.calculate(input);

        //then
        assertThat(result,is(2));
    }

    @Test
    public void shouldReturn44from35 (){
        //given
        int input = 35;

        //when
        int result = fibonacciCalc.calculate(input);

        //then
        assertThat(result,is(44));
    }


}
