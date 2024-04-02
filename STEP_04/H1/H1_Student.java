package STEP_04.H1;

import java.io.*;

class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }    
}

class STEP_04_H1_Student{
    public static void main(String[] args) throws IOException{
    Student student1, student2;
    student1 = new Student("Kim", 18);
    student2 = new Student("Lee", 19);
     

    System.out.printf("%s, %d\n", student1.name, student1.age);
    System.out.printf("%s, %d\n", student2.name, student2.age);
    }
}