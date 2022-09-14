package task6;

import task6.controller.InputController;
import task6.model.InputData;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        InputData inputData = inputController.inputData();
        inputController.outputResult(inputData);
    }
}
