package com.huelmo.todo.controller;

import com.huelmo.todo.service.AuthenticationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Class description here
 *
 * @author Agustin Huelmo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/authentication")
public class Authentication {

  @NonNull
  private final AuthenticationService authenticationService;

  @PostMapping("/login")
  public void login() {

  }
}
