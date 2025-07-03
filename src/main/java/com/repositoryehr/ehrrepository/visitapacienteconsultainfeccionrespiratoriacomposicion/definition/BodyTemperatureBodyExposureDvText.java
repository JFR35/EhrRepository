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
    date = "2025-07-02T12:10:10.146284600+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class BodyTemperatureBodyExposureDvText implements RMEntity, BodyTemperatureBodyExposureChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Body exposure/Body exposure
   * Description: The degree of exposure of the individual at the time of measurement.
   */
  @Path("|value")
  private String bodyExposureValue;

  public void setBodyExposureValue(String bodyExposureValue) {
     this.bodyExposureValue = bodyExposureValue;
  }

  public String getBodyExposureValue() {
     return this.bodyExposureValue ;
  }
}
