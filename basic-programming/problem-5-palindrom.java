import java.util.Arrays;

public class Problem5Palindrom {

    private static boolean palindrome(String value){
        boolean type;
        char[] myArray = value.toCharArray();
        int size = myArray.length;
        char[] original = Arrays.copyOf(myArray,myArray.length);

        for (int i = 0; i <= size/2; i++){
            char temp = myArray[i];
            myArray[i] = myArray[size-i-1];
            myArray[size-i-1] = temp;
        }
        if (Arrays.equals(myArray,original)){
            type = true;
        } else {
            type = false;
        }
        return type;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu kupu"));
        System.out.println(palindrome("lion"));
    }
}
