package piwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     *
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     *
     * This method should do the following to generate an alphabet:
     *   1. Count the occurrence of each character a-z in trainingData.
     *   2. Compute the probability of each character a-z by taking
     *      (occurrence / total_num_characters).
     *   3. The output generated in step (2) is a PDF of the characters in the
     *      training set. Convert this PDF into a CDF for each character.
     *   4. Multiply the CDF value of each character by the base we are
     *      converting into.
     *   5. For each index 0 <= i < base,
     *      output[i] = (the first character whose CDF * base is > i)
     *
     * A concrete example:
     * 	 0. Input = {"aaaaa..." (302 "a"s), "bbbbb..." (500 "b"s),
     *               "ccccc..." (198 "c"s)}, base = 93
     *   1. Count(a) = 302, Count(b) = 500, Count(c) = 198
     *   2. Pr(a) = 302 / 1000 = .302, Pr(b) = 500 / 1000 = .5,
     *      Pr(c) = 198 / 1000 = .198
     *   3. CDF(a) = .302, CDF(b) = .802, CDF(c) = 1
     *   4. CDF(a) * base = 28.086, CDF(b) * base = 74.586, CDF(c) * base = 93
     *   5. Output = {"a", "a", ... (29 As, indexes 0-28),
     *                "b", "b", ... (46 Bs, indexes 29-74),
     *                "c", "c", ... (18 Cs, indexes 75-92)}
     *
     * The letters should occur in lexicographically ascending order in the
     * returned array.
     *   - {"a", "b", "c", "c", "d"} is a valid output.
     *   - {"b", "c", "c", "d", "a"} is not.
     *
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     *
     * If base < 0, return null.
     *
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     *
     * @param base A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency
     *                     counts. This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     *         digit should be translated into.
     */
    public static char[] generateFrequencyAlphabet(int base,
                                                   String[] trainingData) {
        // TODO: Implement (Problem f)

        String[] trainingdata = trainingData.clone();
        if (base < 0) {
            return null;
        }

        String s = "";
        for (String str: trainingdata) {
            s += str;
        }


        char[] chararr = s.toCharArray();
        ArrayList<Character> chararrls = new ArrayList<Character>();
        for (char element: chararr) {
            if ((int) element >= 97 && (int) element <= 122) {
                chararrls.add(element);
            }
        }
        Collections.sort(chararrls);
        HashMap<Character, Integer> cdf = new HashMap<>();

        for (Character element: chararrls) {
            if (cdf.containsKey(element)) {
                cdf.put(element, cdf.get(element) + 1);
            } else {
                cdf.put(element, 1);
            }
        }
        Object[] characters = cdf.keySet().toArray();
        char[] charorder = new char[characters.length];
        int charorderind =0;


        for (Object x: characters) {
            charorder[charorderind] = (char) x;
            charorderind++;
        }
        Arrays.sort(charorder);
        int[] PDF = new int[characters.length];
        int pdfind = 0;
        for (Character x: charorder) {
            PDF[pdfind] = cdf.get(x);
            pdfind++;
        }

        int[] CDFint = new int[PDF.length];
        int CDFind = 0;
        int sum = 0;
        for (int x: PDF) {
            sum += x;
            CDFint[CDFind] = sum;
            CDFind++;
        }

        int arrayLength = chararrls.size();
        double[] CDFdouble = new double[characters.length];
        for (int i = 0; i < PDF.length; i++) {
            CDFdouble[i] = (double) CDFint[i] * (base)/arrayLength;

        }
        //show the arr
        int ansind = 0;
        char[] ans = new char[base];

        for(int i =0; i < PDF.length; i++) {
            while (ansind < CDFdouble[i]) {
                ans[ansind] = charorder[i];
                ansind++;
            }
        }


        return ans;



    }
}
