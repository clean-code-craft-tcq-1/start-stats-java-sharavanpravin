/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package main;


/**
 * @author SAY8COB
 */
public class EmailAlert implements IAlerter {

  /**
   * email Alert
   */
  public boolean emailSent;

  /**
   * {@inheritDoc}
   */
  @Override
  public void setAlert() {
    this.emailSent = true;
  }

}
