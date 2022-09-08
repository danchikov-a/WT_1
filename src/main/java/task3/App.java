package task3;

import task3.controller.InputController;
import task3.model.InputData;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        InputData inputData = inputController.inputData();
        inputController.outputResult(inputData);
    }
}
