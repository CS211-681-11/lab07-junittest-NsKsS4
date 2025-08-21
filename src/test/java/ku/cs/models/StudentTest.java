package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("67XXXXXXXX","Test");
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
    void testIsId(){
        assertEquals(true, s.isId("67XXXXXXXX"));
    }

    @Test
    void testContains(){
        assertEquals(true, s.isNameContains("est"));
    }

    @Test
    void testConstructorWithoutScore(){
        assertEquals("67XXXXXXXX|Test", s.getId() + "|" + s.getName());
    }

}