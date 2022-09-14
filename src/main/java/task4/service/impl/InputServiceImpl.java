package task4.service.impl;

import task4.model.InputData;
import task4.service.InputService;

import java.util.stream.IntStream;

public class InputServiceImpl implements InputService {

    @Override
    public int[] findPrimeNumbers(InputData inputData) {
        int[] arr = inputData.getArray();

        return IntStream.range(0, arr.length)
                .filter(i -> isPrime(arr[i]))
                .toArray();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
