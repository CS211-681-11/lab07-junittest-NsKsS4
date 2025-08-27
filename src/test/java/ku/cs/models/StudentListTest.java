package ku.cs.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    public void testAddNewStudentWithoutScore() {
        studentList.addNewStudent("001", "Alice");
        Student s = studentList.getStudents().get(0);
        assertEquals("001|Alice|0.0", s.getId() + "|" + s.getName() + "|" + s.getScore());
    }

    @Test
    public void testAddNewStudentWithScore() {
        studentList.addNewStudent("002", "Bob", 85);
        Student s = studentList.getStudents().get(0);
        assertEquals("002|Bob|85.0", s.getId() + "|" + s.getName() + "|" + s.getScore());
    }

    @Test
    public void testFindStudentById() {
        studentList.addNewStudent("003", "Charlie");
        Student s = studentList.findStudentById("003");
        assertEquals("Charlie", s.getName());
    }

    @Test
    public void testFilterByName() {
        studentList.addNewStudent("004", "David");
        studentList.addNewStudent("005", "Daisy");
        studentList.addNewStudent("006", "Eve");
        StudentList filtered = studentList.filterByName("Da");
        assertEquals(2, filtered.getStudents().size());
    }

    @Test
    public void testGiveScoreToId() {
        studentList.addNewStudent("007", "Frank");
        studentList.giveScoreToId("007", 70);
        Student s = studentList.findStudentById("007");
        assertEquals(70.0, s.getScore());
    }

    @Test
    public void testViewGradeOfId() {
        studentList.addNewStudent("008", "Grace", 92);
        String grade = studentList.viewGradeOfId("008");
        assertEquals("A", grade);
    }

    @Test
    public void testAddDuplicateStudent() {
        studentList.addNewStudent("009", "Henry");
        studentList.addNewStudent("009", "Henry");
        assertEquals(1, studentList.getStudents().size());
    }
}