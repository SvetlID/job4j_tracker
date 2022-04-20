package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class FunctionSimpleTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionSimple.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResults() {
        List<Double> result = FunctionSimple.diapason(5, 8, x -> x * x + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));

    }

    @Test
    public void whenExponFunctionThenExponResults() {
        List<Double> result = FunctionSimple.diapason(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(result, is(expected));

    }
}