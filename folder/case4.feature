Feature: cart feature


Scenario: the one where user moves to cart without adding any item in it
Given Alex has logged it into test me app
When alex search a particular product
And try to proceed to payment without adding any item in cart
Then test me app does not display the cart icon

