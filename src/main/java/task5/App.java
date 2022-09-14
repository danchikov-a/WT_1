package task5;

import task5.controller.InputController;
import task5.model.InputData;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        InputData inputData = inputController.inputData();
        inputController.outputResult(inputData);
    }
}
