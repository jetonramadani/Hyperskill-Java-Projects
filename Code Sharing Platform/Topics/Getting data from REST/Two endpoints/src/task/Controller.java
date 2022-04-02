package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {
    static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private static List<Student> students =
            List.of(new Student(84, "Alice"),
                    new Student(99, "Kate"),
                    new Student(55, "Someone"));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream().filter(student -> student.getId() == id)
                .findFirst().orElse(null);
    }
}
