package com.wip.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wip.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}