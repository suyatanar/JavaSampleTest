public class Main {
    public static void main(String[] args) {

        int middleNumber = findMiddleNumber(new int[]{1, 2, 1, 4, 5});
        System.out.println(middleNumber);
    }

    private static byte findMiddleNumber(int[] number){
        /* An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0. */
        if(number == null)
            return 0;

        int array_length = number.length;
        boolean check_middle_array = false;
        int middle_array = number[array_length/2];
        if(array_length % 2 == 0) {
            return 0;
        }
        else{
            for (int i=0; i < array_length; i++){
                if(number[i] > middle_array && i != (array_length/2)){
                    check_middle_array = true;
                    break;
                }
            }
        }

        if(check_middle_array)
            return 1;
        else
            return 0;
    }
}