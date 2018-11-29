package spittr.service;

import javax.annotation.security.RolesAllowed;

import spittr.domain.Spittle;

public class JSR250SpittleService implements SpittleService {

  @Override
  @RolesAllowed("ROLE_SPITTER")
  public void addSpittle(Spittle spittle) {
    System.out.println("Method was called successfully");
  }
  
}
