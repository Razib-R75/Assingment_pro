Feature: Testing ApiDemos-debug


  @MobileTest
  Scenario: Verify that  ApiDemos-debug work properly
    Given the ApiDemos-debug.apk app is launched and the home screen is visible,
    When clicks on the Views option,
    Then the Views section should open.

    When scrolls and selects the Expandable Lists option,
    Then the Expandable Lists section should open.

    When selects the Custom Adapter option inside the Expandable Lists section,
    Then the Custom Adapter list should appear with a list of items.

    When performs a long press on the first item in the list (e.g., People Names),
    Then a contextual popup menu should appear with options like Sample action.



  @MobileTest
  Scenario: Verify that  ApiDemos-debug Drag and drop work properly
    When  navigates back to the Views section after validating the popup menu,

    And   scrolls and selects the Drag and Drop option from the Views section,

    Then the Drag and Drop section should open with draggable elements.

    When drags the first circle onto the second circle
    Then a success message or UI change should confirm the successful completion of the action.

