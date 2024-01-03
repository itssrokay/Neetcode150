// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> hmap = new HashMap<>();

//         for (int element : nums) {
//             hmap.put(element, hmap.getOrDefault(element, 0) + 1);
//         }

//         int[] arr = new int[nums.length];

//         for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
//             arr[entry.getValue()] = entry.getKey();
//         }

//         int[] newArr = new int[k];
//         int i, j;

//         for (i = nums.length - 1, j = 0; i >= 0 && j < k; i--, j++) {
//             if (arr[i] != 0) {
//                 newArr[j] = arr[i];
//             }
//         }

//         return newArr;


//     }
// }
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int element : nums) {
            hmap.put(element, hmap.getOrDefault(element, 0) + 1);
        }

        List<Integer>[] frequencyList = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int frequency = entry.getValue();
            if (frequencyList[frequency] == null) {
                frequencyList[frequency] = new ArrayList<>();
            }
            frequencyList[frequency].add(entry.getKey());
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for (int i = frequencyList.length - 1; i >= 0 && resultIndex < k; i--) {
            if (frequencyList[i] != null) {
                for (int num : frequencyList[i]) {
                    result[resultIndex++] = num;
                    if (resultIndex == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
