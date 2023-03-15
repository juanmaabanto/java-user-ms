package com.cleverit.users.expose;

import com.cleverit.users.business.UserService;
import com.cleverit.users.expose.response.UserResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
@RequiredArgsConstructor
public class UsersController {
  private final UserService userService;

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  @ApiOperation(value = "Obtener Usuario", notes = "Obtener Usuario",
      response = UserResponse.class)
  public UserResponse ReadUser(
      @ApiParam(value = "Id del usuario.", required = true)
      @RequestParam("id")
          long id
  ) {
    return  userService.getUserById(id);
  }
}
