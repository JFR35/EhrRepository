package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.OptionFor;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.145289200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class BodyTemperatureBodyExposureDvCodedText implements RMEntity, BodyTemperatureBodyExposureChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Body exposure/Body exposure
   * Description: The degree of exposure of the individual at the time of measurement.
   */
  @Path("|defining_code")
  private BodyExposureDefiningCode bodyExposureDefiningCode;

  public void setBodyExposureDefiningCode(BodyExposureDefiningCode bodyExposureDefiningCode) {
     this.bodyExposureDefiningCode = bodyExposureDefiningCode;
  }

  public BodyExposureDefiningCode getBodyExposureDefiningCode() {
     return this.bodyExposureDefiningCode ;
  }
}
