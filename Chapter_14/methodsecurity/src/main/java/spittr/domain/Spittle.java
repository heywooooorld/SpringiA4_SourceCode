package spittr.domain;

import java.util.Date;

public class Spittle {
  private final Long id;
  private final String text;
  private final Date postedTime;
  private Spitter spitter;

  public Spittle(Long id, Spitter spitter, String text, Date postedTime) {
    this.id = id;
    this.spitter = spitter;
    this.text = text;
    this.postedTime = postedTime;
  }
  
  public Long getId() {
    return this.id;
  }
  
  public String getText() {
    return this.text;
  }
  
  public Date getPostedTime() {
    return this.postedTime;
  }
  
  public Spitter getSpitter() {
    return spitter;
  }

}