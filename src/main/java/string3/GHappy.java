package string3;

public class GHappy {
    public boolean gHappy(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='g'){
                boolean happy = false;
                if(i > 0 && str.charAt(i-1)=='g'){
                    happy = true;
                }
                if(i < str.length()-1 && str.charAt(i+1)=='g'){
                    happy = true;
                }
                if(!happy){
                    return false;
                }
            }
        }
        return true;
    }

}
