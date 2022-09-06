package task1;

import task1.controller.CalculatorController;
import task1.model.Arguments;

public class App {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        Arguments arguments = controller.inputData();
        System.out.println(controller.getResult(arguments.getX(), arguments.getY()));
    }
}