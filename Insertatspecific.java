public class Insertatspecific {
    public static void main(String[] args) {
        int[] num = {10,20,30};
        int newElement = 40;
        int position = 2;

        int[] newArray = new int[num.length + 1];

        for(int i = 0;i<num.length;i++){
            newArray[i] = num[i];

        }
            newArray[position]=newElement;

            for(int i = position; i<num.length;i++){

                newArray[i + 1] = num[i];
                
                //       ↑           ↑
                //    Shifted     Original
                //   position     position






            }

            System.out.println(java.util.Arrays.toString(newArray));
            //                 |          |      |        |
//                             |          |      |        └─ Your array
//                             |          |      └─ Method to convert array to String
//                             |          └─ Class with helper methods
//                             └─ Package path (location of Arrays class)
        
    }
    
}
