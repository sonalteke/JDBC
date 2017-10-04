package SupplierInterface;

import java.util.function.Supplier;

/**
 * Created by sonal on 15/9/17.
 */
public class SupplierStudentDemo {
    public static void main(String[] args) {
        Supplier<Student> supplier=()-> {return new Student(1,"sonal","pune");
        };
        Student s=supplier.get();
        System.out.println("student details:\n" +s.getId()+" "+s.getName()+" "+s.getCity());
    }
}
