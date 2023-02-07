class Person {
  String name;
  int age;
  String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void showData() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
  }
}

class Employee extends Person {
  int employeeId;
  String department;

  public Employee(String name, int age, String gender, int employeeId, String department) {
    super(name, age, gender);
    this.employeeId = employeeId;
    this.department = department;
  }

  @Override
  public void showData() {
    super.showData();
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Department: " + department);
  }
}

class Student extends Person {
  int studentId;
  String program;

  public Student(String name, int age, String gender, int studentId, String program) {
    super(name, age, gender);
    this.studentId = studentId;
    this.program = program;
  }

  @Override
  public void showData() {
    super.showData();
    System.out.println("Student ID: " + studentId);
    System.out.println("Program: " + program);
  }
}
