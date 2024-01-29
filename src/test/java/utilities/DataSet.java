package utilities;

import org.testng.annotations.DataProvider;

import pages.LoginPage;

public class DataSet {
	static LoginPage loginPage = new LoginPage();
	
	 @DataProvider(name = "invalidUserData")
	public static Object invalidCredentials(){
        Object[][] data = {{loginPage.email, "ergwe4776", loginPage.displayErrorMsg},//LoginWithInvalidPassword
                {"dfdr@dhr", loginPage.password, loginPage.displayErrorMsg},//LoginWithInvalidEmail
                {"y587@58h5", "ergwe4776", loginPage.displayErrorMsg},//LoginWithInvalidEmailPassword
                {"",loginPage.password, loginPage.displayErrorMsg},//LoginWithoutPassword
                {loginPage.email, "", loginPage.displayErrorMsg},//LoginWithoutEmail
                {"", "", loginPage.displayErrorMsg}//LoginWithoutEmailPassword
            };

        return data;
    }

}