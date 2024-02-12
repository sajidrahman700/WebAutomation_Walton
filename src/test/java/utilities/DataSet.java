package utilities;

import org.testng.annotations.DataProvider;

import pages.LoginPage;
import pages.RegisterPage;

public class DataSet {
	
	
	 @DataProvider(name = "invalidUserDataForLogin")
	public static Object invalidCredentialsForLogin(){
		 
		LoginPage loginPage = new LoginPage();
        Object[][] data = {{loginPage.email, "ergwe4776", loginPage.displayErrorMsg},//LoginWithInvalidPassword
                {"dfdr@dhr", loginPage.password, loginPage.displayErrorMsg},//LoginWithInvalidEmail
                {"y587@58h5", "ergwe4776", loginPage.displayErrorMsg},//LoginWithInvalidEmailPassword
                {"",loginPage.password, loginPage.displayErrorMsg},//LoginWithoutPassword
                {loginPage.email, "", loginPage.displayErrorMsg},//LoginWithoutEmail
                {"", "", loginPage.displayErrorMsg}//LoginWithoutEmailPassword
            };

        return data;
    }
	 
	 @DataProvider(name = "invalidUserDataForRegister")
	 public static Object invalidCredentialsForRegister() {
		 
		 RegisterPage registerPage = new RegisterPage();
		 Object [][]data = {{"","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.firstNameErrorMsg, registerPage.displayFirstNameErrorMsg},
				 {"@@@##$","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.firstNameErrorMsg, registerPage.displayFirstNameErrorMsg},
				 {"tefa,,bax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.firstNameErrorMsg, registerPage.displayFirstNameErrorMsg},
				 
				 {"tefabax","","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.lastNameErrorMsg, registerPage.displayLastNameErrorMsg},
				 {"tefabax","@@@##$","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.lastNameErrorMsg, registerPage.displayLastNameErrorMsg},
				 {"tefabax","lay,,mro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.lastNameErrorMsg, registerPage.displayLastNameErrorMsg},
				 
				 {"tefabax","laymro","","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.emailErrorMsg, registerPage.displayEmailErrorMsg},
				 {"tefabax","laymro","tefabax442@l","01923320029","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.emailErrorMsg, registerPage.displayEmailErrorMsg},
				 
				 {"tefabax","laymro","tefabax442@laymro.com","","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.mobileErrorMsg, registerPage.displayMobileErrorMsg},
				 {"tefabax","laymro","tefabax442@laymro.com","01000000000","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.mobileErrorMsg, registerPage.displayMobileErrorMsg},
				 {"tefabax","laymro","tefabax442@laymro.com","01934578","Dhanmondi","Bd@12345678","Bd@12345678", registerPage.mobileErrorMsg, registerPage.displayMobileErrorMsg},
				 
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","@@@@##","Bd@12345678","Bd@12345678", registerPage.addressErrorMsg, registerPage.displayAddressErrorMsg},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","123456","Bd@12345678","Bd@12345678", registerPage.addressErrorMsg, registerPage.displayAddressErrorMsg},
				 
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd","Bd", registerPage.passwordErrorMsg_TooShort, registerPage.displayPasswordErrorMsg_TooShort},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","d@12345678","d@12345678",registerPage.passwordErrorMsg_UppercaseLeter, registerPage.displayPasswordErrorMsg_UppercaseLeter},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","B@12345678","B@12345678", registerPage.passwordErrorMsg_LowercaseLetter, registerPage.displayPasswordErrorMsg_LowercaseLetter},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@","Bd@", registerPage.passwordErrorMsg_Number, registerPage.displayPasswordErrorMsg_Number},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd12345678","Bd12345678", registerPage.passwordErrorMsg_SpecialCharacter, registerPage.displayPasswordErrorMsg_SpecialCharacter},
				 {"tefabax","laymro","tefabax442@laymro.com","01923320029","Dhanmondi","Bd@12345678","Bd@1", registerPage.passwordConfirmErrorMsg, registerPage.displayPasswordConfirmErrorMsg},
		 };
	
		 return data;
	
	 }

}
