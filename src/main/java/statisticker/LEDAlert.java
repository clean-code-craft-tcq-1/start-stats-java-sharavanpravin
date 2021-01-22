/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package main;


/**
 * @author SAY8COB
 */
public class LEDAlert implements IAlerter {

  /**
   * led Alert
   */
  public boolean ledGlows;

  /**
   * {@inheritDoc}
   */
  @Override
  public void setAlert(final boolean alert) {
    this.ledGlows = alert;
  }

}
