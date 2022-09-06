package task1.service.impl;

import task1.service.CalculatorService;

import static java.lang.Math.*;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculate(double x, double y) {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x / (1 + pow(x, 2) + pow(y, 2))));
        return numerator / denominator + x;
    }
}
