package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String [] result = new String [values.length-1];
        int i = 0;
        for (String s: values){
            if (s == getMiddleElement(values)){

            }else{
                result[i] = s;
                i++;
            }
         }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String [] result = new String [values.length-1];
            for (int i = 0; i < values.length-1 ; i++) {
                result[i] = values[i];
        }
        return result;
    }
}