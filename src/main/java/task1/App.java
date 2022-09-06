package task1;

import task1.controller.CalculatorController;

public class App {
    private static final String INPUT_X_TEXT = "Input x";
    private static final String INPUT_Y_TEXT = "Input y";

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        double x = controller.input(INPUT_X_TEXT);
        double y = controller.input(INPUT_Y_TEXT);
        System.out.println(controller.getResult(x, y));
    }
}