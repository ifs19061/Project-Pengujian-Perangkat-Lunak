*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
FirstSeleniumTest
    Open Browser   https://parabank.parasoft.com/parabank/index.htm    chrome
    Set Selenium Implicit Wait    10
    Sleep    10    
    Input Text        //*[@id="loginPanel"]/form/div[1]/input                 baraniko24  
    Input Password    //*[@id="loginPanel"]/form/div[2]/input                 sayasukappmpl              
    Click Element     //*[@id="loginPanel"]/form/div[3]/input 
    Sleep  10
    Close Browser
    Log   Test Completed    
    