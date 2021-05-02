package com.crowtor.backend.data.repository;

import com.crowtor.backend.data.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person,Long> {
    @Query("select p from Person p where p.nickName=:nickName")
    Person findByNickName(String nickName);
}
