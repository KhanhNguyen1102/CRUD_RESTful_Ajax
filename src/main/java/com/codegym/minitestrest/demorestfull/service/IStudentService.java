package com.codegym.minitestrest.demorestfull.service;


import com.codegym.minitestrest.demorestfull.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService extends IGeneralService<Student>{
    Page<Student> findByNameContaining(String firstName , Pageable pageable);
    Page<Student> findAll(Pageable pageable);
    Page<Student>findNameByOrderScoreGreaterThan8(Pageable pageable);
    Iterable<Student> findByNameContaining(String name);
}
