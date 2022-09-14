package task6.service.impl;

import task6.model.InputData;
import task6.service.InputService;

public class InputServiceImpl implements InputService {

    @Override
    public int[][] createMatrix(InputData inputData) {
        int[] arr = inputData.getArray();
        int length = arr.length;
        int[][] matrix = new int[length][length];
        int firstElement;

        for (int i = 0; i < length; i++) {
            System.arraycopy(arr, 0, matrix[i], 0, length);
            firstElement = arr[0];
            System.arraycopy(arr, 1, arr, 0, length - 1);
            arr[length - 1] = firstElement;
        }

        return matrix;
    }
}
