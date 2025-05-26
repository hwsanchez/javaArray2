import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numeros = {2,5,1,3,4,7,3,8};
        System.out.println("Original array: " + Arrays.toString(numeros));
        int[] backupOfNums = numeros; //This copies the array by Reference:when it is used it references the same memory from numeros;
        Arrays.sort(numeros); // sorts the array
        System.out.println("Sorted original array: " + Arrays.toString(numeros));
        System.out.println("Backup array: " + Arrays.toString(backupOfNums));
        //The outup is the same for both arrays since backupOfNums is a reference copy.
        //The following method makes a true copy of the array (not by reference, but by value).
        //The first parameter is the array and the second param is the lenght of the array to copy)
        int[] numeros2 = {2,5,1,3,4,7,3,8};
        int[] trueBackup = Arrays.copyOf(numeros2, numeros2.length);
        System.out.println("Original array numeros2: " + Arrays.toString(numeros2));
        Arrays.sort(numeros2);
        System.out.println("Sorted original array numeros2: " + Arrays.toString(numeros2));
        System.out.println("numeros2 backup: " + Arrays.toString(trueBackup));
        //You can also specify the length of the copy:
        int[] numSmall = Arrays.copyOf(trueBackup, 5);
        int[] numBig = Arrays.copyOf(trueBackup, 15);
        System.out.println("Small array copy: " + Arrays.toString(numSmall));
        System.out.println("Big array copy: " + Arrays.toString(numBig));

    }

}