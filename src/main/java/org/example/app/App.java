package org.example.app;

import org.example.app.controllers.AppController;
import org.example.app.models.AppModel;
import org.example.app.views.AppView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {
        AppModel model = new AppModel();
        AppView view = new AppView();
        AppController controller = new AppController(model, view);
        controller.runApp();
    }
}
