package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UsersTable_StepDefinitions {

    UsersPage usersPage = new UsersPage();
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedColumnsNames) {
       // System.out.println("expectedColumnsNames = " + expectedColumnsNames);
       // System.out.println("expectedColumnsNames.size() = " + expectedColumnsNames.size());
        BrowserUtils.waitForVisibility(usersPage.showRecordsDropdown,5);
        List<String> actualColumnNames = BrowserUtils.getElementsText(usersPage.tableHeaders);
        Assert.assertEquals(expectedColumnsNames, actualColumnNames);
    }

}
