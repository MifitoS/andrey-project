package ru.andreycompany.university.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andreycompany.university.dto.GroupRequestDTO;
import ru.andreycompany.university.model.UniversityGroup;
import ru.andreycompany.university.repository.GroupRepository;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    @Override
    public void add(GroupRequestDTO group) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.setAge(group.getAge());
        universityGroup.setName(group.getName());
        universityGroup.setCreateAt(LocalDate.now());


        groupRepository.save(universityGroup);

    }
}
