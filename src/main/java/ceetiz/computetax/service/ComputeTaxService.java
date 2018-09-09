package ceetiz.computetax.service;

import ceetiz.computetax.model.EEnterpriseType;
import ceetiz.computetax.model.Enterprise;
import ceetiz.util.BigDecimals;
import com.google.common.annotations.VisibleForTesting;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Optional;

@NoArgsConstructor
public class ComputeTaxService {

    public BigDecimal computeEnterpriseTaxByTurnover(BigDecimal turnover, Enterprise enterprise){
        BigDecimal taxRate = getTaxRateByEnterpriseType(enterprise.getType());
        return BigDecimals.roundUp(taxRate.multiply(turnover));
    }


    //TODO add jpa repository if having database
    @VisibleForTesting
    BigDecimal getTaxRateByEnterpriseType(EEnterpriseType type) {
        return Optional.ofNullable(type.getTaxRate())
                       .orElseThrow(() -> new IllegalArgumentException("Tax Rate not found for enterprise type : " + type));
    }
}
