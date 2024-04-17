public class ReverseVowelsOfAString {

    private boolean isVowel(char ch){
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {
        char[] s_arr = s.toCharArray();
        int i = 0 , j = s_arr.length - 1;
        while(i < j){
            while(i < s_arr.length && ! isVowel(s_arr[i])){
                i++;
            }
            while(j >= 0 && ! isVowel(s_arr[j])){
                j--;
            }
            if(i < j){
                char temp = s_arr[i];
                s_arr[i] = s_arr[j];
                s_arr[j] = temp;
            }
            i++;
            j--;
        }
        return new String(s_arr);
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString obj = new ReverseVowelsOfAString();
        obj.reverseVowels("leetcode");
    }
}
