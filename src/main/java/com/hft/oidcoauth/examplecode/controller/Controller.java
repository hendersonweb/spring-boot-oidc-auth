package com.hft.oidcoauth.examplecode.controller;

import javax.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {

  @RequestMapping(value = "/anonymous", method = RequestMethod.GET)
  public ResponseEntity<String> getAnonymous() {
    return ResponseEntity.ok("Hello Anonymous");
  }

  @RequestMapping(value = "/user", method = RequestMethod.GET)
  public ResponseEntity<String> getUser() {
    return ResponseEntity.ok("Hello User");
  }

  @RolesAllowed("Registry_reviewer")
  @RequestMapping(value = "/admin", method = RequestMethod.GET)
  public ResponseEntity<String> getAdmin() {
    return ResponseEntity.ok("Hello Admin");
  }

  @RequestMapping(value = "/all-user", method = RequestMethod.GET)
  public ResponseEntity<String> getAllUser() {
    return ResponseEntity.ok("Hello All User");
  }
}
