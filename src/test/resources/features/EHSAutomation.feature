Feature: EHS Automation Task

Background:
  Given go to EHS Home page and verify to be at home page

@wip
  Scenario: Verify to be able to see all available products as an Admin
    When click ListAllItems button and verify to be All Items Page
    Then verify to be able to see all available items
    And click all items open button respectively and get product ids to store


  Scenario: Looking detailed information about products as an Admin
    When click ListAllItems button and verify to be All Items Page
    Then click Open Button for EHS item 1 and verify to see all info


  Scenario:Verify to be able to search product and see details directly as an Admin
    When Search EHSItem 1 and click find button
    Then verify to see all info for the searching item