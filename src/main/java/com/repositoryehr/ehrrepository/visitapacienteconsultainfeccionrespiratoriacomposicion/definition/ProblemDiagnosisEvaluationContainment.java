package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvCodedText;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.openehr.sdk.generator.commons.aql.containment.Containment;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.AqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListAqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListSelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.SelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

public class ProblemDiagnosisEvaluationContainment extends Containment {
  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS_EVALUATION = new AqlFieldImp<ProblemDiagnosisEvaluation>(ProblemDiagnosisEvaluation.class, "", "ProblemDiagnosisEvaluation", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<DvCodedText> PROBLEM_DIAGNOSIS_NAME = new AqlFieldImp<DvCodedText>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/value", "problemDiagnosisName", DvCodedText.class, this);

  public SelectAqlField<NullFlavour> PROBLEM_DIAGNOSIS_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "problemDiagnosisNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0039]", "structuredBodySite", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_CLINICALLY_RECOGNISED_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0003]/value|value", "dateTimeClinicallyRecognisedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_CLINICALLY_RECOGNISED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "dateTimeClinicallyRecognisedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> SEVERITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "severityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0043]", "specificDetails", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_OF_RESOLUTION_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0030]/value|value", "dateTimeOfResolutionValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_OF_RESOLUTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0030]/null_flavour|defining_code", "dateTimeOfResolutionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STATUS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0046]", "status", Cluster.class, this);

  public SelectAqlField<NullFlavour> DIAGNOSTIC_CERTAINTY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0073]/null_flavour|defining_code", "diagnosticCertaintyNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0071]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProblemDiagnosisEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProblemDiagnosisEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ProblemDiagnosisDiagnosticCertaintyChoice> DIAGNOSTIC_CERTAINTY = new AqlFieldImp<ProblemDiagnosisDiagnosticCertaintyChoice>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0073]/value", "diagnosticCertainty", ProblemDiagnosisDiagnosticCertaintyChoice.class, this);

  public SelectAqlField<ProblemDiagnosisSeverityChoice> SEVERITY = new AqlFieldImp<ProblemDiagnosisSeverityChoice>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0005]/value", "severity", ProblemDiagnosisSeverityChoice.class, this);

  private ProblemDiagnosisEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static ProblemDiagnosisEvaluationContainment getInstance() {
    return new ProblemDiagnosisEvaluationContainment();
  }
}
