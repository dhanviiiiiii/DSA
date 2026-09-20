import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean found = false;

                    // Check if already stored
                    for (int x = 0; x < k; x++) {

                        if (result[x] == nums1[i]) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        result[k] = nums1[i];
                        k++;
                    }

                    break; // Stop checking nums2 for this element
                }
            }
        }
    
        return Arrays.copyOf(result, k);
    }
}