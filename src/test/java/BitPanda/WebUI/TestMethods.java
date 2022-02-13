package BitPanda.WebUI;


public class TestMethods extends SeleniumBase {

    public void login() {
        sOpen("http://automationpractice.com/index.php");

        sClick(Selectors.loginMainButton);
        sType(Selectors.loginEmailInput, "doricroman@gmail.com");
        sType(Selectors.loginPasswordInput, "MzPassword");
        sClick(Selectors.loginSubmit);
        sWait(Selectors.myAccountTab);
    }

    public void signUp() {
        sOpen("http://automationpractice.com/index.php");

        sClick(Selectors.loginMainButton);
        sType(Selectors.createUserEmailInput, "test@panda.com");
        sClick(Selectors.createAccount);

        sType(Selectors.newAccountFirstName, "Eduardo");
        sType(Selectors.newAccountLastName, "Panda");
        sType(Selectors.newAccountPassword, "IAmPanda");

        sType(Selectors.newAddressFirstName, "Eduardo");
        sType(Selectors.newAddressLastName, "Panda");
        sType(Selectors.newAddressAddress, "Panda Street 42, PandaInc.");
        sType(Selectors.newAddressCity, "Panda City");
        sSelect(Selectors.newAddressState, "Alaska");
        sType(Selectors.newAddressPostcode, "08008");
        sSelect(Selectors.newAddressState, "Alaska");
        sType(Selectors.newAddressMobilePhone, "777777777");
        sType(Selectors.newAddressAlias, " alias");
        sClick(Selectors.newAddressSubmit);

        sWait(Selectors.myAccountTab);
    }

}
