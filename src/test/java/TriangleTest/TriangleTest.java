package TriangleTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import TriangleFunction.TriangleFunc;

public class TriangleTest {
    TriangleFunc triangleFunction = new TriangleFunc();
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAll() {
        logger.info("Выполнится перед всем тестовым набором");
    }

    @BeforeEach
    void setUp() {
        logger.info("Выполниться перед каждым тестом");
    }

    @Test
        //тест на позитивное число
    void testGivenEvenNumberWhenCheckIsEvenThenTrue() throws Exception {
        boolean result = triangleFunction.test(2);
        Assertions.assertTrue(result);//проверяем
    }

    @Test
    @RepeatedTest(10)
        //тест проверит негативный кейс
    void testGivenOddNumberWhenCheckIsEvenThenFalse() throws Exception {
        boolean result = triangleFunction.test(3);
        Assertions.assertFalse(result, "Проверяем, что число нечетное");//проверяем
    }

    @Test
    @DisplayName("Проверить функцию, isNumberPositive положительным числом")
    void testIsNumberPositive() throws Exception {
        Assertions.assertTrue(triangleFunction.test(1));
    }

    @Test
    void testIsPrimeFunctionWithNegativeNumber() throws Exception {
        Assertions.assertFalse(triangleFunction.test(-1));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123321", "abccba"})
    void testIsPalindromePositive(int word) throws Exception {
        Assertions.assertTrue(triangleFunction.test(word));
    }

    @ParameterizedTest
    @CsvSource({"123321,true", "123, false", "12321,true"})
    void testIsPalindrome(int word, boolean result) throws Exception {
        Assertions.assertEquals(triangleFunction.test(word), result);
    }

    @AfterEach
    void tearDown() {
        logger.debug("Выполниться после каждого теста");
        //      System.out.println("Выполниться после каждого теста");
    }

    @AfterAll
    static void AfterAll() {
        logger.debug("Выпонится после всех тестовых наборов");
        //      System.out.println("Выпонится после всех тестовых наборов");
    }

}

