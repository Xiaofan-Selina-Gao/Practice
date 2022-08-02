public class Student implements Comparable<Student> {
    //comparable is for class level, use inside of class
    public Integer id;
    public String name;

    public Student(String name) {
        this.name = name;
    }

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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student other) {
        return this.getName().compareTo(other.getName());
    }
}
