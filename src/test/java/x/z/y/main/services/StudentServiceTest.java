package x.z.y.main.services;

import org.junit.*;
import x.z.y.main.domain.Student;

import java.util.Date;
import java.util.List;

/**
 *
 * User: xiangzhuyuan
 * Date: 14-5-29
 * Time: 上午12:07
 * To change this template use File | Settings | File Templates.
 */
public class StudentServiceTest {
    private static StudentService studentService;

    @BeforeClass
    public static void setup() {
        studentService = new StudentService();
    }

    @AfterClass
    public static void teardown() {
        studentService = null;
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindAllStudents() {
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentById() {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student();
        int id = 4;
        student.setStudId(id);
        student.setName("student_" + id);
        student.setEmail("student_" + id + "gmail.com");
        student.setDob(new Date());
        studentService.createStudent(student);
        Student newStudent = studentService.findStudentById(id);
        Assert.assertNotNull(newStudent);
    }
}
