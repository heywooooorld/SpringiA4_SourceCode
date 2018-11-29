package spittr.service;

import org.springframework.security.access.annotation.Secured;

import spittr.domain.Spittle;

public class SecuredSpittleService implements SpittleService {

  @Override
  @Secured({"ROLE_SPITTER", "ROLE_ADMIN"})
  public void addSpittle(Spittle spittle) {
    System.out.println("Method was called successfully");
  }
  
}
