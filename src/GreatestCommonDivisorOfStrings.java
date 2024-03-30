public class GreatestCommonDivisorOfStrings {

    private boolean isDivisible(String str1, String str2){

        // Length of str2 is smaller than str1
        int length = str2.length();
        if(str1.length() % length != 0){
            return false;
        }

        for(int i = 0; i + length <= str1.length(); i+=length){
            if(!str2.equals(str1.substring(i,i+length))){
                return false;
            }
        }

        return true;
    }

    public String gcdOfStrings(String str1, String str2) {

        String smaller = str1, larger = str2;
        if(str1.length() > str2.length()){
            smaller = str2;
            larger = str1;
        }

        for(int end = smaller.length() ; end >= 1 ; end--){
            String divisor = smaller.substring(0, end);
            if(isDivisible(smaller, divisor) && isDivisible(larger, divisor)){
                return divisor;
            }
        }

        return "";
    }
}
