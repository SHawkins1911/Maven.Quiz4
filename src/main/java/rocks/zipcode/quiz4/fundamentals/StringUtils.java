package rocks.zipcode.quiz4.fundamentals;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        if(str.length() == 1){
            return str.toUpperCase();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(i == str.length()/2){
               Character mid = str.charAt(i);
                mid = mid.toUpperCase(mid);
                sb.append(mid);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        if(str.length() == 1){
            return str.toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(i == str.length()/2){
                Character mid = str.charAt(i);
                mid = Character.toLowerCase(mid);
                sb.append(mid);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Integer count = 0;
        Character max = '-';

        for (int i = 0; i <str.length() ; i++) {
            if(!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1 );
        }

        for (Character each: map.keySet()) {
            if (map.get(each) > 1) {
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if (isIsogram(str)) {
            return false;
        }else{
            for (int i = 0; i < str.length()-1 ; i++) {
                if (str.charAt(i) == str.charAt(i+1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        if (!hasDuplicateConsecutiveCharacters(str)){
            return str;
        }else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {

                    i++;
                } else result.append(str.charAt(i));

                if (i == str.length() - 1) {
                    result.append(str.charAt(str.length() - 1));
                }
            }
        }
        return result.toString();
    }

    public static String invertCasing(String str) {
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}