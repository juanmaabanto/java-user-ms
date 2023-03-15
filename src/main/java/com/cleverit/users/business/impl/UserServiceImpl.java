package com.cleverit.users.business.impl;

import com.cleverit.users.business.UserService;
import com.cleverit.users.expose.response.UserResponse;
import com.cleverit.users.model.User;
import com.cleverit.users.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserJpaRepository userJpaRepository;


  @Override
  public UserResponse getUserById(long id) {
    User user = userJpaRepository.getById(id);
    UserResponse response = new UserResponse(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName()
        , user.getEmail(), user.getPhoneNumber(), user.getBirthDate());

    return response;
  }
}
