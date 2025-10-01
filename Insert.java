public class Insert {
    public static void main(String[] args) {
        int[] num = {10,20,30};
        int newElemnt = 40;

        int[] newArray = new int[num.length + 1];

        for (int i = 0 ; i <num.length ;i++){
            newArray[i] = num[i];
            //   ↑          ↑
           //   Put here   Take from here
        }

        newArray[num.length] = newElemnt;

        System.err.println(java.util.Arrays.toString(newArray));


    }
    
}
