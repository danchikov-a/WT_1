package task7;

import task7.controller.InputController;
import task7.model.InputData;

public class App {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        InputData inputData = inputController.inputData();
        inputController.outputResult(inputData);
    }
}
