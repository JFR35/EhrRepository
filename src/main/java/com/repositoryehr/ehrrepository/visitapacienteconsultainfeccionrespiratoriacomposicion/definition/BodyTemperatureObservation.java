package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Archetype;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Choice;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.EntryEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.body_temperature.v2")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.118190800+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public class BodyTemperatureObservation implements EntryEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/origin
   */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Protocol/Location of measurement/null_flavour
   */
  @Path("/protocol[at0020]/items[at0021]/null_flavour|defining_code")
  private NullFlavour locationOfMeasurementNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Structured measurement location
   * Description: Structured details about the location of measurement.
   */
  @Path("/protocol[at0020]/items[at0064]")
  private List<Cluster> structuredMeasurementLocation;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Device
   * Description: Details about the device used to measure body temperature.
   */
  @Path("/protocol[at0020]/items[at0059]")
  private Cluster device;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0020]/items[at0062]")
  private List<Cluster> extension;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Location of measurement
   * Description: Simple description about the site of measurement.
   */
  @Path("/protocol[at0020]/items[at0021]/value")
  @Choice
  private BodyTemperatureLocationOfMeasurementChoice locationOfMeasurement;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0002]/events[at0003]")
  @Choice
  private List<BodyTemperatureAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setLocationOfMeasurementNullFlavourDefiningCode(
      NullFlavour locationOfMeasurementNullFlavourDefiningCode) {
     this.locationOfMeasurementNullFlavourDefiningCode = locationOfMeasurementNullFlavourDefiningCode;
  }

  public NullFlavour getLocationOfMeasurementNullFlavourDefiningCode() {
     return this.locationOfMeasurementNullFlavourDefiningCode ;
  }

  public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
     this.structuredMeasurementLocation = structuredMeasurementLocation;
  }

  public List<Cluster> getStructuredMeasurementLocation() {
     return this.structuredMeasurementLocation ;
  }

  public void setDevice(Cluster device) {
     this.device = device;
  }

  public Cluster getDevice() {
     return this.device ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setLocationOfMeasurement(
      BodyTemperatureLocationOfMeasurementChoice locationOfMeasurement) {
     this.locationOfMeasurement = locationOfMeasurement;
  }

  public BodyTemperatureLocationOfMeasurementChoice getLocationOfMeasurement() {
     return this.locationOfMeasurement ;
  }

  public void setAnyEvent(List<BodyTemperatureAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<BodyTemperatureAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
