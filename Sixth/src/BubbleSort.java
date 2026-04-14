import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            // 교체 여부
            boolean swap = false;

            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                // 뒤 나올 숫자가 작으면 교체
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    Collections.swap(arrayList, j, j + 1);
                    swap = true;
                }
            }

            // 교체 여부가 false면 정렬이 완료된 것으로 판단하고 탈출
            if (!swap) {
                break;
            }
        }

        return arrayList;
    }
}
