package task8.controller;

import task8.model.InputData;
import task8.service.InputService;
import task8.service.impl.InputServiceImpl;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class InputController {
    private static final String INPUT_SIZE_FIRST_ARRAY_TEXT = "Input size of first array";
    private static final String INPUT_SIZE_SECOND_ARRAY_TEXT = "Input size of second array";
    private static final String INPUT_TEXT = "Input number";
    private final InputService inputService;

    public InputController() {
        this.inputService = new InputServiceImpl();
    }

    public InputData inputData() {
        int[] arr1 = getArray(INPUT_SIZE_FIRST_ARRAY_TEXT);
        int[] arr2 = getArray(INPUT_SIZE_SECOND_ARRAY_TEXT);

        return new InputData(arr1, arr2);
    }

    private int[] getArray(String text) {
        int n = input(text);
        return IntStream.range(0, n).map(i -> input(INPUT_TEXT)).toArray();
    }

    private int input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);

        return scanner.nextInt();
    }

    public void outputResult(InputData inputData) {
        int[] resultArray = inputService.getIndexes(inputData);

        System.out.println(Arrays.toString(resultArray));
    }
}
