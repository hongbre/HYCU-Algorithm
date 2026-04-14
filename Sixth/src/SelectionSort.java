import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> selectionSort(ArrayList<Integer> arrayList) {
        int low;

        for (int i = 0; i < arrayList.size(); i++) {
            // 첫번째 인덱스를 low(최저값) 인덱스로 설정
            low = i;

            for (int j = i + 1; j < arrayList.size(); j++) {
                // low 인덱스랑 비교해서 작으면 low 인덱스로 설정
                if (arrayList.get(low) > arrayList.get(j)) {
                    low = j;
                }
            }

            // low 인덱스랑 i 인덱스랑 교체
            Collections.swap(arrayList, low, i);
        }

        return arrayList;
    }
}
