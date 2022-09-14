package task4;

import task4.controller.InputController;
import task4.model.InputData;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        InputData inputData = inputController.inputData();
        inputController.outputResult(inputData);
    }
}
