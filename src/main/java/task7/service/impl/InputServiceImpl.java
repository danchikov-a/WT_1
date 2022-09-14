package task7.service.impl;

import task7.model.InputData;
import task7.service.InputService;

public class InputServiceImpl implements InputService {

    @Override
    public int[] shellSort(InputData inputData) {
        int[] arr = inputData.getArray();

        int step = arr.length / 2;

        while (step > 0) {
            for (int i = step, j; i < arr.length; i++) {
                int value = arr[i];

                for (j = i - step; j >= 0 && arr[j] > value; j -= step) {
                    arr[j + step] = arr[j];
                }

                arr[j + step] = value;
            }

            step /= 2;
        }

        return arr;
    }
}
