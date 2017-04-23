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

        //使用hashMap降低时间复杂度
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(); 
        int i = -1;
        int len = 0;

        for (int j = 0; j < s.length(); j++) {
            if (hashMap.containsKey(String.valueOf(s.charAt(j)))) {
                int current = hashMap.get(String.valueOf(s.charAt(j)));
                i = i > current ? i : current;
            }

            hashMap.put(String.valueOf(s.charAt(j)), j);  
            len = j - i > len ? j - i : len;
        }

        return len;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        int maxLength = s.lengthOfLongestSubstring("");

        System.out.println(maxLength);
    }
}
