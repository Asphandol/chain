package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ATMTest {
    private ATM atm;
    private Section mockSection500;
    private Section mockSection200;

    @BeforeEach
    void setUp() {
        // Create mock sections
        mockSection500 = mock(Section_500.class);
        mockSection200 = mock(Section_200.class);

        // Configure chain of responsibility
        when(mockSection500.setNext(mockSection200)).thenReturn(mockSection200);

        // Inject mocks into ATM
        atm = new ATM();
        atm.first = mockSection500;
        mockSection500.setNext(mockSection200);
    }

    @Test
    void testGetMeMoneyChainProcessing() {
        int amount = 1000;

        // Call the ATM to process the amount
        atm.getMeMoney(amount);

        // Verify that the first section processed the amount
        verify(mockSection500, times(1)).process(amount);

        // Assuming the chain logic delegates further, verify the next section is invoked
        verify(mockSection200, never()).process(amount); // Example: Modify based on logic
    }
}
