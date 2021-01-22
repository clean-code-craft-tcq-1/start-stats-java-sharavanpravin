/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package main;

import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @author SAY8COB
 */
public class Statistics {


  /**
   * @author SAY8COB
   */
  public static class Stats {

    public Float average;
    public Float min;
    public Float max;

  }

  /**
   * @param numbers as input List
   * @return Stats obj
   */
  public static Stats getStatistics(final List<Float> numbers) {
    Stats stats = new Stats();
    if (!numbers.isEmpty()) {
      DoubleSummaryStatistics summaryStatistics = numbers.stream().mapToDouble((a) -> a).summaryStatistics();
      setOutput(stats, (float) summaryStatistics.getAverage(), (float) summaryStatistics.getMin(),
          (float) summaryStatistics.getMax());
    }
    else {
      setOutput(stats, Float.NaN, Float.NaN, Float.NaN);
    }
    return stats;
  }

  /**
   * @param stats
   * @param summaryStatistics
   */
  private static void setOutput(final Stats stats, final Float average, final Float min, final Float max) {
    stats.average = average;
    stats.min = min;
    stats.max = max;
  }


}
