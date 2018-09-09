package ceetiz.computetax.service;

import ceetiz.computetax.model.AutoEntrepreneur;
import ceetiz.computetax.model.EnterpriseSAS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static ceetiz.computetax.model.EEnterpriseType.*;
import static java.math.BigDecimal.valueOf;
import static org.junit.Assert.*;

public class ComputeTaxServiceTest {

    ComputeTaxService service = new ComputeTaxService();

    @Test
    public void should_return_entrepreneur_rate() {
        assertEquals(valueOf(0.25), service.getTaxRateByEnterpriseType(AUTO_ENTREPRENEUR));
    }

    @Test
    public void should_return_sas_rate(){
        assertEquals(valueOf(0.33), service.getTaxRateByEnterpriseType(SAS));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_rate_not_found(){
        service.getTaxRateByEnterpriseType(FALSE_TYPE);
    }

    @Test
    public void should_return_sas_tax(){
        EnterpriseSAS sas = new EnterpriseSAS();
        assertEquals(valueOf(33.26), service.computeEnterpriseTaxByTurnover(valueOf(100.77), sas));
    }

    @Test
    public void should_return_entrepreneur_tax(){
        AutoEntrepreneur sas = new AutoEntrepreneur();
        assertEquals(valueOf(25.17), service.computeEnterpriseTaxByTurnover(valueOf(100.66), sas));
    }

}