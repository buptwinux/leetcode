import java.util.*; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //时间复杂度为n方不符合要求
        /*Stack<String> stack = new Stack<String>();
        int maxLength = 0;
        int counter = 0;

        for (int i = 0, j = 0, len = s.length(); i < len; i++) {
            if (stack.search(String.valueOf(s.charAt(i))) > 0) {
                while(!stack.empty()) {
                    stack.pop(); 
                    counter++;
                }

                maxLength = counter > maxLength ? counter : maxLength; 
                counter = 0;
                i = ++j;
            } 

            stack.push(String.valueOf(s.charAt(i))); 
        }

        maxLength = maxLength > stack.size() ? maxLength : stack.size();*/

        return maxLength;
    }

    public static void main(String args[]) {
        //TODO
        Solution s = new Solution();
        int maxLength = s.lengthOfLongestSubstring("au");

        System.out.println(maxLength);
    }
}
