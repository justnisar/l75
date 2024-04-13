public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int max = 0;
        for(char ch : s.toCharArray()){
            int index = t.indexOf(ch, max);
            if(index == -1 || index < max){
                return false;
            }
            max = index+1;
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequence obj = new IsSubsequence();
        obj.isSubsequence("abc", "ahbgdc");
    }
}
