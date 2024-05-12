package com.math.formulavisualizer.serviceImpls;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.math.formulavisualizer.v1.serviceImpls.FormulaVisualizationServiceImpl;
import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FormulaVisualizationServiceImplTest {

  @Mock private FormulaVisualizationService formulaVisualizationService;

  @InjectMocks private FormulaVisualizationServiceImpl formulaVisualizationServiceImpl;

  @Test
  public void testGenerateVisualizationData() {
    // Given
    String formula = "x-1";
    String expectedVisualizationData = "Example visualization data for formula: x-1";

    // When
    String actualVisualizationData =
        formulaVisualizationServiceImpl.generateVisualizationData(formula);

    // Then
    assertEquals(expectedVisualizationData, actualVisualizationData);
  }
}
