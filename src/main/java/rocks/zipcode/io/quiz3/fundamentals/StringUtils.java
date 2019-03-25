package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String str1 = str.substring(0, indexToCapitalize);
        String str2 =Character.toString(Character.toUpperCase(str.charAt(indexToCapitalize)));
        String str3 = str.substring(indexToCapitalize + 1);
        return  str1 +str2 + str3;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        if (characterToCheckFor.equals(baseString.charAt(indexOfString))) {
            return true;
        }
        return false;
    }
    public static String[] getAllSubStrings(String string) {


        Set<String> myList = new HashSet<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String str1 = string.substring(i, j);
                myList.add(str1);
            }
        }
            String[] myArray = new String[myList.size()];

                return myList.toArray(myArray);

    }

    public static Integer getNumberOfSubStrings(String input){

        int n = input.length();
      return (n * (n + 1) / 2)-1;

    }
}
