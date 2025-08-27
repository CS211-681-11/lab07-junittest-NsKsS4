package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentListHardCodeDatasourceTest {

    @Test
    void testReadData() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList list = datasource.readData();

        assertEquals(10, list.getStudents().size());
    }

    @Test
    void testWriteData() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList list = new StudentList();
        list.addNewStudent("123", "Test");

        datasource.writeData(list);

        assertEquals(1, list.getStudents().size());
    }
}
