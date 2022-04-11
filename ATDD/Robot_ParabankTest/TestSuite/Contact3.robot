*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
FirstSeleniumTest
    Open Browser   https://parabank.parasoft.com/parabank/index.htm    chrome
    Set Selenium Implicit Wait    10
    Sleep    10    
    Click Element    //*[@id="headerPanel"]/ul[2]/li[3]/a
    Input Text       //*[@id="name"]                                    Nicholas Sibarani
    Input Text       //*[@id="email"]                                   baraniko24@gmail.com
    Input Text       //*[@id="message"]                                 Mantap
    Click Element    //*[@id="contactForm"]/table/tbody/tr[5]/td[2]/input
    Sleep  10
    Close Browser
    Log   Test Completed    