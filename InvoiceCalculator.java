package com.example.invoice;
public class InvoiceCalculator {
 public double calculateProductAmount(double price, int quantity) {
 return price * quantity;
 }
 public double calculateDiscount(double amount) {
 if (amount >= 5000) {
 return amount * 0.10;
} else if (amount >= 2000) {
 return amount * 0.05;
 }
return 0;
}
public double calculateGST(double amount) {
        return amount * 0.18;
    }

    public double calculateFinalAmount(double amount) {
        double discount = calculateDiscount(amount);
        double discountedAmount = amount - discount;
        double gst = calculateGST(discountedAmount);
        return discountedAmount + gst;
    }
}
