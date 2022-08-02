import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("CC");
        Student s2 = new Student("BB");
        Student s3 = new Student("AA");
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
        System.out.println(list);
        Collections.sort(list, (Student::compareTo));
        System.out.println(list);

        Stream<Student> studentStream = list.stream();
        Optional<Student> studentOptional = studentStream.findFirst();
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
        } else
            System.out.println("No word is present to append suffix to.");
        }

    }
