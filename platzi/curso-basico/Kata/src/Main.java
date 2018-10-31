import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
//        order("is2 Thi1s T4est 3a");
//        digitize(35231 );
//        int[] input = new int[] { 6, 2, 1, 8, 10};
//        sum(input );
//        findShort("bitcoin take over the world maybe who knows perhaps");
//        findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
        validatePin(".234");


    }

    public static int[] digitize(long n) {
        String arrtext;
        arrtext = String.valueOf(n);
        System.out.println(arrtext.split(""));
        char[] stringToCharArray = arrtext.toCharArray();
        int[] nums = new int[stringToCharArray.length];
        for (int i = 0; i < stringToCharArray.length; i++) {
            System.out.println(i);
            System.out.println(i);
            nums[i] = stringToCharArray[i];
        }
        System.out.println(nums);
        return nums;
    }

    public static int[] invert(int[] array) {

        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arr[i] = -array[i];

            } else {
                arr[i] = (~array[i])+1;
            }
        }

        return arr;
    }

    public static double findUniq(double arr[]) {
        // Do the magic
        double varuniq = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                    isDistinct = true;
                    break;
                }
                if(!isDistinct){
                    varuniq = arr[i];
                }
            }


        }


        return varuniq;

    }

    public static int findShort(String s) {
        int shortword = 5;
        String[] info = s.split(" ");
        for (int i = 0; i < info.length; i++){
            if (shortword > info[i].length()){
                shortword = info[i].length();

            }
        }

        System.out.println(shortword);
        return shortword;
    }



    public static char findMissingLetter(char[] array)
    {
        char lost = 0;
        for (int i = 0; i < array.length -1; i++){
            if ((int)array[i + 1] - (int)array[i] != 1) {
                System.out.println((char)((int)array[i]+1 ));
                lost = (char)((int)array[i]+1 );
                break;
                
            }
        }
        return lost;
    }

    public static boolean validatePin(String pin) {
        // Your code here...
        String regex = "[0-9]+";
        System.out.println( pin.matches(regex));
        boolean valid = false;
        if (pin.length() < 4 || pin.length() > 6) {
            valid = false;

        } else if (pin.length() == 4 || pin.length() == 6 && pin.matches(regex) == true)  {
            valid = true;
        }

        System.out.println(valid);
        return valid;

    }




}
