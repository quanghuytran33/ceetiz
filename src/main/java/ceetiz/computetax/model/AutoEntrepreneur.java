package ceetiz.computetax.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import static ceetiz.computetax.model.EEnterpriseType.AUTO_ENTREPRENEUR;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class AutoEntrepreneur extends Enterprise {

    public AutoEntrepreneur() {
        super(AUTO_ENTREPRENEUR);
    }

    @Builder
    public AutoEntrepreneur(String siret, String denomination) {
        super(siret, denomination);
        this.type = AUTO_ENTREPRENEUR;
    }
}
