import java.util.*;

public class StringCompressor {
    private String str;

    public StringCompressor(String str) {
        this.str = str;
    }

    private void printCompressedString() {
        StringBuffer compressedString = new StringBuffer();

        for (int l = 0, r = 0; r < this.str.length(); l = r) {

            while (r < this.str.length()){
                if (this.str.charAt(l) != this.str.charAt(r))
                    break;
                r++;
            }
            int nOfOccurrences = r - l;
            compressedString.append(str.charAt(l));
            compressedString.append(nOfOccurrences);
        }
        System.out.println(compressedString);
    }

    public static void main(String[] args) {
        String str = "abbbbddddeefggg";
        StringCompressor compressor = new StringCompressor(str);
        compressor.printCompressedString();
    }
}
