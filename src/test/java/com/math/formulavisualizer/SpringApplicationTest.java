package com.math.formulavisualizer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

@SpringJUnitConfig
@SpringBootTest
class SpringApplicationTest {

  @MockBean private FormulaVisualizationService formulaVisualizationService;

  @Test
  void contextLoads() {}
}
