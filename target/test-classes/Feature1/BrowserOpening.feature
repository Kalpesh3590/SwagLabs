Feature: Testing the fuctionality of an WebBrowser.

  Scenario: verifying the WebURL.
    Given Open the Browser.
    When Enter the WebURL. "https://www.saucedemo.com/"
    Then Homepage Page is displayed.
