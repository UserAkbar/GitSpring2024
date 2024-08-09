package string3;

public class SumDigits {
    public int sumDigits(String str) {
        int res = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                res+=Integer.parseInt(str.substring(i,i+1));
            }
        }
        return res;
    }
}
