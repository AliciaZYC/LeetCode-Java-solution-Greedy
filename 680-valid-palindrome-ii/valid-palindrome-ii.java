class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                if (isPalindrome(s,left+1,right)) return true;
                if (isPalindrome(s,left,right-1)) return true;
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}