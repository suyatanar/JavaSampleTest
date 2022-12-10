public class Main {
    public static void main(String[] args) {
        /* An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0. */
        int[] number= {1,2,6,4,5};
        int array_length = number.length;
        boolean check_middle_array = false;
        if(array_length % 2 == 0 || number == null)
            System.out.println("0");

        if(array_length % 2 == 1) {
            int middle_array = number[array_length/2];
            for (int i=0; i < array_length; i++){
                if(number[i] > middle_array && i != (array_length/2)){
                    check_middle_array = true;
                }
            }
        }

        if(check_middle_array)
            System.out.println(1);
        else
            System.out.println(0);

    }


}