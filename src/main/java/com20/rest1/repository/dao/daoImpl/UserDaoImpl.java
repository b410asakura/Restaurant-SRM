package com20.rest1.repository.dao.daoImpl;

import com20.rest1.dto.userDto.UserResponse;
import com20.rest1.enums.Role;
import com20.rest1.repository.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;

}
