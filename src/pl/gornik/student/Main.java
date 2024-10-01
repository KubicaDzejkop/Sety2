package pl.gornik.student;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                int result = s1.getSurname().compareTo(s2.getSurname());
//                if (result != 0){
//                    return result;
//                }else{
//                    return s1.getAge() - s2.getAge();
//                }
//            }
//        });                SPOSÓB 1


//        Set<Student> students = new TreeSet<>(new ComparatorByAgeThenByPesel()); SPOSÓB 2
        Set<Student> students = new TreeSet<>(); // SPOSÓB 3
        students.add(new Student("Patryk", "Radzimek", 22, "12345678912"));
        students.add(new Student("Mateusz", "Radzimek", 19, "12345678912"));
        students.add(new Student("Przemek", "Gruby", 55, "12345678914"));
        students.add(new Student("Kacper", "Nowusiek", 14, "12345678915"));

        for (Student student : students){
            System.out.println(student);
        }

    }
}
