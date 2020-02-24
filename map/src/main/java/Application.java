import java.util.Arrays;
import java.util.List;

public class Application {

  public static void main(String[] args) {
      // 总感觉Teacher的Constructor如果是接受Map来构造，有点不合理，所有有了一下两种方案

      // 01. 接受可变参数的学生来构造
      demo01();

      System.out.println("============================");
      // 02. 接受学生对象的List来构造
      demo02();
      // 感觉第二种要好一点，如果Teacher再有别的参数，第二种比较好操作，不过好像有方法重载，也无所谓的样子
  }

    private static void demo02() {
      // 使用学生对象的List构造
        List<Student> students = Arrays.asList(new Student("Linda", 18),
            new Student("Cindy", 19), new Student("Mary", 19));
        Teacher bob = new Teacher("Bob", students);

        Student ben = new Student("Ben", 19);
        Student solider = new Student("Solider", 20);
        bob.addStudent(ben);
        bob.addStudent(solider);
        System.out.println(bob.getStudents());

    }

    public static void demo01(){
      // 使用可变参数的Constructor
      Student linda = new Student("Linda", 18);
      Student cindy = new Student("Cindy", 19);
      Student mary = new Student("Mary", 19);

      Teacher bob = new Teacher("Bob", linda, cindy, mary);

      Student ben = new Student("Ben", 19);
      Student solider = new Student("Solider", 20);
      bob.addStudent(ben);
      bob.addStudent(solider);
      System.out.println(bob.getStudents());
  }

}
