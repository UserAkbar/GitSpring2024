package string3;

public class SameEnds {
    public String sameEnds(String string) {
        int len = string.length();
        String result = "";

        for(int i = 1; i <= len / 2; i++){
            if(string.substring(0, i).equals(string.substring(len - i))){
                result = string.substring(0, i);
            }
        }
        return result;
    }
}
