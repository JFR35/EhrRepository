package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvCodedText;
import com.nedap.archie.rm.datavalues.encapsulated.DvParsable;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Path;
import org.ehrbase.openehr.sdk.generator.commons.interfaces.LocatableEntity;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.167286400+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public class MedicationOrderOrderActivity implements LocatableEntity {
  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Medication item
   * Description: Name of the medication, vaccine or other therapeutic/prescribable item being ordered.
   * Comment: Depending on the prescribing context this field could be used for either generic- or product-based prescribing. This data field can be used to record tightly bound orders of different medications when they are prescribed as a single pack. It is strongly recommended that the 'Medication item' be coded with a terminology capable of triggering decision support, where possible. The extent of coding may vary from the simple name of the medication item through to structured details about the actual medication pack to be used. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/description[at0002]/items[at0070]/value")
  private DvCodedText medicationItem;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Tree/Medication item/null_flavour
   */
  @Path("/description[at0002]/items[at0070]/null_flavour|defining_code")
  private NullFlavour medicationItemNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Medication details
   * Description: Structured details about the overall medication including strength, form and constituent substances.
   * Comment: Use this SLOT where the detailed description of the ordered item needs to be explicitly stated. For example: the form, strength, any diluents or mixture of ingredients.
   */
  @Path("/description[at0002]/items[at0143]")
  private Cluster medicationDetails;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Route
   * Description: The route by which the ordered item is to be administered into the subject's body.
   * Comment: For example: 'oral', 'intravenous', or 'topical'.
   * Coding of the route with a terminology is preferred, where possible. Multiple potential routes may be specified.
   */
  @Path("/description[at0002]/items[at0091]")
  private List<MedicationOrderRouteElement> route;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Structured body site
   * Description: Structured description of the site of administration of the ordered item.
   */
  @Path("/description[at0002]/items[at0093]")
  private Cluster structuredBodySite;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Administration device
   * Description: Details of the medical device used to assist administration of the ordered item.
   */
  @Path("/description[at0002]/items[at0095]")
  private List<Cluster> administrationDevice;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Structured dose and timing directions
   * Description: Details of structured dose and timing directions.
   * Comment: This SLOT has been designed to be used with the CLUSTER.therapeutic_direction archetype to enable recording of a complex set of dosage and timing directions. While it's possible to use other CLUSTER archetypes within this SLOT, it's strongly advised to do so only when predictable queryability is not a priority.
   */
  @Path("/description[at0002]/items[at0177]")
  private List<Cluster> structuredDoseAndTimingDirections;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Monitoring instruction
   * Description: An additional instruction which gives advice on recommended or required monitoring of the ordered item.
   * Comment: For example: 'Please check renal function in 2 weeks'. This data element allows multiple occurrences.
   */
  @Path("/description[at0002]/items[at0107]")
  private List<MedicationOrderMonitoringInstructionElement> monitoringInstruction;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Order details/Order start date/time
   * Description: The date and optional time to commence use of the ordered item.
   */
  @Path("/description[at0002]/items[at0113]/items[at0012]/value|value")
  private TemporalAccessor orderStartDateTimeValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Tree/Order details/Order start date/time/null_flavour
   */
  @Path("/description[at0002]/items[at0113]/items[at0012]/null_flavour|defining_code")
  private NullFlavour orderStartDateTimeNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Order details/Order stop date/time
   * Description: The date and optional time when it is planned to cease use of the ordered item.
   */
  @Path("/description[at0002]/items[at0113]/items[at0013]/value|value")
  private TemporalAccessor orderStopDateTimeValue;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Tree/Order details/Order stop date/time/null_flavour
   */
  @Path("/description[at0002]/items[at0113]/items[at0013]/null_flavour|defining_code")
  private NullFlavour orderStopDateTimeNullFlavourDefiningCode;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Order details/Order summary
   * Description: Summary information about use of the ordered item, such as current status or key dates, generally used in non-prescription contexts.
   * Comment: Course summary may be required when transmitting medication information between systems or representing a FHIR Medication statement. For example: as part of a referral, emergency patient summary or discharge communication.
   */
  @Path("/description[at0002]/items[at0113]/items[at0112]")
  private List<Cluster> orderSummary;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Authorisation directions
   * Description: Details of authorisation of the ordered item, including supporting local self-administration, issue and endorsement policies.
   * Comment: For example: details of repeat/refill supply. This SLOT allows for local variation in the different jurisdictions regarding medication authorisation and re-authorisation to be managed.
   */
  @Path("/description[at0002]/items[at0069]")
  private List<Cluster> authorisationDirections;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/Additional details
   * Description: Additional structured details about the ordered item not captured in other fields.
   */
  @Path("/description[at0002]/items[at0166]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/timing
   */
  @Path("/timing")
  private DvParsable timing;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/action_archetype_id
   */
  @Path("/action_archetype_id")
  private String actionArchetypeId;

  /**
   * Path: Visita Paciente consulta infección respiratoria/Medication order/Order/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setMedicationItem(DvCodedText medicationItem) {
     this.medicationItem = medicationItem;
  }

  public DvCodedText getMedicationItem() {
     return this.medicationItem ;
  }

  public void setMedicationItemNullFlavourDefiningCode(
      NullFlavour medicationItemNullFlavourDefiningCode) {
     this.medicationItemNullFlavourDefiningCode = medicationItemNullFlavourDefiningCode;
  }

  public NullFlavour getMedicationItemNullFlavourDefiningCode() {
     return this.medicationItemNullFlavourDefiningCode ;
  }

  public void setMedicationDetails(Cluster medicationDetails) {
     this.medicationDetails = medicationDetails;
  }

  public Cluster getMedicationDetails() {
     return this.medicationDetails ;
  }

  public void setRoute(List<MedicationOrderRouteElement> route) {
     this.route = route;
  }

  public List<MedicationOrderRouteElement> getRoute() {
     return this.route ;
  }

  public void setStructuredBodySite(Cluster structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public Cluster getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setAdministrationDevice(List<Cluster> administrationDevice) {
     this.administrationDevice = administrationDevice;
  }

  public List<Cluster> getAdministrationDevice() {
     return this.administrationDevice ;
  }

  public void setStructuredDoseAndTimingDirections(
      List<Cluster> structuredDoseAndTimingDirections) {
     this.structuredDoseAndTimingDirections = structuredDoseAndTimingDirections;
  }

  public List<Cluster> getStructuredDoseAndTimingDirections() {
     return this.structuredDoseAndTimingDirections ;
  }

  public void setMonitoringInstruction(
      List<MedicationOrderMonitoringInstructionElement> monitoringInstruction) {
     this.monitoringInstruction = monitoringInstruction;
  }

  public List<MedicationOrderMonitoringInstructionElement> getMonitoringInstruction() {
     return this.monitoringInstruction ;
  }

  public void setOrderStartDateTimeValue(TemporalAccessor orderStartDateTimeValue) {
     this.orderStartDateTimeValue = orderStartDateTimeValue;
  }

  public TemporalAccessor getOrderStartDateTimeValue() {
     return this.orderStartDateTimeValue ;
  }

  public void setOrderStartDateTimeNullFlavourDefiningCode(
      NullFlavour orderStartDateTimeNullFlavourDefiningCode) {
     this.orderStartDateTimeNullFlavourDefiningCode = orderStartDateTimeNullFlavourDefiningCode;
  }

  public NullFlavour getOrderStartDateTimeNullFlavourDefiningCode() {
     return this.orderStartDateTimeNullFlavourDefiningCode ;
  }

  public void setOrderStopDateTimeValue(TemporalAccessor orderStopDateTimeValue) {
     this.orderStopDateTimeValue = orderStopDateTimeValue;
  }

  public TemporalAccessor getOrderStopDateTimeValue() {
     return this.orderStopDateTimeValue ;
  }

  public void setOrderStopDateTimeNullFlavourDefiningCode(
      NullFlavour orderStopDateTimeNullFlavourDefiningCode) {
     this.orderStopDateTimeNullFlavourDefiningCode = orderStopDateTimeNullFlavourDefiningCode;
  }

  public NullFlavour getOrderStopDateTimeNullFlavourDefiningCode() {
     return this.orderStopDateTimeNullFlavourDefiningCode ;
  }

  public void setOrderSummary(List<Cluster> orderSummary) {
     this.orderSummary = orderSummary;
  }

  public List<Cluster> getOrderSummary() {
     return this.orderSummary ;
  }

  public void setAuthorisationDirections(List<Cluster> authorisationDirections) {
     this.authorisationDirections = authorisationDirections;
  }

  public List<Cluster> getAuthorisationDirections() {
     return this.authorisationDirections ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setTiming(DvParsable timing) {
     this.timing = timing;
  }

  public DvParsable getTiming() {
     return this.timing ;
  }

  public void setActionArchetypeId(String actionArchetypeId) {
     this.actionArchetypeId = actionArchetypeId;
  }

  public String getActionArchetypeId() {
     return this.actionArchetypeId ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
