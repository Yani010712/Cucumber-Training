package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumbercourse.BillCalculationHelper;

import static org.junit.Assert.assertTrue;

public class ScenarioOutlineSteps {

    int InitialBillAmount;
    double TaxRate;

    @Given("I have a Customer")
    public void i_have_a_Customer() {

    }

    @Given("user enters intial bill amount as {int}")
    public void user_enters_intial_bill_amount_as(Integer initialBillAmount) {
        this.InitialBillAmount = initialBillAmount;
        System.out.println("InitialBillAmount: " + initialBillAmount);
    }

    @Given("Sales Tax Rate is {int} Percent")
    public void sales_Tax_Rate_is_Percent(Integer taxRate) {
        this.TaxRate = taxRate;
        System.out.println("Tax Rate: " + taxRate);
    }

    @Then("final bill amount calculated is {int}")
    public void final_bill_amount_calculate_is(Integer expectedValue) {
        double SystemCalcValue =
                BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
        System.out.println("Expected Value: " + expectedValue);
        System.out.println("System Calculated Value: " + SystemCalcValue);
        assertTrue(expectedValue == SystemCalcValue);

    }

    @Given("Sales Tax Rate is {double} Percent")
    public void sales_Tax_Rate_is_Percent(Double taxRate) {
        this.TaxRate = taxRate;
        System.out.println("Tax Rate: " + taxRate);
    }



    @Then("final bill amount calculated is {double}")
    public void final_bill_amount_calculate_is(Double expectedValue) {
        double SystemCalcValue =
                BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
        System.out.println("Expected Value: " + expectedValue);
        System.out.println("System Calculated Value: " + SystemCalcValue);
        assertTrue(expectedValue == SystemCalcValue);

    }

}
