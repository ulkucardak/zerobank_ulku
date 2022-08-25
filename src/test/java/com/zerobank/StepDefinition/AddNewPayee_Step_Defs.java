package com.zerobank.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class AddNewPayee_Step_Defs {

    String payeeName;

    @Given("Add New Payee tab")
    public void add_new_payee_tab() {

    }
    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> payeeInfo) {


    }
    @Then("The new payee {string} was successfully created should be displayed")
    public void message_the_new_payee_was_successfully_created_should_be_displayed(String payeeName) {

    }


}
