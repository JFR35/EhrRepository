package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.OptionFor;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.165285200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisSeverityDvCodedText implements RMEntity, ProblemDiagnosisSeverityChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Severity/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   * Comment: If severity is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant. Note: more specific grading of severity can be recorded using the Specific details SLOT.
   */
  @Path("|defining_code")
  private SeverityDefiningCode severityDefiningCode;

  public void setSeverityDefiningCode(SeverityDefiningCode severityDefiningCode) {
     this.severityDefiningCode = severityDefiningCode;
  }

  public SeverityDefiningCode getSeverityDefiningCode() {
     return this.severityDefiningCode ;
  }
}
