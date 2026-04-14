import java.util.ArrayList;

public class SixthMain {
    public static void main(String[] args) {
        // 버블 정렬 테스트용 ArrayList에 10개의 랜덤 숫자 삽입
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList1.add((int)(Math.random() * 100));
        }

        System.out.println("arrayList1 = " + arrayList1);

        // 버블 정렬 수행
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.bubbleSort(arrayList1));

        // 선택 정렬 테스트용 ArrayList에 10개의 랜덤 숫자 삽입
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList2.add((int)(Math.random() * 100));
        }

        System.out.println("arrayList2 = " + arrayList2);

        // 선택 정렬 수행
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(selectionSort.selectionSort(arrayList2));

        // 삽입 정렬 테스트용 ArrayList에 10개의 랜덤 숫자 삽입
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList3.add((int)(Math.random() * 100));
        }

        System.out.println("arrayList3 = " + arrayList3);

        // 삽입 정렬 수행
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(insertionSort.insertionSort(arrayList3));

        // 퀵 정렬 테스트용 ArrayList에 10개의 랜덤 숫자 삽입
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList4.add((int)(Math.random() * 100));
        }

        System.out.println("arrayList4 = " + arrayList4);

        // 퀵 정렬 수행
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.quickSort(arrayList4));

        // 셸 정렬, 머지 정렬!!!
    }
}
