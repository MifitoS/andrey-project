package ru.andreycompany.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.andreycompany.university.model.UniversityGroup;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface GroupRepository extends JpaRepository<UniversityGroup, UUID> {

    @Query("select u from UniversityGroup u where u.name = ?1")
    Optional<UniversityGroup> getUniversityGroupByName(String name);
}
