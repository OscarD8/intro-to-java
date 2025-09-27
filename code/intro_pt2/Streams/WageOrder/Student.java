package intro_pt2.Streams.WageOrder;

public class Student implements Comparable<Student>
{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
