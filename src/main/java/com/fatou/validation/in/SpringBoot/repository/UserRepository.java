package com.fatou.validation.in.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatou.validation.in.SpringBoot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
