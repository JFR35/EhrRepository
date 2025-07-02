package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvCodedText;
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
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.158287200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public class ProblemDiagnosisEvaluation implements EntryEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0002]/value")
  private DvCodedText problemDiagnosisName;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/structure/Problem/Diagnosis name/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Structured body site
   * Description: A structured anatomical location for the problem or diagnosis.
   * Comment: Use this SLOT to insert the CLUSTER.anatomical_location or CLUSTER.relative_location archetypes if the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations.
   *
   * If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, use of this SLOT becomes redundant.
   */
  @Path("/data[at0001]/items[at0039]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Date/time clinically recognised
   * Description: Estimated or actual date/time the diagnosis or problem was recognised by a healthcare professional.
   * Comment: Partial dates are acceptable. If the subject of care is under the age of one year, then the complete date or a minimum of the month and year is necessary to enable accurate age calculations - for example, if used to drive decision support. Data captured/imported as "Age at time of clinical recognition" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0003]/value|value")
  private TemporalAccessor dateTimeClinicallyRecognisedValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/structure/Date/time clinically recognised/null_flavour
   */
  @Path("/data[at0001]/items[at0003]/null_flavour|defining_code")
  private NullFlavour dateTimeClinicallyRecognisedNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/structure/Severity/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour severityNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Specific details
   * Description: Details that are additionally required to record as unique attributes of this problem or diagnosis.
   * Comment: May include structured detail about the grading or staging of the diagnosis; diagnostic criteria, classification criteria or formal severity assessments such as Common Terminology Criteria for Adverse Events.
   */
  @Path("/data[at0001]/items[at0043]")
  private List<Cluster> specificDetails;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Date/time of resolution
   * Description: Estimated or actual date/time of resolution or remission for this problem or diagnosis, as determined by a healthcare professional.
   * Comment: Partial dates are acceptable. If the subject of care is under the age of one year, then the complete date or a minimum of the month and year is necessary to enable accurate age calculations - for example, if used to drive decision support. Data captured/imported as "Age at time of resolution" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0030]/value|value")
  private TemporalAccessor dateTimeOfResolutionValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/structure/Date/time of resolution/null_flavour
   */
  @Path("/data[at0001]/items[at0030]/null_flavour|defining_code")
  private NullFlavour dateTimeOfResolutionNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Status
   * Description: Structured details for location-, domain-, episode- or workflow-specific aspects of the diagnostic process.
   * Comment: Use status or context qualifiers with care, as they are variably used in practice and interoperability cannot be assured unless usage is clearly defined with the community of use. For example: active status - active, inactive, resolved, in remission; evolution status - initial, interim/working, final; temporal status - current, past; episodicity status - first, new, ongoing; admission status - admission, discharge; or priority status - primary, secondary.
   */
  @Path("/data[at0001]/items[at0046]")
  private List<Cluster> status;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/structure/Diagnostic certainty/null_flavour
   */
  @Path("/data[at0001]/items[at0073]/null_flavour|defining_code")
  private NullFlavour diagnosticCertaintyNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> extension;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   * Comment: If an alternative valueset is required, these values can be added to the DV_TEXT data type in a template.
   */
  @Path("/data[at0001]/items[at0073]/value")
  @Choice
  private ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Problem/Diagnosis/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   * Comment: If severity is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant. Note: more specific grading of severity can be recorded using the Specific details SLOT.
   */
  @Path("/data[at0001]/items[at0005]/value")
  @Choice
  private ProblemDiagnosisSeverityChoice severity;

  public void setProblemDiagnosisName(DvCodedText problemDiagnosisName) {
     this.problemDiagnosisName = problemDiagnosisName;
  }

  public DvCodedText getProblemDiagnosisName() {
     return this.problemDiagnosisName ;
  }

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setDateTimeClinicallyRecognisedValue(
      TemporalAccessor dateTimeClinicallyRecognisedValue) {
     this.dateTimeClinicallyRecognisedValue = dateTimeClinicallyRecognisedValue;
  }

  public TemporalAccessor getDateTimeClinicallyRecognisedValue() {
     return this.dateTimeClinicallyRecognisedValue ;
  }

  public void setDateTimeClinicallyRecognisedNullFlavourDefiningCode(
      NullFlavour dateTimeClinicallyRecognisedNullFlavourDefiningCode) {
     this.dateTimeClinicallyRecognisedNullFlavourDefiningCode = dateTimeClinicallyRecognisedNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeClinicallyRecognisedNullFlavourDefiningCode() {
     return this.dateTimeClinicallyRecognisedNullFlavourDefiningCode ;
  }

  public void setSeverityNullFlavourDefiningCode(NullFlavour severityNullFlavourDefiningCode) {
     this.severityNullFlavourDefiningCode = severityNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityNullFlavourDefiningCode() {
     return this.severityNullFlavourDefiningCode ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setDateTimeOfResolutionValue(TemporalAccessor dateTimeOfResolutionValue) {
     this.dateTimeOfResolutionValue = dateTimeOfResolutionValue;
  }

  public TemporalAccessor getDateTimeOfResolutionValue() {
     return this.dateTimeOfResolutionValue ;
  }

  public void setDateTimeOfResolutionNullFlavourDefiningCode(
      NullFlavour dateTimeOfResolutionNullFlavourDefiningCode) {
     this.dateTimeOfResolutionNullFlavourDefiningCode = dateTimeOfResolutionNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeOfResolutionNullFlavourDefiningCode() {
     return this.dateTimeOfResolutionNullFlavourDefiningCode ;
  }

  public void setStatus(List<Cluster> status) {
     this.status = status;
  }

  public List<Cluster> getStatus() {
     return this.status ;
  }

  public void setDiagnosticCertaintyNullFlavourDefiningCode(
      NullFlavour diagnosticCertaintyNullFlavourDefiningCode) {
     this.diagnosticCertaintyNullFlavourDefiningCode = diagnosticCertaintyNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticCertaintyNullFlavourDefiningCode() {
     return this.diagnosticCertaintyNullFlavourDefiningCode ;
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

  public void setDiagnosticCertainty(
      ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty) {
     this.diagnosticCertainty = diagnosticCertainty;
  }

  public ProblemDiagnosisDiagnosticCertaintyChoice getDiagnosticCertainty() {
     return this.diagnosticCertainty ;
  }

  public void setSeverity(ProblemDiagnosisSeverityChoice severity) {
     this.severity = severity;
  }

  public ProblemDiagnosisSeverityChoice getSeverity() {
     return this.severity ;
  }
}
