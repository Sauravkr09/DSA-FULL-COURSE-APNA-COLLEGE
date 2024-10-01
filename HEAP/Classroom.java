import java.util.PriorityQueue;

public class Classroom {
    static class Student implements Comparable<Student> {
        String Name;
        int Rank;

        public Student(String Name, int Rank) {
            this.Name = Name;
            this.Rank = Rank;
        }

        @Override
        public int compareTo(Student s2) {
            return Integer.compare(this.Rank, s2.Rank);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 8));
        pq.add(new Student("C", 12));
        pq.add(new Student("D", 5));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.Name + " -> " + s.Rank);
            pq.remove();
        }
    }
}
