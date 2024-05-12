package com.math.formulavisualizer.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

@RestController
@RequestMapping("/api/formula")
public class FormulaController {

  private final FormulaVisualizationService formulaVisualizationService;

  @Autowired
  public FormulaController(FormulaVisualizationService formulaVisualizationService) {
    this.formulaVisualizationService = formulaVisualizationService;
  }

  @PostMapping("/visualize")
  public String visualizeFormula(@RequestBody String formula) {
    return formulaVisualizationService.generateVisualizationData(formula);
  }
}
