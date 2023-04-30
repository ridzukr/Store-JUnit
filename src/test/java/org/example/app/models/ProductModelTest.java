package org.example.app.models;

import org.junit.jupiter.api.*;

public class ProductModelTest {

private ProductModel product;

    @BeforeEach
    void setUp() {
        product = new ProductModel();
        System.out.println("init class ProductModel");
    }

    @Test
    @DisplayName("Test of payment calculation if quota is not zero")
    void test_calculate_Payment_Quota_Not_Zero(){
        double result = product.calculatePayment(2,20.5);
        Assertions.assertEquals(41.0, result);
    }

    @Test
    @DisplayName("Test of payment calculation if quota is zero")
    void test_calculate_Payment_Quota_Zero(){
        double result = product.calculatePayment(0,20.5);
        Assertions.assertEquals(0, result);
    }

    @AfterEach
    void tearDown() {
        product = null;
    }
}
