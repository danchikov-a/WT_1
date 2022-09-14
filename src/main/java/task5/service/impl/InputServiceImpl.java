package task5.service.impl;

import task5.model.InputData;
import task5.service.InputService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputServiceImpl implements InputService {
    public int findK(InputData inputData) {
        int[] arr = inputData.getArray();

        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }

        if (arr.length == 1) {
            return 0;
        }

        return countNumbers(arr);
    }

    private int countNumbers(int[] numbers) {
        int resultCount = 0, currMaxNumber = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= currMaxNumber) {
                resultCount++;
            } else {
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }
}
