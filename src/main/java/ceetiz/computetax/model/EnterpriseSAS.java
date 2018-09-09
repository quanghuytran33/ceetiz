package ceetiz.computetax.model;

import lombok.*;

import static ceetiz.computetax.model.EEnterpriseType.AUTO_ENTREPRENEUR;
import static ceetiz.computetax.model.EEnterpriseType.SAS;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class EnterpriseSAS extends Enterprise {

    private String address;

    public EnterpriseSAS() {
        super(SAS);
    }

    @Builder
    public EnterpriseSAS(String Siret, String denomination, String address) {
        super(Siret, denomination);
        this.type = SAS;
        this.address = address;
    }
}
