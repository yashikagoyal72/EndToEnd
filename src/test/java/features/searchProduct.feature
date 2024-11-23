Feature:Place the order for Products

@SearchProduct 
Scenario Outline: Search Experience for product search in both home page and offers Page

Given User is on Green Cart landing page
When user searched with Shortname <Name> and extracted actual name of product
Then User searched for <Name> shortname in Offers page 
And validate product name in Offers Page matches with landing page

Examples:
| Name|
| Tom |
| Beet |