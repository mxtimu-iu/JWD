package com.realestate.repository;

import com.realestate.model.user;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {



}
