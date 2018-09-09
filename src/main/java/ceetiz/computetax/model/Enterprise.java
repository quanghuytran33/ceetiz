package ceetiz.computetax.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public abstract class Enterprise {

    protected EEnterpriseType type;

    private String Siret;

    private String denomination;

    protected Enterprise(EEnterpriseType type){
        this.type = type;
    }

    public Enterprise(String siret, String denomination) {
        Siret = siret;
        this.denomination = denomination;
    }
}
