Feature: Search  Property For Sale
  As a user
  I want the ability to search for property for sale in specific areas
  So i can know the price of property in the relevant area
  Scenario Outline: User can successfully search for property for sale
    Given I navigate to the homepage
    When  I enter "<location>" in the search field
    And I click on the For Sale button
    And I ensure that the search criteria page is displayed
    And I select radius "<searchRadius>" of the location
    And I select minimum price of "<minPrice>"
    And I select maximum price of "<maxPrice>"
    And I select minimum number of bedrooms as "<minBed>"
    And I select maximum number of bedrooms as "<maxBed>"
    And I select property type as "<propertyType>"
    And I select "<addedToSite>" as added to site option
    And I click on Find properties button
    And I verify that the search results page is displayed
    And I click on the second result
    Then the details of the selected property are displayed

    Examples: Test Data for Search Property
      | location   | searchRadius   | minPrice | maxPrice | minBed | maxBed | propertyType     | addedToSite |
      | Manchester | Within 3 miles | 220,000  |400,000  | 2      | 4      | Houses           | Last 7 days |
      | M6         | Within 3 miles | 170,000  | 350,000  | 2      | 5      | Flats/Apartments |             |