public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
