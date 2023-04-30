package org.example.app.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

   private Product product;
    private final String [] data = {"Apple", "11", "12.05"};

    @BeforeEach
    void setUp() {
        product = new Product();
        System.out.println("init class Product");
    }

    @Test
    @DisplayName("Test if object is not null.")
    void test_Product_Is_Not_Null() {
        product.setName(data[0]);
        product.setQuantity(Integer.parseInt(data[1]));
        product.setPrice(Double.parseDouble(data[2]));
        assertNotNull(product);
    }

    @Test
    @DisplayName("Test if object has data.")
    void test_Product_Has_Data() {
        product.setName(data[0]);
        product.setQuantity(Integer.parseInt(data[1]));
        product.setPrice(Double.parseDouble(data[2]));
        assertEquals("Apple", product.getName());
        assertEquals(11, product.getQuantity());
        assertEquals(12.05, product.getPrice());
    }

    @AfterEach
    void tearDown() {
        product = null;
    }
}
