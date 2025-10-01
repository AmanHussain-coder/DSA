public class Findelement {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        int target = 20;
        boolean found = false ;

        for(int i = 0; i <num.length; i++)
        
        {
            if(num[i]==target){
                System.err.println("Found" + target + "at index " + i);
                found = true;
                break;
            }

            }

            if(!found){
                System.err.println(target + "not found");
            }
        }
    }
    

