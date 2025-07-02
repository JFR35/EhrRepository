package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.generic.PartyProxy;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Archetype;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.EntryEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.reason_for_encounter.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.112192+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public class ReasonForEncounterEvaluation implements EntryEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/Presenting problem
   * Description: Identification of the clinical or social problem motivating the subject of care to seeking healthcare.
   * Comment: Coding of the 'Presenting problem' with a terminology is desirable, where possible. Clinical or social reasons for seeking healthcare can include health issues, symptoms or physical signs. Examples: health issues - desire to quit smoking, domestic violence; symptoms - abdominal pain, shortness of breath; physical signs - an altered conscious state. 'Chief complaint' may be used as a valid synonym for 'Presenting problem' in templates.
   *  
   */
  @Path("/data[at0001]/items[at0004]")
  private List<ReasonForEncounterPresentingProblemElement> presentingProblem;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/Item tree
   * Description: @ internal @
   */
  @Path("/protocol[at0005]")
  private ItemTree itemTree;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setPresentingProblem(
      List<ReasonForEncounterPresentingProblemElement> presentingProblem) {
     this.presentingProblem = presentingProblem;
  }

  public List<ReasonForEncounterPresentingProblemElement> getPresentingProblem() {
     return this.presentingProblem ;
  }

  public void setItemTree(ItemTree itemTree) {
     this.itemTree = itemTree;
  }

  public ItemTree getItemTree() {
     return this.itemTree ;
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
}
