package com.jianglei.mapper;

import com.jianglei.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by jianglei on 17-2-25.
 */
@Repository
public interface UserMapper {
    User getUser(String name);
}
