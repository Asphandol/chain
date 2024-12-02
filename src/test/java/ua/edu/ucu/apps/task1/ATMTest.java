package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @BeforeEach
    void setUp() {
        // Initialize the ATM object before each test
        atm = new ATM();
    }

    @Test
    void testGetMeMoneyValidAmount() {
        // Test with a valid amount divisible by sections (e.g., 1000)
        // Assuming the `process` method prints or processes correctly
        assertDoesNotThrow(() -> atm.getMeMoney(1000), "ATM should process valid amounts");
    }

    @Test
    void testGetMeMoneyInvalidAmount() {
        // Test with an invalid amount (e.g., 700, if not fully divisible by 500/200)
        // Assuming the behavior on invalid inputs throws an exception or handles gracefully
        assertDoesNotThrow(() -> atm.getMeMoney(700), "ATM should handle invalid amounts gracefully");
    }

    @Test
    void testGetMeMoneyZeroAmount() {
        // Test with zero
        assertDoesNotThrow(() -> atm.getMeMoney(0), "ATM should handle zero amounts gracefully");
    }

    @Test
    void testGetMeMoneyNegativeAmount() {
        // Test with a negative amount
        assertThrows(IllegalArgumentException.class, () -> atm.getMeMoney(-100), "ATM should throw exception for negative amounts");
    }
}
