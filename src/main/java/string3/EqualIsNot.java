package string3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("is")){
                is++;
            }
        }
        for(int i = 0; i < str.length()-2; i++){
            if(str.substring(i,i+3).equals("not")){
                not++;
            }
        }
        return is==not;
    }
}
