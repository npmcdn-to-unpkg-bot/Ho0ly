package com.bay1ts.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by chenu on 2016/7/28.
 */
public interface UserService {
    public UserDetails getCurrentUser();
}
