package task2;

import task2.controller.InputController;
import task2.model.Point;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        Point point = inputController.inputData();
        System.out.println(inputController.getResult(point));
    }
}
