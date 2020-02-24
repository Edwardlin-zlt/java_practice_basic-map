import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer, List<Student>> students = new HashMap<>();

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, List<Student> students){
        this.name = name;
        for (Student student: students) {
            addStudent(student);
        }
    }


    public Teacher(String name, Student... students) {
        this.name = name;
        for (Student student: students){
            addStudent(student);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, List<Student>> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, List<Student>> students) {
        this.students = students;
    }

    public void addStudent(Student stu){
        if (students.containsKey(stu.getAge())){
            students.get(stu.getAge()).add(stu);
        } else {
            students.put(stu.getAge(), new ArrayList<>()); // TODO 有没有直接 new ArrayList<>().add(stu)这种方法添加元素
            students.get(stu.getAge()).add(stu);
        }
    }
}
