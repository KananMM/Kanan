Feature: User should be able to login and order with BankWire


  Scenario: Login as a user
    Given user is on main page
    When user clicks on black "sign in" button
    And user puts in "username" and "password"
    And user clicks on green "sign in" button
    Then user should see own "Kanan Musayev" on account landing page



  @wip
    Scenario:  Order item using search bar
      Given user is logged in
      When user enters "blouse" in searchBar
      And clicks on "submit search" button
      And user selects item
      And user adds item to the cart
      Then "Product successfully added to your shopping cart" pop-up should be displayed
      Then user clicks on "Proceed to check out" button until "Agree term" is displayed
      Then user click on "Agree term" button
      Then user clicks on "Proceed to checkout"
      Then user selects "Bank Wire" payment type
      Then user click on "I confirm my order" button
      Then user should see  text "Your order on My Store is complete." is displayed











  Scenario: Order item via Check
