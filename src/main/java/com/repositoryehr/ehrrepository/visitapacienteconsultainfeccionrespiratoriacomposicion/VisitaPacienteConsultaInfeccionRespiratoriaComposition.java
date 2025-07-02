package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import com.nedap.archie.rm.support.identification.ObjectVersionId;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.MedicationOrderInstruction;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.ProblemDiagnosisEvaluation;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.BodyTemperatureObservation;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.ReasonForEncounterEvaluation;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Archetype;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Id;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Template;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.CompositionEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Category;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Setting;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Territory;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.encounter.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.091134+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
@Template("Visita Paciente consulta infección respiratoria")
public class VisitaPacienteConsultaInfeccionRespiratoriaComposition implements CompositionEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: Visita Paciente consulta infección respiratoria/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter
   * Description: The reason for initiation of any healthcare encounter or contact by the individual who is the subject of care.
   */
  @Path("/content[openEHR-EHR-EVALUATION.reason_for_encounter.v1]")
  private ReasonForEncounterEvaluation reasonForEncounter;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Body temperature
   * Description: A measurement of the body temperature, which is a surrogate for the core body temperature of the individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.body_temperature.v2]")
  private BodyTemperatureObservation bodyTemperature;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation problemDiagnosis;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order
   * Description: An order for a medication, vaccine, nutritional product or other therapeutic item for an identified individual.
   */
  @Path("/content[openEHR-EHR-INSTRUCTION.medication_order.v3]")
  private MedicationOrderInstruction medicationOrder;

  /**
   * Path: Visita Paciente consulta infección respiratoria/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: Visita Paciente consulta infección respiratoria/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Visita Paciente consulta infección respiratoria/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Visita Paciente consulta infección respiratoria/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private ObjectVersionId versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setReasonForEncounter(ReasonForEncounterEvaluation reasonForEncounter) {
     this.reasonForEncounter = reasonForEncounter;
  }

  public ReasonForEncounterEvaluation getReasonForEncounter() {
     return this.reasonForEncounter ;
  }

  public void setBodyTemperature(BodyTemperatureObservation bodyTemperature) {
     this.bodyTemperature = bodyTemperature;
  }

  public BodyTemperatureObservation getBodyTemperature() {
     return this.bodyTemperature ;
  }

  public void setProblemDiagnosis(ProblemDiagnosisEvaluation problemDiagnosis) {
     this.problemDiagnosis = problemDiagnosis;
  }

  public ProblemDiagnosisEvaluation getProblemDiagnosis() {
     return this.problemDiagnosis ;
  }

  public void setMedicationOrder(MedicationOrderInstruction medicationOrder) {
     this.medicationOrder = medicationOrder;
  }

  public MedicationOrderInstruction getMedicationOrder() {
     return this.medicationOrder ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
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

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public ObjectVersionId getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(ObjectVersionId versionUid) {
     this.versionUid = versionUid;
  }
}
