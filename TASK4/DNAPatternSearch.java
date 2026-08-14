import java.io.*;
import java.util.*;

public class DNAPatternSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String pattern = br.readLine();

        if (text == null || pattern == null || pattern.length() == 0) return;

        List<Integer> matches = kmpSearch(text, pattern);
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < matches.size(); i++) {
            output.append(matches.get(i)).append(i == matches.size() - 1 ? "" : " ");
        }
        System.out.println(output.toString());
    }

    private static List<Integer> kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPS(pattern);
        List<Integer> result = new ArrayList<>();

        int i = 0; 
        int j = 0; 
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    private static int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}