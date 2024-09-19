package org.example;

import org.junit.jupiter.api.*;
import org.example.Calculator;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculatorTest {
    private Calculator calc;
    private static final org.slf4j.Logger log=org.slf4j.LoggerFactory.getLogger(CalculatorTest.class);

    @BeforeAll
    static void init(){
        log.info("Test begins");
    }
    @BeforeEach
    void setUp(){
        calc=new Calculator();
        log.info("Calculator object created");
    }
    @AfterEach
    void tearDown(){
        calc=null;
        log.info("Calculator object destroyed");
    }
    @AfterAll
    static void End(){
        log.info("Test ends");
    }

    @EnabledOnJre(JRE.JAVA_21)
    @Nested
    class Divide {
        @Test
        void divideTest()

        {
            int result = calc.add(20, 50);
            Assertions.assertEquals(70, result);
            Assertions.assertEquals(5, calc.divide(10, 2));
            Assertions.assertEquals(-10, calc.divide(100, -10));
            Assertions.assertEquals(0, calc.divide(0, 2));

        }
        @Test
            void divideTestWithException(){
                Assertions.assertThrows(ArithmeticException.class,()-> calc.divide(10,0));

            }

    }

}
