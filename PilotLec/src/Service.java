//import java.util.*;
//
//public class Service {
//
//    public DaoInterface daoInterface = new Dao();
//
//    public Set<Student> getAll(){//返回数组里面所有的学生，打印学生名字，并且保证有序
//        return daoInterface.getAll();
//    }
//    public List<Student> getSortedByName(){
//        Set<Student> studentSet = daoInterface.getAll();
//        List<Student> studentList = new ArrayList<>(studentSet);
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        return studentList;
//    }
//}
