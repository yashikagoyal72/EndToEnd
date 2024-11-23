Feature:Place the order for Products

@PlaceOrder 
Scenario Outline: Search Experience for product search in both home page and offers Page

Given User is on Green Cart landing page
When user searched with Shortname <Name> and extracted actual name of product
And user add three products into the Cart
Then User User proceed with the checkout page and searched for <Name> shortname in Offers page 
And validate product name in Checkout Page matches with landing page

Examples:
| Name|
| Tom |
