package workeroSeleniumPractice;

import org.junit.Test;
import supplierPages.*;


import static junit.framework.Assert.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateOfficeTests extends BaseDriver {

    @Test
    public void setNewOffice() {
        LoginPage loginPage = new LoginPage(driver);
        WorkeroHomePage homePage = loginPage.loginAsSupplier("andrei.raschitor@expertnetwork.ro","secret");
        assertThat(driver.getTitle(),is("WORKERO - Home supplier"));

        FirstOfficeStepPage firstStep =  homePage.addOffice();
        firstStep.setOfficeName("ING");
        firstStep.setOfficeVat("VAT 25 %");

        SecondOfficeStepPage secondPage = firstStep.setContactInfo();
        ThirdOfficeStepPage thirdPage = secondPage.setCalendarManagement();
        FourthOfficeStepPage fourthPage =  thirdPage.setAmenitiesAndServices("");
        FifthOfficeStepPage fifthPage = fourthPage.houseRule("houseRule");
        SubmitToReviewEditModePage submit = fifthPage.setProductType("","");



    }
}
