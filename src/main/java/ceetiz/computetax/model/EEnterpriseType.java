package ceetiz.computetax.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

//TODO replace by a table if having database
@AllArgsConstructor
public enum EEnterpriseType {

    AUTO_ENTREPRENEUR(BigDecimal.valueOf(0.25)),
    SAS(BigDecimal.valueOf(0.33)),
    FALSE_TYPE((null));

    @Getter
    private BigDecimal taxRate;
}
