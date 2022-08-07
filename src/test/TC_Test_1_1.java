


import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;


public class TC_Test_1_1 {

    WebDriver driver;
    TC_1_1 tc_1_1;




    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://otus.ru/");
        driver.manage().window().maximize();

    }


    @Test
    public void TC_1_1() {


        tc_1_1 = new TC_1_1(driver);


      tc_1_1
              .typeClickLogin()
              .typeLogin()
              .typePassword()
              .typeLoginButtonInModal()
              .typeButtonMyCourses()
              .typeLinkAboutMe()

              .typeFieldName()
              .typeFieldNameEng()
              .typeFieldSurname()
              .typeFieldSurnameEng()
              .typeNameInBlog()
              .typeDateOfBirthday()
              .typeCalendarDateOfBirthday()
              .typeFieldCountry()
              .typeSelectedCountry()
              .typeFieldCity()
              .typeSelectedCity()
              .typeFieldLvlOfEng()
              .typeSelectedLvlEng()
              .typeFieldReadyToMove()
              .typeFieldWorkFormat()
              .typeFieldWorkFormat()


              .typeSelectCommunicationMethod()
              .typeSelectServiceCommunication()
              .typeInputOfCommunication()

              .typeButtonAddContact()
              .typeSelectCommunicationMethod2()
              .typeInputOfCommunication2()
              .typeSelectServiceCommunication2()

              .typeFieldFloor()
              .typeSelectGender()

              .typeFieldCompany()
              .typeFieldPost()

              .typeButtonSave()
              .typeClearCookies()
              .typeOpenOtus()

              .typeClickLogin()
              .typeLogin()
              .typePassword()
              .typeLoginButtonInModal()
              .typeButtonMyCourses()
              .typeLinkAboutMe()



              .typeCheckFieldName()
              .typeCheckFieldNameEng()
              .typeCheckFieldSurname()
              .typeCheckFieldSurnameEng()
              .typeCheckFieldNameInBlog()
              .typeCheckDateOfBirthday()
              .typeCheckFieldCountry()
              .typeCheckFieldCity()
              .typeCheckFieldLvlEng()

              .typeCheckFieldReadyToMove()
              .typeCheckSelectCommunicationMethod1()
              .typeCheckSelectCommunicationMethod2()
              .typeCheckContact1()
              .typeCheckContact2()

              .typeCheckGender()
              .typeCheckFieldCompany()
              .typeCheckFieldPost()



        ;

        driver.quit();
    }
}
