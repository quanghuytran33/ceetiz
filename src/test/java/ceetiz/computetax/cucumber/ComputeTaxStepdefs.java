package ceetiz.computetax.cucumber;

import ceetiz.computetax.factory.EnterpriseFactory;
import ceetiz.computetax.model.EEnterpriseType;
import ceetiz.computetax.model.Enterprise;
import ceetiz.computetax.service.ComputeTaxService;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.math.BigDecimal;

public class ComputeTaxStepdefs {

    private Enterprise enterprise;
    private BigDecimal turnover;
    private BigDecimal tax;
    private ComputeTaxService service = new ComputeTaxService();

    @Given("^an enterprise \"([^\"]*)\"$")
    public void anEnterprise(EEnterpriseType type) throws Throwable {
        enterprise = EnterpriseFactory.createEnterprise(type);
    }

    @And("^turnover is ([0-9]+\\.[0-9]{2})$")
    public void turnoverIs(BigDecimal turnover) throws Throwable {
        this.turnover = turnover;
    }

    @When("^compute tax$")
    public void computeTax() throws Throwable {
        tax = service.computeEnterpriseTaxByTurnover(turnover, enterprise);
    }

    @Then("^tax computed is ([0-9]+\\.[0-9]{2})$")
    public void taxComputedIs(BigDecimal taxExpected) throws Throwable {
        Assert.assertEquals(taxExpected, tax);
    }
}
