*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***    
FirstSeleniumTest
    Open Browser   https://parabank.parasoft.com/parabank/index.htm    chrome
    Set Selenium Implicit Wait    10
    Sleep    10    
    Click Element     //*[@id="loginPanel"]/p[1]/a
    Input Text        //*[@id="lastName"]                                     Sibarani
    Input Text        //*[@id="address.street"]                               Jl Aman I No 30
    Input Text        //*[@id="address.city"]                                 Medan
    Input Text        //*[@id="address.state"]                                Indonesia
    Input Text        //*[@id="address.zipCode"]                              20217                        
    Input Text        //*[@id="ssn"]                                          2153212
    Click Element     //*[@id="lookupForm"]/table/tbody/tr[8]/td[2]/input          
    Sleep  10
    Close Browser
    Log   Test Completed    