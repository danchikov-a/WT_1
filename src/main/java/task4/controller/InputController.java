package task4.controller;

import task4.model.InputData;
import task4.service.InputService;
import task4.service.impl.InputServiceImpl;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class InputController {
    private static final String INPUT_N_TEXT = "Input N";
    private static final String INPUT_TEXT = "Input number";
    private final InputService inputService;

    public InputController() {
        this.inputService = new InputServiceImpl();
    }

    public InputData inputData() {
        int n = input(INPUT_N_TEXT);
        int[] arr = IntStream.range(0, n).map(i -> input(INPUT_TEXT)).toArray();

        return new InputData(arr);
    }

    private int input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);

        return scanner.nextInt();
    }

    public void outputResult(InputData inputData) {
        int[] resultArray = inputService.findPrimeNumbers(inputData);

        System.out.println(Arrays.toString(resultArray));
    }
}
