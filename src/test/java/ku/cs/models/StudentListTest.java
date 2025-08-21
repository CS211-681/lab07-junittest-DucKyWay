package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    static StudentList students;

    @BeforeAll
    static void init() { }

    @BeforeEach
    void setup() {
        students = new StudentList();
        students.addNewStudent("6710400001", "First");
        students.addNewStudent("6710400002", "Second");
        students.addNewStudent("6710400003", "Third");
        students.addNewStudent("6710400004", "Fourth");
        students.addNewStudent("6710400005", "Fifth");
        students.addNewStudent("6710400006", "Sixth");
        students.addNewStudent("6710400007", "Seventh");
        students.addNewStudent("6710400008", "Eighth");
        students.addNewStudent("6710400009", "Ninth");
        students.addNewStudent("6710400010", "Tenth");
    }

    @Test @DisplayName("Test: student add")
    void testAddNewStudent() {
        students.addNewStudent("6710405999", "Newbie", 0.0);
        assertEquals("6710405999", students.findStudentById("6710405999").getId());
    }

    @Test @DisplayName("Test: find student with ID")
    void testFindStudentById() {
        assertEquals("6710400001", students.findStudentById("6710400001").getId());
    }

    @Test @DisplayName("Test: filter student by name")
    void testFilterByname() {
        students.addNewStudent("6710405999", "NameWhat");
        assertEquals(1, students.filterByName("NameWhat").getStudents().size());
    }

    @Test @DisplayName("Test: give score to ID student")
    void testGiveScoreToId() {
        students.addNewStudent("6710405999", "Newbie", 10.0);
        students.giveScoreToId("6710405999", 5);
        assertEquals(15, students.findStudentById("6710405999").getScore());
    }

    @Test @DisplayName("Test: view grade by ID")
    void testViewGradeToId() {
        students.addNewStudent("6710405999", "Newbie", 50.0);
        assertEquals("D", students.viewGradeOfId("6710405999"));
    }

    @Test @DisplayName("Test: get students")
    void testGetStudents() {
        students.addNewStudent("6710405999", "TestGetStudents");
        assertEquals(11, students.getStudents().size());
    }
}