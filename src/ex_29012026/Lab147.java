package ex_29012026;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        //1st Way
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        // Infsys - Autoamtion Interview
        int max = 1;
        int min = salaries[4];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
            if (salaries[i] < min) {
                min=salaries[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
//2nd Way
//        // Find the Max in the Arrays
//        // Find the Max Salary, Min  in the Salary Array
//        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
//        // Infsys - Autoamtion Interview
//        int max = 1;
//        int min = salaries[0];
//        for (int i = 0; i < salaries.length ; i++) {
//            if( salaries[i] > max){
//                max = salaries[i];
//            }
//            if(min > salaries[i]){
//                min = salaries[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);
//
//
//        // Sort -> find the last one -
////        Arrays.sort(salaries);
////        System.out.println(salaries[salaries.length-1]);

    }
}
