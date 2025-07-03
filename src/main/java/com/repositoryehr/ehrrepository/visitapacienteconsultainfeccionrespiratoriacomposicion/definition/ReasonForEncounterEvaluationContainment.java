package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.openehr.sdk.generator.commons.aql.containment.Containment;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.AqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListAqlFieldImp;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.ListSelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.aql.field.SelectAqlField;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;

public class ReasonForEncounterEvaluationContainment extends Containment {
  public SelectAqlField<ReasonForEncounterEvaluation> REASON_FOR_ENCOUNTER_EVALUATION = new AqlFieldImp<ReasonForEncounterEvaluation>(ReasonForEncounterEvaluation.class, "", "ReasonForEncounterEvaluation", ReasonForEncounterEvaluation.class, this);

  public ListSelectAqlField<ReasonForEncounterPresentingProblemElement> PRESENTING_PROBLEM = new ListAqlFieldImp<ReasonForEncounterPresentingProblemElement>(ReasonForEncounterEvaluation.class, "/data[at0001]/items[at0004]", "presentingProblem", ReasonForEncounterPresentingProblemElement.class, this);

  public SelectAqlField<ItemTree> ITEM_TREE = new AqlFieldImp<ItemTree>(ReasonForEncounterEvaluation.class, "/protocol[at0005]", "itemTree", ItemTree.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ReasonForEncounterEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ReasonForEncounterEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ReasonForEncounterEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ReasonForEncounterEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.reason_for_encounter.v1");
  }

  public static ReasonForEncounterEvaluationContainment getInstance() {
    return new ReasonForEncounterEvaluationContainment();
  }
}
