package string2;

public class DoubleChar {

    public String doubleChar(String str) {
        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            sb1.append(ch).append(ch);
        }
        return sb1.toString();
    }
}
