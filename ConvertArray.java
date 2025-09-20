package Tutorial;
import java.text.NumberFormat;
import java.util.Arrays;
public class ConvertArray {
    public static int[] stringToInt (String[] stringArray) {
        int [] intArray = new int[stringArray.length] ;
        int arrayIndex = 0 ;
        while (arrayIndex < stringArray.length) {
            try {
                intArray[arrayIndex] = Integer.parseInt(stringArray[arrayIndex].trim());
            }
            catch (NumberFormatException e) {
                throw new NumberFormatException ("One of the input is not an integer. Please check again.") ;
            }
            if (intArray[arrayIndex] < 0) {
                throw new IllegalArgumentException("There is a negative number, not valid.") ;
            }

            arrayIndex++ ;

        }
        return intArray ;
    }
    public static int[] tryConvert (String[] stringArray1){
        int [] intArray1 = new int [stringArray1.length] ;
        int arrayIndex1 = 0 ;
        while (arrayIndex1 < stringArray1.length) {
            try {
                intArray1[arrayIndex1] = Integer.parseInt (stringArray1[arrayIndex1].trim());
            }
            catch (NumberFormatException e1) {
                System.out.println ("One of the inputs in not valid and the array is replaced with -100.") ;
                for (int i = 0; i < stringArray1.length; i++) {
                    intArray1 [i] = -100 ;
                }
            }
            arrayIndex1++ ;
        }
        return intArray1;
    }
    public static void main (String[] args) {
        String[] list = {"1", "2", " -1"};
        System.out.println(Arrays.toString(stringToInt(list)));
        System.out.println(Arrays.toString(tryConvert(list))) ;
    }
}