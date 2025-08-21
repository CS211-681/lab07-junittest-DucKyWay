package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    StudentList students = new StudentHardCodeDatasource().readData();

    @Test
    void testReadData() {
        assertEquals(4, students.getStudents().size());
    }
}