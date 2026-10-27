package com.example.invoice;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class InvoiceCalculatorTest {
    InvoiceCalculator invoice = new InvoiceCalculator();
    @Test
    void testProductAmount() {
        assertEquals(5000,
                invoice.calculateProductAmount(2500, 2));
    }
@Test
void testTenPercentDiscount() {
assertEquals(500,
invoice.calculateDiscount(5000));
}
 @Test
 void testFivePercentDiscount() {
assertEquals(150,
invoice.calculateDiscount(3000));
}
 @Test
 void testNoDiscount() {
 assertEquals(0,
 invoice.calculateDiscount(1000));
 }
@Test
 void testGST() {
 assertEquals(180,
invoice.calculateGST(1000));
 }
 @Test
 void testFinalAmount() {
 assertEquals(5310,
 invoice.calculateFinalAmount(5000));
 }
}
