package org.example.app.controllers;

import org.example.app.entities.Product;
import org.example.app.models.ProductModel;
import org.example.app.utils.Rounder;
import org.example.app.views.ProductView;

public class ProductController {

    private final ProductModel model;
    private final ProductView view;
    private String name;
    private int quantity;
    private double price;

    public ProductController(ProductModel model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        mapDataToModel();
        setOutput(formOutput(getRoundValues(calcPayment())));
    }

    private void mapDataToModel() {
        String[] data = view.getData();
        Product product = new Product();

        product.setName(data[0]);
        name = product.getName();

        product.setQuantity(Integer.parseInt(data[1]));
        quantity = product.getQuantity();

        product.setPrice(Double.parseDouble(data[2]));
        price = product.getPrice();
    }

    private double calcPayment() {
        return model.calculatePayment(quantity, price);
    }

    private String getRoundValues(double calcValue) {
        return Rounder.roundValue(calcValue);
    }

    private String formOutput(String calcValue) {
        return "------------------------------\n" +
                "Product name: " + name + "\n" +
                "Purchase amount (USD): " + calcValue;
    }

    private void setOutput(String output) {
        view.getOutput(output);
    }
}
