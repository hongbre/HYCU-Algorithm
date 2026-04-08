import java.util.ArrayList;

public class AddArrayList {
    public int addArrayList(ArrayList<Integer> arrayList) {
        // 예제에서는 arrayList.size()가 0보다 작거나 같을 때 이지만,
        // 0보다 작을 때는 없고, 0이랑 같을 때와 비어있는 것은 같다.
        if (arrayList.isEmpty()) {
            System.out.println("더이상 더할게 없습니다!");
            return 0;
        } else {
            // arrayList.subList()를 새로운 ArrayList<Integer> 객체로 전달한다.
            System.out.println(arrayList.getFirst() + " + " + arrayList.subList(1, arrayList.size()));
            return arrayList.getFirst() + this.addArrayList(new ArrayList<Integer>(arrayList.subList(1, arrayList.size())));
        }
    }
}
