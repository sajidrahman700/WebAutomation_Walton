package utilities;

import org.testng.annotations.DataProvider;

import pages.LoginPage;

public class DataSet {
	static LoginPage loginPage = new LoginPage();
	
	 @DataProvider(name = "invalidUserData")
	public static Object invalidCredentials(){
        Object[][] data = {{loginPage.email, "ergwe4776", loginPage.displayErrorMsg},
                {"dfdr@dhr", loginPage.password, loginPage.displayErrorMsg},
                {"y587@58h5", "ergwe4776", loginPage.displayErrorMsg},
                {"",loginPage.password, loginPage.displayErrorMsg},
                {loginPage.email, "", loginPage.displayErrorMsg},
                {"", "", loginPage.displayErrorMsg}
            };
        

        return data;
    }

}
