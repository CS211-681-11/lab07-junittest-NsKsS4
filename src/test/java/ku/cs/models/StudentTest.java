package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("67XXXXXXXX","Test", 85);
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อเป็น Four และให้ Object แสดงชื่อที่เปลี่ยน")
    void testChangeName(){
        s.changeName("Four");
        assertEquals("Four", s.getName());
    }

    @Test
    void testGrade() {
        assertEquals("A", s.grade());
    }

    @Test
    void testIsId() {
        assertEquals(true, s.isId("67XXXXXXXX"));
    }

    @Test
    void testIsNameContains() {
        assertEquals(false, s.isNameContains("len"));
    }

    @Test
    void testGetId() {
        assertEquals("67XXXXXXXX", s.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Test", s.getName());
    }

    @Test
    void testGetScore() {
        assertEquals(85, s.getScore());
    }

    @Test
    void testGetGrade() {
        assertEquals("A", s.getGrade());
    }

    @Test
    void testToString() {
        assertEquals("{id: '67XXXXXXXX', name: 'Test', score: 85.0}", s.toString());
    }

    @Test
    void testConstructorWithTwoArgs() {
        assertEquals(85, s.getScore());
    }

    @Test
    void testConstructorWithThreeArgs() {
        assertEquals(85, s.getScore());
    }

}