package ceetiz.computetax.factory;

import ceetiz.computetax.model.AutoEntrepreneur;
import ceetiz.computetax.model.EEnterpriseType;
import ceetiz.computetax.model.Enterprise;
import ceetiz.computetax.model.EnterpriseSAS;

public class EnterpriseFactory {

    private EnterpriseFactory(){
        throw new UnsupportedOperationException("");
    }

    public static Enterprise createEnterprise(EEnterpriseType type){

        switch (type){
            case SAS:
                return new EnterpriseSAS();
            case AUTO_ENTREPRENEUR:
                return new AutoEntrepreneur();
            default:
                throw new IllegalArgumentException("Enterprise type " + type + " doens't supported");
        }
    }
}
