package ex_08022026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {

Student s1=new Student(104,"Sanket"); ///Step 4
Student s2=new Student(101,"Ajit");///Step 4
Student s3=new Student(103,"Umrani");///Step 4
Student s4=new Student(102,"Shreyas");///Step 4



List arraylist=new ArrayList(); ///Step 5
arraylist.add(s1);///Step 6
arraylist.add(s2);///Step 6
arraylist.add(s3);///Step 6
arraylist.add(s4);///Step 6
        System.out.println(arraylist);///Step 6( ///Step 8)----> Re Run this code after Step7 completion toget appropriate output
//After Step 6 the output was printed as address and not the details  so below steps were executed
        ///Step 7
        //Here the address of the ArrayList is printed and not the details
        //To print the details we need to have toString() method created

        //Collections.sort(arraylist);//Using Comparable() ///Step 10
        //System.out.println(arraylist);//Using Comparable() ///Step 10
        Collections.sort(arraylist,new sortById()); //Step 12
        System.out.println(arraylist);//Step 12
        Collections.sort(arraylist,new sortByName());//Step 12
        System.out.println(arraylist);//Step 12
        Collections.sort(arraylist,new sortByNameDesc() );
        System.out.println(arraylist);
        Collections.sort(arraylist,new sortByIDDesc());
        System.out.println(arraylist);




    }
}
///Step 11
//we have created this class to qualify for sorting by Name and Id both
class sortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
///Step 11
class sortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
class sortByNameDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
class sortByIDDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

///Step 9 is below
//class Student implements Comparable<Student>{ //we add implements keyword to Comparable to create a compareTo method to sort the arraylist
class Student{  //Step 1
    //As these are a Encapsulation , we need to create getter and setter
private Integer id;
    private String name;
//Constructor Creation     ///Step 3
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
//Getter and Setter creation started    ///Step 2
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { ///Step 7 Right Click->generate ->tostring()
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    ///Step 10
//Comparable functions either sort by name or id not both so it is disadvantage, so remove both of them  and introduce comparator()
//    @Override
//    public int compareTo(Student AnotherStudent) { //s1 compare with s2 and then s1 compare with s2,s3, and then s1 compare with s2,s3,s4 and then sort the output in ascending order
//        return Integer.compare(this.id,AnotherStudent.id);
//    }

//    @Override
//    public int compareTo(Student AnotherStudent) { //s1 compare with s2 and then s1 compare with s2,s3, and then s1 compare with s2,s3,s4 and then sort the output in ascending order
//        return CharSequence.compare(this.name,AnotherStudent.name);
//    }
}

