package org.example.app.models;

import org.example.app.controllers.ProductController;
import org.example.app.controllers.ProductDiscountController;
import org.example.app.views.ProductDiscountView;
import org.example.app.views.ProductView;

public class AppModel {

    public void runProductDiscount() {
        ProductIDiscountModel model = new ProductIDiscountModel();
        ProductDiscountView view = new ProductDiscountView();
        ProductDiscountController controller = new ProductDiscountController(model, view);
        controller.runApp();
    }

    public void runProduct() {
        ProductModel model = new ProductModel();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);
        controller.runApp();
    }
}
