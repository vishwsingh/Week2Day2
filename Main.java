import java.util.*;
public class Main {

    
    public static void main(String[] args) {

        double[] array = {5.2,6.8,8,4.6};
        System.out.println("Hello world!");
    }

    public interface ArrayProcessor {
        double[] array = {5.2,6.8,8,4.6};
        //to find the average of the array
        public static final ArrayProcessor avg = array -> {
            //inititalizing sum to be 0
            double sum = 0;
            //going through the array and adding each element to the sum
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            //returning the average, which is sum divided by the length of the array(number of elements)
            return sum / array.length;
        };

        //to find the maximum value in the array
        public static final ArrayProcessor max = array -> {
            //initialzing the maxium value as 0
            double maximum = array[0];
            //Looping throught the array and comparing each element to the maximum, if the compared value is greater then we store that value in maximum
            for (int i = 0; i < array.length; i++) {
                if (maximum < array[i]) {
                    maximum = array[i];
                }
            }
            //returning the maximum value in the array
            return maximum;
        };

        //to find the minimum value in the array
        public static final ArrayProcessor min = array -> {
            //initialzing the minimum value as 0
            double minimum = array[0];
            //Looping throught the array and comparing each element to the minimum, if the compared value is smaller then we store that value in minimum
            for (int i = 0; i < array.length; i++) {
                if (minimum > array[i]) {
                    minimum = array[i];
                }
                //returning the minimum value in the array
                return minimum;
            }
        };

        //to find the sum of the array
        public static final ArrayProcessor sum = array -> {
            //initialzing the sum value as 0
            double sum_array = 0;
            //Looping through the array and adding each element to the sum_array
            for (int i = 0; i < array.length; i++) {
                sum_array += array[i];
            }
            //returning the sum of the array
            return sum_array;
        };

        //to find the number of occurences of a value in the array
        public static ArrayProcessor counter(double value) {
            return array -> {
                //initialzing the counter value as 0
                int count = 0;
                //Looping through the array, if we find the value to be equal as our value, we increase the counter by 1
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == value)
                        count++;
                }
                //returning the count
                return count;
            };
        }
    }
}