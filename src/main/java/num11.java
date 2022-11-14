import java.util.jar.JarEntry;

public class num11 {
    class Solution {
        public int maxArea(int[] height) {
            int maxNum = 0;

            for (int i = 0; i < height.length - 1; i++) {
                for (int j = height.length - 1; j > i; j--) {

                    int littleHeight = 0;
                    //两个柱子之间的距离
                    int length = j - i;

                    //求出两个柱子最矮的那个
                    if (height[i] > height[j]) {
                        littleHeight = height[j];
                    } else {
                        littleHeight = height[i];
                    }

                    if (littleHeight * length > maxNum) {
                        maxNum = littleHeight * length;
                    }
                }
            }

            return maxNum;
        }
    }
}
