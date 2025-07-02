package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.LocatableEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.113192700+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public class ReasonForEncounterPresentingProblemElement implements LocatableEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/Presenting problem
   * Description: Identification of the clinical or social problem motivating the subject of care to seeking healthcare.
   * Comment: Coding of the 'Presenting problem' with a terminology is desirable, where possible. Clinical or social reasons for seeking healthcare can include health issues, symptoms or physical signs. Examples: health issues - desire to quit smoking, domestic violence; symptoms - abdominal pain, shortness of breath; physical signs - an altered conscious state. 'Chief complaint' may be used as a valid synonym for 'Presenting problem' in templates.
   *  
   */
  @Path("/value")
  private DvCodedText value;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/Tree/Presenting problem/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Reason for encounter/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(DvCodedText value) {
     this.value = value;
  }

  public DvCodedText getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
