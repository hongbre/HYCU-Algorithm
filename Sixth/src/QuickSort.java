import java.util.ArrayList;

public class QuickSort {
    public ArrayList<Integer> quickSort(ArrayList<Integer> arrayList) {
        // 배열의 크기가 1보다 작으면 그대로 리턴
        if (arrayList.size() <= 1) {
            return arrayList;
        }

        // 배열의 첫번째를 pivot로 설정
        int pivot = arrayList.getFirst();

        // pivot 보다 작은 값이 들어갈 left와 큰 값이 들어갈 right
        ArrayList<Integer> leftArray = new ArrayList<Integer>();
        ArrayList<Integer> rightArray = new ArrayList<Integer>();

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > pivot) {
                rightArray.add(arrayList.get(i));
            } else {
                leftArray.add(arrayList.get(i));
            }
        }

        // pivot 보다 작은 값이 들어간 left 배열을 재귀로 호출하고,
        // pivot을 넣고, pivot 보다 큰 값이 들어간 right 배열을 재귀로 호출
        ArrayList<Integer> mergeArray = new ArrayList<Integer>(this.quickSort(leftArray));
        mergeArray.add(pivot);
        mergeArray.addAll(this.quickSort(rightArray));

        return mergeArray;
    }
}
