package task1.controller;

import task1.service.CalculatorService;
import task1.service.impl.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
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
}
