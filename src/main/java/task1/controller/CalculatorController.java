package task1.controller;

import task1.model.Arguments;
import task1.service.CalculatorService;
import task1.service.impl.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    private static final String INPUT_X_TEXT = "Input x";
    private static final String INPUT_Y_TEXT = "Input y";

    private final CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorServiceImpl();
    }

    public double getResult(double x, double y) {
        return calculatorService.calculate(x, y);
    }

    public double input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }

    public Arguments inputData() {
        double x = input(INPUT_X_TEXT);
        double y = input(INPUT_Y_TEXT);

        return new Arguments(x, y);
    }
}
