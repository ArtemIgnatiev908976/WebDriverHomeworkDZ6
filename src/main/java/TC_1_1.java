import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;


public class TC_1_1 {
    WebDriver driver;

    public TC_1_1(WebDriver driver) {
        this.driver = driver;
    }

    By loginButton = By.xpath("//button/span[text()=' и регистрация']");
    By loginField = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[2]/input[1]");
    By passwordField = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]");
    By loginButtonInModal = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By buttonMyCourses = By.xpath("//a/div[text()='Мои курсы']");
    By linkAboutMe = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[3]");
    By fieldName = By.xpath("//input[@id='id_fname']");
    By fieldNameEng = By.xpath("//input[@id='id_fname_latin']");
    By fieldSurname = By.xpath("//input[@id='id_lname']");
    By fieldSurnameEng = By.xpath("//input[@id='id_lname_latin']");
    By fieldNameInBlog = By.xpath("//input[@id='id_blog_name']");
    By fieldDateOfBirthday = By.xpath("//label[contains(text(),'Дата рождения')]/following-sibling::div/input");
    By calendarDateOfBirthday = By.xpath("//li[contains(text(),'21')]");
    By fieldCountry = By.xpath("//div[contains(text(),'Россия')]");
    By selectedCountry = By.xpath("//button[contains(text(),'Россия')]");
    By fieldCity = By.xpath("//span[contains(text(),'Город')]");
    By selectedCity = By.xpath("//button[contains(text(),'Самара')]");
    By fieldLvlOfEng = By.xpath("//div[contains(text(),'Средний (Intermediate)')]");
    By selectedLvlEng = By.xpath("//button[contains(text(),'Средний (Intermediate)')]");
    By fieldReadyToMove = By.xpath("//span[contains(text(),'Да')]");
    By fieldWorkFormat = By.xpath("//span[contains(text(),'Полный день')]");
    By buttonAddContact = By.xpath("//button[contains(text(),'Добавить')]");
    By selectCommunicationMethod = By.xpath("//span[contains(text(),'Способ связи')]");
    By selectCommunicationMethod2 = By.xpath("//body/div[1]/div[1]/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]");
    By selectServiceCommunication = By.xpath("//button[contains(text(),'Skype')]");
    By buttonDelete = By.xpath("//body/div[1]/div[1]/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]");
    By buttonDelete2 = By.xpath("//body/div[1]/div[1]/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]");
    By inputOfCommunication = By.xpath("//input[@id='id_contact-0-value']");
    By inputOfCommunication2 = By.xpath("//input[@id='id_contact-1-value']");
    By selectServiceCommunication2 = By.xpath("//button[contains(text(),' Тelegram')]");
    By fieldFloor = By.xpath("//select[@id='id_gender']");
    By selectGender = By.xpath("//option[contains(text(),'Мужской')]");
    By fieldCompany = By.xpath("//input[@id='id_company']");
    By fieldPost = By.xpath("//input[@id='id_work']");
    By buttonSave =By.xpath("//button[contains(text(),'Сохранить и продолжить')]");


    //Проверка введенных данных


    public TC_1_1 typeCheckFieldPost() {


        String fieldDateOfBirthdayVal = driver.findElement(fieldPost).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "Ведущий инженер по автоматизации и функциональному тестированию веб проектов")){
            System.out.println("Должность  +++");
        }
        else System.out.println("Должность ---");
        return this;
    }


    public TC_1_1 typeCheckFieldCompany () {


        String fieldDateOfBirthdayVal = driver.findElement(fieldCompany ).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "Общество с ограниченной ответственностью  \"42\"")){
            System.out.println("Компания  +++");
        }
        else System.out.println("Компания ---");
        return this;
    }


    public TC_1_1 typeCheckGender() {


        if (driver.findElement(By.xpath("//option[contains(text(),'Мужской')]")).isSelected()){
        System.out.println("Пол выбран  +++");}
        else System.out.println("Пол не выбран ---");
        return this;
        }


    public TC_1_1 typeCheckContact2() {


        String fieldDateOfBirthdayVal = driver.findElement(By.xpath("//input[@id='id_contact-1-value']")).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "artline53")){
            System.out.println("Способ связи 2  +++");
        }
        else System.out.println("Способ связи 2 ---");
        return this;
    }

    public TC_1_1 typeCheckContact1() {


        String fieldDateOfBirthdayVal = driver.findElement(By.xpath("//input[@id='id_contact-0-value']")).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "artline52")){
            System.out.println("Способ связи 1  +++");
        }
        else System.out.println("Способ связи 1 ---");
        return this;
    }

    public TC_1_1 typeCheckSelectCommunicationMethod2() {

        if(driver.findElement(By.xpath("//div[contains(text(),'Тelegram')]")).getText().contains("Тelegram")){
            System.out.println("Способ связи2  +++");
        }
        else System.out.println("Способ связи2 ---");
        return this;
    }

    public TC_1_1 typeCheckSelectCommunicationMethod1() {

        if(driver.findElement(By.xpath("//div[contains(text(),'Skype')]")).getText().contains("Skype")){
            System.out.println("Способ связи1  +++");
        }
        else System.out.println("Способ связи1 ---");
        return this;
    }


    public TC_1_1 typeCheckFieldReadyToMove() {


        String fieldDateOfBirthdayVal = driver.findElement(By.xpath("//input[@id='id_ready_to_relocate_1']")).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "True")){
            System.out.println("Готовность к переезду  +++");
        }
        else System.out.println("Готовность к переезду ---");
        return this;
    }


    public TC_1_1 typeCheckFieldLvlEng() {

        if(driver.findElement(fieldLvlOfEng).getText().contains("Средний (Intermediate)")){
            System.out.println("Уровень анг  +++");
        }
        else System.out.println("Уровень анг ---");
        return this;
    }
    public TC_1_1 typeCheckFieldCity() {

        if(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/div[1]")).getText().contains("Самара")){
            System.out.println("Город  +++");
        }
        else System.out.println("Город ---");
        return this;
    }

    public TC_1_1 typeCheckFieldCountry() {

        if(driver.findElement(fieldCountry).getText().contains("Россия")){
            System.out.println("Страна  +++");
        }
        else System.out.println("Страна ---");
        return this;
    }

    public TC_1_1 typeCheckDateOfBirthday() {


        String fieldDateOfBirthdayVal = driver.findElement(fieldDateOfBirthday).getAttribute("value");

        if(Objects.equals(fieldDateOfBirthdayVal, "21.09.1995")){
            System.out.println("Дата рождения  +++");
        }
        else System.out.println("Дата рождения ---");
        return this;
    }



    public TC_1_1 typeCheckFieldNameInBlog() {


        String fieldNameInBlogVal = driver.findElement(fieldNameInBlog).getAttribute("value");

        if(Objects.equals(fieldNameInBlogVal, "АртёмБлог")){
            System.out.println("Имя в блоге  +++");
        }
        else System.out.println("Имя в блоге ---");
        return this;
    }
    public TC_1_1 typeCheckFieldName() {


        String fieldNameVal = driver.findElement(fieldName).getAttribute("value");



        if(Objects.equals(fieldNameVal, "Артём")){
            System.out.println("Имя  +++");
        }
        else System.out.println("Имя ---");
        return this;
    }




    public TC_1_1 typeCheckFieldNameEng() {

        String fieldNameEngVal = driver.findElement(fieldNameEng).getAttribute("value");

        if(Objects.equals(fieldNameEngVal, "Artem")){
            System.out.println("Имя Eng  +++");
        }
        else System.out.println("Имя Eng ---");
        return this;
    }



    public TC_1_1 typeCheckFieldSurname() {

        String fieldSurnameVal = driver.findElement(fieldSurname).getAttribute("value");

        if(Objects.equals(fieldSurnameVal, "Игнатьев")){
            System.out.println("Фамилия  +++");
        }
        else System.out.println("Фамилия ---");
        return this;
    }
    public TC_1_1 typeCheckFieldSurnameEng() {

        String fieldSurnameEngVal = driver.findElement(fieldSurnameEng).getAttribute("value");

        if(Objects.equals(fieldSurnameEngVal, "Ignatev")){
            System.out.println("Фамилия Eng  +++");
        }
        else System.out.println("Фамилия Eng ---");
        return this;
    }



    //Проверка введенных данных



    public TC_1_1 typeClearCookies() {
        driver.manage().deleteAllCookies();
        return this;
    }
    public TC_1_1 typeOpenOtus() {
        driver.get("https://otus.ru/");
        return this;
    }


    public TC_1_1 typeButtonSave() {
        driver.findElement(buttonSave).click();
        return this;
    }

    public TC_1_1 typeFieldPost() {
        driver.findElement(fieldPost).clear();
        driver.findElement(fieldPost).sendKeys("Ведущий инженер по автоматизации и функциональному тестированию веб проектов");
        return this;
    }

    public TC_1_1 typeFieldCompany() {
        driver.findElement(fieldCompany).clear();
        driver.findElement(fieldCompany).sendKeys("Общество с ограниченной ответственностью  \"42\"");
        return this;
    }
    public TC_1_1 typeSelectGender() {
        driver.findElement(selectGender).click();
        return this;
    }

    public TC_1_1 typeFieldFloor() {
        driver.findElement(fieldFloor).click();
        return this;
    }

    public TC_1_1 typeSelectCommunicationMethod2() {
        driver.findElement(selectCommunicationMethod2).click();
        return this;
    }


    public TC_1_1 typeSelectServiceCommunication2() {
        driver.findElement(selectServiceCommunication2).click();
        return this;
    }
    public TC_1_1 typeInputOfCommunication2() {
        driver.findElement(inputOfCommunication2).clear();
        driver.findElement(inputOfCommunication2).sendKeys("artline53");
        return this;
    }



    public TC_1_1 typeInputOfCommunication() {
        driver.findElement(inputOfCommunication).clear();
        driver.findElement(inputOfCommunication).sendKeys("artline52");
        return this;
    }

    public TC_1_1 typeSelectServiceCommunication() {
        driver.findElement(selectServiceCommunication).click();
        return this;
    }
    public TC_1_1 typeSelectCommunicationMethod() {
        driver.findElement(selectCommunicationMethod).click();
        return this;
    }

    public TC_1_1 typeButtonAddContact() {
        driver.findElement(buttonAddContact).click();
        return this;
    }


    public TC_1_1 typeFieldWorkFormat() {
        driver.findElement(fieldWorkFormat).click();
        return this;
    }
    public TC_1_1 typeFieldReadyToMove() {
        driver.findElement(fieldReadyToMove).click();
        return this;
    }
    public TC_1_1 typeSelectedLvlEng() {
        driver.findElement(selectedLvlEng).click();
        return this;
    }


    public TC_1_1 typeFieldLvlOfEng() {
        driver.findElement(fieldLvlOfEng).click();
        return this;
    }
    public TC_1_1 typeSelectedCity() {
        driver.findElement(selectedCity).click();
        return this;
    }
    public TC_1_1 typeFieldCity() {
        driver.findElement(fieldCity).click();
        return this;
    }

    public TC_1_1 typeSelectedCountry() {
        driver.findElement(selectedCountry).click();
        return this;
    }
    public TC_1_1 typeFieldCountry() {
        driver.findElement(fieldCountry).click();
        return this;
    }


    public TC_1_1 typeCalendarDateOfBirthday() {
        driver.findElement(calendarDateOfBirthday).click();
        return this;
    }



    public TC_1_1 typeDateOfBirthday() {
        driver.findElement(fieldDateOfBirthday).clear();
        driver.findElement(fieldDateOfBirthday).sendKeys("21.09.1995");
        return this;
    }

    public TC_1_1 typeNameInBlog() {
        driver.findElement(fieldNameInBlog ).clear();
        driver.findElement(fieldNameInBlog ).sendKeys("АртёмБлог");
        return this;
    }

    public TC_1_1 typeFieldSurnameEng() {
        driver.findElement(fieldSurnameEng).clear();
        driver.findElement(fieldSurnameEng).sendKeys("Ignatev");
        return this;
    }

    public TC_1_1 typeFieldSurname() {
        driver.findElement(fieldSurname).clear();
        driver.findElement(fieldSurname).sendKeys("Игнатьев");
        return this;
    }


    public TC_1_1 typeFieldNameEng() {
        driver.findElement(fieldNameEng).clear();
        driver.findElement(fieldNameEng).sendKeys("Artem");
        return this;
    }
    public TC_1_1 typeFieldName() {
        driver.findElement(fieldName).clear();
        driver.findElement(fieldName).sendKeys("Артём");
        return this;
    }


    public TC_1_1 typeLinkAboutMe() {
        driver.findElement(linkAboutMe).click();
        return this;
    }

    public TC_1_1 typeButtonMyCourses() {
        driver.findElement(buttonMyCourses).click();
        return this;
    }

    public TC_1_1 typeLoginButtonInModal() {
        driver.findElement(loginButtonInModal).click();
        return this;
    }

    public TC_1_1 typeClickLogin() {
        driver.findElement(loginButton).click();
        return this;
    }


    public TC_1_1 typeLogin() {
        driver.findElement(this.loginField).sendKeys("ignatievan@answer-42.ru");
        return this;
    }

    public TC_1_1 typePassword() {
        driver.findElement(this.passwordField).sendKeys("aAvHTe8HYB9P");
        return this;
    }

}
