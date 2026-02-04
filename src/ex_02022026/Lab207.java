package ex_02022026;

import ex_04022026.COLORS;
//ENUMS created in package1 and class created in package2 thn class in package2 can call enums and print
public class Lab207 {
    public static void main(String[] args) {
        System.out.println("Color Code "+ COLORS.RED);
        System.out.println("Color Value "+ COLORS.RED.getValue());
    }

}
