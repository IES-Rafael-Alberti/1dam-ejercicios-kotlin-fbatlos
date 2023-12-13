import Calculator.add
import Calculator.multiply
import Calculator.resta

internal class CalculatorTest {
    @org.junit.jupiter.api.Test
    fun add() {
        org.junit.jupiter.api.Assertions.assertEquals(4.0, add(2.0, 2.0))
    }

    @org.junit.jupiter.api.Test
    fun resta() {
        org.junit.jupiter.api.Assertions.assertEquals(3.0, resta(-2.0, -5.0))
    }

    @org.junit.jupiter.api.Test
    fun multiply() {
        org.junit.jupiter.api.Assertions.assertAll(
            org.junit.jupiter.api.function.Executable {
                org.junit.jupiter.api.Assertions.assertEquals(
                    4.0,
                    multiply(2.0, 2.0)
                )
            },
            org.junit.jupiter.api.function.Executable {
                org.junit.jupiter.api.Assertions.assertEquals(
                    4.0,
                    multiply(-4.0, -1.0)
                )
            },
            org.junit.jupiter.api.function.Executable {
                org.junit.jupiter.api.Assertions.assertEquals(
                    8.0,
                    multiply(4.0, 2.0)
                )
            },
            org.junit.jupiter.api.function.Executable {
                org.junit.jupiter.api.Assertions.assertEquals(
                    20.0,
                    multiply(10.0, 2.0)
                )
            }
        )
    }
}