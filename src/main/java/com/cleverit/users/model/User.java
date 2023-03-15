package com.cleverit.users.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * <b>Class</b>: User <br/>
 */
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class User implements Serializable {
  private static final long serialVersionUID = 6129047119412990803L;

  @Id
  @Column
  private long id;

  @Column(name = "UserName")
  private String userName;

  @Column(name = "FirstName")
  private String firstName;

  @Column(name = "LastName")
  private String lastName;

  @Column(name = "Email")
  private String email;

  @Column(name = "PhoneNumber")
  private String phoneNumber;

  @Column(name = "BirthDate")
  private Date birthDate;
}
