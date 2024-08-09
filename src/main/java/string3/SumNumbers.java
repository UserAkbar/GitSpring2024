package string3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                if(str.length()-1 > i && Character.isDigit(str.charAt(i+1))){
                    res+=str.charAt(i);
                }else{
                    res+=str.charAt(i);
                    sum +=Integer.parseInt(res);
                    res = "";
                }
            }
        }
        return sum;
    }

}
