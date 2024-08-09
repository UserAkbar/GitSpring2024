package string3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        String res = "";
        int len = string.length();
        for(int i = 1; i <= len; i++){
            StringBuilder rv = new StringBuilder(string.substring(0,i));
            rv.reverse();
            if(rv.toString().equals(string.substring(len-i))){
                res = rv.reverse().toString();
            }
        }
        return res;
    }
}
