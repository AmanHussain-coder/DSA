import java.util.Arrays;

public class Deletionbyindex {
    public static void main(String[] args) {
        int[] num={10,20,30};

        int indexToDelete = 1;

        int[] newArray = new int[num.length - 1];

        for(int i = 0; i< indexToDelete ;i++){
            newArray[i] = num[i];
        }

        for(int i = indexToDelete +1 ;i<num.length;i++){
            newArray[i -1] = num[i];
        }
         System.out.println("Original: " + Arrays.toString(num));
        System.out.println("After deletion: " + Arrays.toString(newArray));

    }
}
