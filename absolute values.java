import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        int[] numbers = {-5, 5, -3, 3, 2, -2, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int num : numbers) {
            set.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values: " + set.size());
        System.out.println("Distinct absolute values: " + set);
    }
}
