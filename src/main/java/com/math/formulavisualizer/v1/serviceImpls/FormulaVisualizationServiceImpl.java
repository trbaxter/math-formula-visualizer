package com.math.formulavisualizer.v1.serviceImpls;

import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

public class FormulaVisualizationServiceImpl implements FormulaVisualizationService {

  @Override
  public String generateVisualizationData(String formula) {
    return String.format("Example visualization data for formula: %s", formula);
  }
}
