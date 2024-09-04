public class arraydemothree {
    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;


        Double average;


        for (int number: numbers) {
            sum += number;
        }

        // to grt total number
        int arrayLength = numbers.length;

        //  average
        //  change int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }


   public class MeanSDArray {
        public static void main(String[] args) {
// variable


            int[] marks = {74, 43, 58, 60, 90, 64, 70};
            int sum = 0;
            int sumSq = 0;


                double mean, stdDev;

            // loop time
            for (int i = 0; i < marks.length; ++i) {
                sum += marks[i];
                sumSq += marks[i] * marks[i];
            }
                mean = (double)sum / marks.length;
                stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

            System.out.printf("Mean is: %.2f%n", mean);
            System.out.printf("Standard deviation is: %.2f%n", stdDev);
        }
    }



}


