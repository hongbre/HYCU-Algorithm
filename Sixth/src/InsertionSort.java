import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> insertionSort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // i 보다 뒤에서 시작해서 맨 앞까지 비교하고, 뒤에가 작으면 교체
                if (arrayList.get(j) < arrayList.get(j - 1)) {
                        Collections.swap(arrayList, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arrayList;
    }
}
