package com.cleverit.users.business;

import com.cleverit.users.expose.response.UserResponse;

public interface UserService {
  UserResponse getUserById(long id);
}
