package com.repositoryehr.ehrrepository.visitapacienteconsultainfeccionrespiratoriacomposicion.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.openehr.sdk.generator.commons.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2025-07-02T12:10:10.151286800+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.23.0-SNAPSHOT"
)
public interface BodyTemperatureAnyEventChoice {
  NullFlavour getTemperatureNullFlavourDefiningCode();

  void setTemperatureNullFlavourDefiningCode(NullFlavour temperatureNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getTemperatureUnits();

  void setTemperatureUnits(String temperatureUnits);

  Double getTemperatureMagnitude();

  void setTemperatureMagnitude(Double temperatureMagnitude);

  NullFlavour getBodyExposureNullFlavourDefiningCode();

  void setBodyExposureNullFlavourDefiningCode(NullFlavour bodyExposureNullFlavourDefiningCode);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  BodyTemperatureBodyExposureChoice getBodyExposure();

  void setBodyExposure(BodyTemperatureBodyExposureChoice bodyExposure);

  List<Cluster> getEnvironmentalConditions();

  void setEnvironmentalConditions(List<Cluster> environmentalConditions);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);
}
