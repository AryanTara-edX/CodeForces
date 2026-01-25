import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner; // Import Scanner for input

public class TwoSum {

    // --- LOGIC ---
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);
        }
        return new int[]{};
    }

    // --- INTERACTIVE MAIN METHOD ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoSum solver = new TwoSum();

        // 1. Ask for size
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        int[] userNums = new int[n];

        // 2. Ask for numbers
        System.out.println("Enter " + n + " numbers (space separated):");
        for (int i = 0; i < n; i++) {
            userNums[i] = scanner.nextInt();
        }

        // 3. Ask for target
        System.out.println("Enter target:");
        int userTarget = scanner.nextInt();

        // 4. Solve and Print
        int[] result = solver.twoSum(userNums, userTarget);
        System.out.println("Result: " + Arrays.toString(result));
        
        scanner.close();
    }
}