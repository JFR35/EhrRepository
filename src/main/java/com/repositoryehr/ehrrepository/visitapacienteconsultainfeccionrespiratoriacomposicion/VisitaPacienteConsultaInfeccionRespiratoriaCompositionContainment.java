package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.MedicationOrderInstruction;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.ProblemDiagnosisEvaluation;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.BodyTemperatureObservation;
import com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition.ReasonForEncounterEvaluation;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.openehr.sdk.generator.commons.aql.containment.Containment;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.AqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListAqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListSelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.SelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Category;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Setting;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Territory;

public class VisitaPacienteConsultaInfeccionRespiratoriaCompositionContainment extends Containment {
  public SelectAqlField<VisitaPacienteConsultaInfeccionRespiratoriaComposition> VISITA_PACIENTE_CONSULTA_INFECCION_RESPIRATORIA_COMPOSITION = new AqlFieldImp<VisitaPacienteConsultaInfeccionRespiratoriaComposition>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "", "VisitaPacienteConsultaInfeccionRespiratoriaComposition", VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<ReasonForEncounterEvaluation> REASON_FOR_ENCOUNTER = new AqlFieldImp<ReasonForEncounterEvaluation>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/content[openEHR-EHR-EVALUATION.reason_for_encounter.v1]", "reasonForEncounter", ReasonForEncounterEvaluation.class, this);

  public SelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new AqlFieldImp<BodyTemperatureObservation>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/content[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "problemDiagnosis", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<MedicationOrderInstruction> MEDICATION_ORDER = new AqlFieldImp<MedicationOrderInstruction>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/content[openEHR-EHR-INSTRUCTION.medication_order.v3]", "medicationOrder", MedicationOrderInstruction.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(VisitaPacienteConsultaInfeccionRespiratoriaComposition.class, "/territory", "territory", Territory.class, this);

  private VisitaPacienteConsultaInfeccionRespiratoriaCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static VisitaPacienteConsultaInfeccionRespiratoriaCompositionContainment getInstance() {
    return new VisitaPacienteConsultaInfeccionRespiratoriaCompositionContainment();
  }
}
