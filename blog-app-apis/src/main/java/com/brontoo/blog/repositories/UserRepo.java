package com.brontoo.blog.repositories;

import com.brontoo.blog.entities.User;
import com.brontoo.blog.payloads.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer> {

}
