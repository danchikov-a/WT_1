package task8.service.impl;

import task8.model.InputData;
import task8.service.InputService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputServiceImpl implements InputService {
    public int[] getIndexes(InputData inputData) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer> a = Arrays.stream(inputData.getArray1()).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(inputData.getArray2()).boxed().collect(Collectors.toList());

        int indexOfLastElements = checkFirstElements(a, b, indexes);
        checkLastElements(indexOfLastElements, a, b, indexes);

        return indexes.stream().mapToInt(Integer::intValue).toArray();
    }

    private void checkLastElements(int i, List<Integer> a, List<Integer> b, List<Integer> indexes) {
        if (i != b.size()) {
            for (int j = i; j < b.size(); j++) {
                a.add(b.get(j));
                indexes.add(a.size() - 1);
            }
        }
    }

    private int checkFirstElements(List<Integer> a, List<Integer> b, List<Integer> indexes) {
        int i = 0;

        for (int j = 0; j < a.size(); j++) {
            if (i < b.size() && b.get(i) <= a.get(j)) {
                indexes.add(j);
                int lastElement = a.get(a.size() - 1);
                a.add(lastElement);

                for (int k = a.size() - 2; k > j; k--) {
                    a.set(k, a.get(k - 1));
                }

                a.set(j, b.get(i));
                i++;
            }
        }

        return i;
    }
}
