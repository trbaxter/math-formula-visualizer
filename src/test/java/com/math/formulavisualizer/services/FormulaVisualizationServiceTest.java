package com.math.formulavisualizer.services;

import org.junit.jupiter.api.Test;

import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FormulaVisualizationServiceTest {

  @Test
  public void testGenerateVisualizationData() {
    // Given
    String formula = "x-1";
    String expectedVisualizationData = "Example visualization data for formula: x-1";

    // Mock the service implementation
    FormulaVisualizationService formulaVisualizationService =
        mock(FormulaVisualizationService.class);

    // When
    when(formulaVisualizationService.generateVisualizationData(formula))
        .thenReturn(expectedVisualizationData);

    // Then
    String actualVisualizationData = formulaVisualizationService.generateVisualizationData(formula);
    assertEquals(expectedVisualizationData, actualVisualizationData);
  }
}
