package com.cleverit.users.expose.response;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "ContadorResponse model")
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class UserResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @NotNull
  @ApiModelProperty(example = "1")
  private long id;

  @NotNull
  @ApiModelProperty(example = "test")
  private String userName;

  @NotNull
  @ApiModelProperty(example = "Test")
  private String firstName;

  @NotNull
  @ApiModelProperty(example = "Test")
  private String lastName;

  @NotNull
  @ApiModelProperty(example = "test@test.com")
  private String email;

  @NotNull
  @ApiModelProperty(example = "123456")
  private String phoneNumber;

  @NotNull
  @ApiModelProperty(example = "01/01/2023")
  private Date birthDate;
}
