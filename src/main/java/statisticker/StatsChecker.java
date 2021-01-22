/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package main;

import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @author SAY8COB
 */
public class StatsChecker {


  private final float maxThreshold;
  private final IAlerter[] alerters;

  /**
   * @param maxThreshold as input
   * @param alerters as input
   */
  public StatsChecker(final float maxThreshold, final IAlerter[] alerters) {
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;
  }

  /**
   * @param numberList as Array Input
   */
  public void checkAndAlert(final List<Float> numberList) {
    DoubleSummaryStatistics summaryStatistics = numberList.stream().mapToDouble((a) -> a).summaryStatistics();
    if (summaryStatistics.getMax() > this.maxThreshold) {
      this.alerters[0].setAlert(true);
      this.alerters[1].setAlert(true);
    }
  }
}
