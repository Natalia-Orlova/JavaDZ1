package lesson1;

public class TaskOne {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m - 1;
        int j = n - 1;
        int copyInd = nums1.length - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[copyInd] = nums1[i];
                i--;
            }
            else {
                nums1[copyInd] = nums2[j];
                j--;
            }
            copyInd--;
        }
    }
}
