class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean isEqual(Student other) {
        if (this.id == other.id && this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jagdeep");
        Student s2 = new Student(1, "Jagdeep");
        System.out.println(s1.isEqual(s2)); // true
    }
}
