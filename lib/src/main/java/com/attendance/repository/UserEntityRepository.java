package com.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.attendance.entities.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {

	@Query("SELECT u FROM UserEntity u WHERE u.roleId = 0")
	List<UserEntity> findAllAdmins();

	@Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
    public UserEntity findByEmail(String email);


	//@Query("SELECT u FROM UserEntity u WHERE u.course_courseid = ?1")
			
}





