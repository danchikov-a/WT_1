package task3.controller;

import task3.model.InputData;
import task3.service.InputService;
import task3.service.impl.InputServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class InputController {
    private static final String INPUT_A_TEXT = "Input a";
    private static final String INPUT_B_TEXT = "Input b";
    private static final String INPUT_H_TEXT = "Input h";

    private final InputService inputService;

    public InputController() {
        this.inputService = new InputServiceImpl();
    }

    public InputData inputData() {
        int a = input(INPUT_A_TEXT);
        int b = input(INPUT_B_TEXT);
        int h = input(INPUT_H_TEXT);

        return new InputData(a, b, h);
    }

    private int input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }

    public void outputResult(InputData inputData) {
        Map<Integer, Double> resultMap = inputService.calculate(inputData);


        for (Map.Entry<Integer, Double> entry : resultMap.entrySet()) {
            System.out.printf("%d|%f\n", entry.getKey(), entry.getValue());
            System.out.println("-------------");
        }
    }
}
