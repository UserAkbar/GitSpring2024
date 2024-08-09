package string3;

public class MaxBlock {
    public int maxBlock(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int maxBlockLength = 1;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++;
            } else {
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
                currentBlockLength = 1;
            }
        }

        // Final check for the last block
        if (currentBlockLength > maxBlockLength) {
            maxBlockLength = currentBlockLength;
        }

        return maxBlockLength;
    }
}
