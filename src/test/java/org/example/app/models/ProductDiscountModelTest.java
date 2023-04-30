package org.example.app.models;

import org.junit.jupiter.api.*;

public class ProductDiscountModelTest {

    private ProductIDiscountModel product;
    private final static int DISCOUNT_RATE = 10;
    double payment;
    double discount;


    @BeforeEach
    void setUp() {
        product = new ProductIDiscountModel();
        System.out.println("init class ProductIDiscountModel");
    }

    @Test
    @DisplayName("Test of payment calculation")
    void test_calculate_Payment() {
        int quota = 2;
        double price = 21.5;
        double payment = product.calculatePayment(quota, price);
        double expectedPayment = quota * price;
        Assertions.assertEquals(expectedPayment, payment);
    }

    @Test
    @DisplayName("Test for calculating the amount of the discount")
    void test_calculate_Amount_Discount() {
        double discount = product.calculateDiscount(payment);
        double expectedDiscount = payment * DISCOUNT_RATE/100;
        Assertions.assertEquals(expectedDiscount, discount);
    }

    @Test
    @DisplayName("Test of payment calculation with discount")
    void test_calculate_Payment_With_Discount() {
        double discountPayment = product.calculateDiscountPayment(payment, discount);
        double expectedPaymentDiscount = payment - discount;
        Assertions.assertEquals(expectedPaymentDiscount, discountPayment);
    }

    @AfterEach
    void tearDown() {
        product = null;
    }
}
