package ceetiz.computetax.factory;

import ceetiz.computetax.model.AutoEntrepreneur;
import ceetiz.computetax.model.EEnterpriseType;
import ceetiz.computetax.model.EnterpriseSAS;
import org.junit.Test;

import static ceetiz.computetax.model.EEnterpriseType.*;
import static org.junit.Assert.*;

public class EnterpriseFactoryTest {

    @Test
    public void should_create_sas() {
        assertTrue(EnterpriseFactory.createEnterprise(SAS) instanceof EnterpriseSAS);
    }

    @Test
    public void should_create_entrepreneur() {
        assertTrue(EnterpriseFactory.createEnterprise(AUTO_ENTREPRENEUR) instanceof AutoEntrepreneur);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception(){
        EnterpriseFactory.createEnterprise(FALSE_TYPE);
    }

}