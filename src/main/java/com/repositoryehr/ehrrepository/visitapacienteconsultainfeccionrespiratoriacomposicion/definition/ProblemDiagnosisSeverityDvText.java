package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.OptionFor;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.166284900+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisSeverityDvText implements RMEntity, ProblemDiagnosisSeverityChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Severity/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   * Comment: If severity is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant. Note: more specific grading of severity can be recorded using the Specific details SLOT.
   */
  @Path("|value")
  private String severityValue;

  public void setSeverityValue(String severityValue) {
     this.severityValue = severityValue;
  }

  public String getSeverityValue() {
     return this.severityValue ;
  }
}
