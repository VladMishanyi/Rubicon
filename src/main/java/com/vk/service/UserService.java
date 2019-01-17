package com.vk.service;

import com.vk.entity.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by KIP-PC99 on 18.07.2018.
 */
public interface UserService extends UserDetailsService {

//    public void add(User user);

//    public void update(User user);

    public User getAuthenticatedUser();

    public boolean isAuthenticatedUser();

//    public User getByLogin(String login);

//    public boolean removeByLogin(String login);
}
