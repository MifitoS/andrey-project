package ru.andreycompany.university.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreycompany.university.dto.StudentRequestDTO;
import ru.andreycompany.university.service.StudentService;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping(path = "/add")
    public void method(@RequestBody StudentRequestDTO student) {
        System.out.println("ТЕСТ");
        studentService.add(student);
    }
}
