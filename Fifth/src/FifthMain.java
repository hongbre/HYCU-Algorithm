import java.util.ArrayList;

public class FifthMain {
    public static void main(String[] args) {
        // Factorial 객체 생성 후 테스트
        Factorial factorialObject = new Factorial();

        // 2! = 1 * 2
        System.out.println("2! = " + factorialObject.factorialFunction(2));
        // 4! = 1 * 2 * 3 * 4
        System.out.println("4! = " + factorialObject.factorialFunction(4));
        // 6! = 1 * 2 * 3 * 4 * 5 * 6
        System.out.println("6! = " + factorialObject.factorialFunction(6));

        // 연습문제?
        // 다음 배열에 정수가 저장되어 있을 때, 배열의 합을 출력하는 프로그래밍을 재귀를 사용해 작성하시오.

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i + 1);
        }

        // AddArrayList 객체 생성 후 테스트
        AddArrayList addArrayListObject = new AddArrayList();

        // arrayList의 모든 값을 더한다.
        System.out.println("arrayList = " + arrayList);
        System.out.println(addArrayListObject.addArrayList(arrayList));

        // 하노이의 탑 문제 풀기!!!
    }
}
