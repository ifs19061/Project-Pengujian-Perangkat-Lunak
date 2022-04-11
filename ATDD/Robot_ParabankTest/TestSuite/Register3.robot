*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***    
FirstSeleniumTest
    Open Browser   https://parabank.parasoft.com/parabank/index.htm    chrome
    Set Selenium Implicit Wait    10
    Sleep    10    
    Click Element     //*[@id="loginPanel"]/p[2]/a
    Input Text        //*[@id="customer.firstName"]                           Nicholas
    Input Text        //*[@id="customer.address.street"]                      Jl Aman I No 30
    Input Text        //*[@id="customer.address.city"]                        Medan
    Input Text        //*[@id="customer.address.state"]                       Indonesia
    Input Text        //*[@id="customer.address.zipCode"]                     20217
    Input Text        //*[@id="customer.phoneNumber"]                         08984253435
    Input Text        //*[@id="customer.ssn"]                                 2153212
    Input Text        //*[@id="customer.username"]                            baraniko25
    Input Password    //*[@id="customer.password"]                            sayasukappmpl
    Input Password    //*[@id="repeatedPassword"]                             sayasukappmpl
    Click Element     //*[@id="customerForm"]/table/tbody/tr[13]/td[2]/input  
    Sleep  10
    Close Browser
    Log   Test Completed    