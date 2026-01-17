package ru.andreycompany.university.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreycompany.university.dto.GroupRequestDTO;
import ru.andreycompany.university.service.GroupService;

@RestController
@RequestMapping(path = "/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping(path = "/add")
    public void method(@RequestBody GroupRequestDTO group) {
        groupService.add(group);
    }

//    @GetMapping(path = "/get")
//    public void method(@RequestParam Long id, Long doubleId) {
//        System.out.println(id);
//    }
}
