package x.z.y.main.mapper;

import x.z.y.main.domain.Student;

import java.util.List;

/**
 *
 * User: xiangzhuyuan
 * Date: 14-5-28
 * Time: 下午11:54
 * To change this template use File | Settings | File Templates.
 */
public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);
}