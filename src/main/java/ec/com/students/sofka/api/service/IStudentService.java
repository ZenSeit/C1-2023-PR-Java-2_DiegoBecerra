package ec.com.students.sofka.api.service;

import ec.com.students.sofka.api.domain.collection.Student;
import ec.com.students.sofka.api.domain.dto.StudentDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {

    Flux<StudentDTO> getAllStudent();

    Mono<StudentDTO> getStudentById(String id);

    Mono<StudentDTO> saveStudent (StudentDTO studentDTO);

    Mono<StudentDTO> updateStudent (String id,StudentDTO studentDTO);

    Mono<String> deleteStudent (String id);

    StudentDTO toDto(Student student);

    Student toEntity (StudentDTO studentDTO);

}
