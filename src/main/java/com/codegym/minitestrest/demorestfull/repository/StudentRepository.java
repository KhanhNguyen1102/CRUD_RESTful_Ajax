package com.codegym.minitestrest.demorestfull.repository;


import com.codegym.minitestrest.demorestfull.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByNameContaining(String firstName, Pageable pageable);
    Iterable<Student> findByNameContaining(String name);
    @Query("select s from Student  s where s.score > 8 ")
    Page<Student>findNameByOrderScoreGreaterThan8(Pageable pageable);
}
