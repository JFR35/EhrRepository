package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Choice;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.OptionFor;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.PointEventEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.147304500+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class BodyTemperatureAnyEventPointEvent implements PointEventEntity, BodyTemperatureAnyEventChoice {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double temperatureMagnitude;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String temperatureUnits;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Tree/Temperature/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour temperatureNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/State/Body exposure/null_flavour
   */
  @Path("/state[at0029]/items[at0030]/null_flavour|defining_code")
  private NullFlavour bodyExposureNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Environmental conditions
   * Description: Details about the environmental conditions at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0056]")
  private List<Cluster> environmentalConditions;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Exertion
   * Description: Details about the exertion of the person at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0057]")
  private Cluster exertion;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event/Body exposure
   * Description: The degree of exposure of the individual at the time of measurement.
   */
  @Path("/state[at0029]/items[at0030]/value")
  @Choice
  private BodyTemperatureBodyExposureChoice bodyExposure;

  public void setTemperatureMagnitude(Double temperatureMagnitude) {
     this.temperatureMagnitude = temperatureMagnitude;
  }

  public Double getTemperatureMagnitude() {
     return this.temperatureMagnitude ;
  }

  public void setTemperatureUnits(String temperatureUnits) {
     this.temperatureUnits = temperatureUnits;
  }

  public String getTemperatureUnits() {
     return this.temperatureUnits ;
  }

  public void setTemperatureNullFlavourDefiningCode(
      NullFlavour temperatureNullFlavourDefiningCode) {
     this.temperatureNullFlavourDefiningCode = temperatureNullFlavourDefiningCode;
  }

  public NullFlavour getTemperatureNullFlavourDefiningCode() {
     return this.temperatureNullFlavourDefiningCode ;
  }

  public void setBodyExposureNullFlavourDefiningCode(
      NullFlavour bodyExposureNullFlavourDefiningCode) {
     this.bodyExposureNullFlavourDefiningCode = bodyExposureNullFlavourDefiningCode;
  }

  public NullFlavour getBodyExposureNullFlavourDefiningCode() {
     return this.bodyExposureNullFlavourDefiningCode ;
  }

  public void setEnvironmentalConditions(List<Cluster> environmentalConditions) {
     this.environmentalConditions = environmentalConditions;
  }

  public List<Cluster> getEnvironmentalConditions() {
     return this.environmentalConditions ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setBodyExposure(BodyTemperatureBodyExposureChoice bodyExposure) {
     this.bodyExposure = bodyExposure;
  }

  public BodyTemperatureBodyExposureChoice getBodyExposure() {
     return this.bodyExposure ;
  }
}
