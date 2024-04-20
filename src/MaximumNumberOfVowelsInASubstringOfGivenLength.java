public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private int getVowelCount(String str){
        int vowelCount = 0;
        for(char ch : str.toCharArray()){
            if(isVowel(ch)){
                vowelCount++;
            }
        }
        return vowelCount;
    }


    /*
    // naive
    public int maxVowels(String s, int k) {

        // naive way. Get all substrings of length 3
        int maxVowelsInSubstring = 0;
        for(int i = 0 ; i < s.length() - k + 1; i++){
            String subString = s.substring(i, i+k);
            int vowelCount = getVowelCount(subString);
            if(vowelCount > maxVowelsInSubstring){
                maxVowelsInSubstring = vowelCount;
            }
        }
        return  maxVowelsInSubstring;
    }
    */

    public int maxVowels(String s, int k) {

        int max = 0;
        int vowelCount = getVowelCount(s.substring(0, k));
        if(vowelCount > max){
            max = vowelCount;
        }

        for(int i = 1 ; i <= s.length() - k ; i++){
            vowelCount -= isVowel(s.charAt(i-1)) ? 1 : 0;
            vowelCount += isVowel(s.charAt(i+k-1)) ? 1 : 0;
            if(vowelCount > max){
                max = vowelCount;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        MaximumNumberOfVowelsInASubstringOfGivenLength obj = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        obj.maxVowels("abciiidef", 3);
    }
}
