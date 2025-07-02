package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.OptionFor;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.163287+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisDiagnosticCertaintyDvCodedText implements RMEntity, ProblemDiagnosisDiagnosticCertaintyChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Diagnostic certainty/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   * Comment: If an alternative valueset is required, these values can be added to the DV_TEXT data type in a template.
   */
  @Path("|defining_code")
  private DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode;

  public void setDiagnosticCertaintyDefiningCode(
      DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode) {
     this.diagnosticCertaintyDefiningCode = diagnosticCertaintyDefiningCode;
  }

  public DiagnosticCertaintyDefiningCode getDiagnosticCertaintyDefiningCode() {
     return this.diagnosticCertaintyDefiningCode ;
  }
}
