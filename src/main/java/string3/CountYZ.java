package string3;

public class CountYZ {
    public int countYZ(String str) {
        String sb = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(sb.charAt(i)=='z' || sb.charAt(i)=='y'){
                if( i == sb.length()-1 || Character.isLetter(sb.charAt(i+1))==false ){
                    count++;
                }
            }
        }
        return count;
    }
}
