import java.util.Arrays;

public class Deletionbyvalue {
    public static void main(String[] args) {
        int[] num = {10,20,30};

        int valueToDelete =20;

        int indexToDelete =-1;
        for(int i = 0 ; i < num.length; i++){
            if(num[i] == valueToDelete){
                indexToDelete = i ;
                break;
            }        }

            if(indexToDelete == -1){
                System.err.println("Value not Found");
                return;
            }  

            int[] newArray = new int[num.length -1];

            for(int i = 0; i < indexToDelete ; i++){
                newArray[i] = num[i];

            }

            for(int i= indexToDelete + 1 ; i < num.length ; i++){
                newArray[i - 1 ] = num[i];
            }

               System.out.println("Original: " + Arrays.toString(num));
        System.out.println("After deletion: " + Arrays.toString(newArray));

                
            

    }
    
}
