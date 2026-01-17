package ru.andreycompany.university.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andreycompany.university.dto.StudentRequestDTO;
import ru.andreycompany.university.model.Student;
import ru.andreycompany.university.model.UniversityGroup;
import ru.andreycompany.university.repository.GroupRepository;
import ru.andreycompany.university.repository.StudentRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    public void add(StudentRequestDTO studentDTO) {
        Optional<UniversityGroup> universityGroupByName = groupRepository.getUniversityGroupByName(studentDTO.getNameGroup());

        if (universityGroupByName.isPresent()) {
            UniversityGroup universityGroup = universityGroupByName.get();


            Student student = new Student();

            student.setName(studentDTO.getNameStudent());
            student.setGroup(universityGroup);
            studentRepository.save(student);
        }
    }
}
