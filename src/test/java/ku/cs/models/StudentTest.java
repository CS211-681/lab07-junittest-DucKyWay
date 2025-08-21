package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    static Student student;
    @BeforeAll
    static void init() { }

    @BeforeEach
    void setup() {
        student = new Student("6710405000", "First");
    }

    @Test @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        student.changeName("Second");
        assertEquals("Second", student.getName());
    }

    @Test @DisplayName("ทดสอบการเพิ่มคะแนน 45.12")
    void testAddscore() {
        student.addScore(45.12);
        assertEquals(45.12, student.getScore());
    }

    @Test @DisplayName("ทดสอบการคำนวนเกรด")
    void testCalculateGrade() {
        student.addScore(85.12);
        assertEquals("A", student.grade());
    }

    @Test @DisplayName("ทดสอบการเช็คไอดี")
    void testIsId() {
        assertEquals("6710405000", student.getId());
    }

    @Test @DisplayName("ทดสอบการเช็คว่าชื่อตรงกันหรือไม่")
    void testIsNameContain() {
        assertEquals(true, student.isNameContains("First"));
    }

    @Test @DisplayName("ทดสอบว่าเรียกชื่อถูกต้องหรือไม่")
    void testGetName() {
        assertEquals("First", student.getName());
    }

    @Test @DisplayName("ทดสอบว่าเรียกคะแนนถุกต้องหรือไม่")
    void testGetScore() {
        student.addScore(85.12);
        assertEquals(85.12, student.getScore());
    }

    @Test @DisplayName("ทดสอบว่าเรียกเกรดถูกต้องหรือไม่")
    void testGetGrade() {
        student.addScore(85.12);
        assertEquals("A", student.getGrade());
    }
}