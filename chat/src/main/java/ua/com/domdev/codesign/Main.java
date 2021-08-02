package ua.com.domdev.codesign;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Result in main " + centuryFromYear(1899));

        if (checkPalindrome("212321")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    private static int centuryFromYear(int year) {
        System.out.println("Result in centuryFromYear " + Math.ceil(year/100));
        return (int) Math.ceil((double) year/100);
    }

    private static boolean checkPalindrome(String inputString) {
        boolean result = true;
        int lastSymbolNumber = inputString.length() - 1;
        int loopLength = (int) Math.ceil((double) lastSymbolNumber/2);
        inputString.substring(1, 1);

        for (int i = 0; i < loopLength; i++) {
//            if (!inputString.substring(i, i).equals(inputString.substring(lastSymbolNumber-i, lastSymbolNumber-i))) {
//                result = false;
//                break;
//            }
            if (inputString.charAt(i) != inputString.charAt(lastSymbolNumber-i)) {
                result = false;
                break;
            };
        }
        return result;
    }
}
