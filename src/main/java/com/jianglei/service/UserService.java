package com.jianglei.service;

import com.jianglei.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by jianglei on 17-2-25.
 */

public interface UserService {
    User getUserByName(String name);
}
