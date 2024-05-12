package com.math.formulavisualizer.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.math.formulavisualizer.v1.controllers.FormulaController;
import com.math.formulavisualizer.v1.services.FormulaVisualizationService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FormulaController.class)
public class FormulaControllerTest {

  @Autowired private MockMvc mockMvc;

  @MockBean private FormulaVisualizationService formulaVisualizationService;

  @Test
  public void testPostEndpoint() throws Exception {
    // Given
    String formula = "x-1";
    String expectedVisualizationData = "Example visualization data for formula: x-1";
    when(formulaVisualizationService.generateVisualizationData(formula))
        .thenReturn(expectedVisualizationData);

    mockMvc
        .perform(
            post("/api/formula/visualize").contentType(MediaType.APPLICATION_JSON).content("x-1"))
        .andExpect(status().isOk());
  }
}
