package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        str =str.toLowerCase();

        List<String> myList = new ArrayList<>();

        for(int i =0 ; i< str.length() ;i++){

            if(Character.isLetter(str.charAt(i))){

                String str1 = StringUtils.capitalizeNthCharacter(str,i);

                myList.add(str1);
            }
        }

        String[] newArray = new String [myList.size()];

        return myList.toArray(newArray);

    }
}
