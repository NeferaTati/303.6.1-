public class arraydemoOne {
    public static void main(String[] args) {

        //array


        int[] age = {12, 4, 5, 2, 5};


        // get each array element

        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }

    ///ex 2
    public class loopEx {
        public static void main(String[] args) {

            int[] age = {12, 4, 5};

            // loop


            System.out.println("Using for Loop:");
            for(int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }
        }
    }
    public class EnhancedForLoop {
        public static void main(String[] args) {
            String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
            for (String name : names) {
                System.out.println(name);
            }
        }
    }




}

