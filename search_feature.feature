Feature:
	'when I go to the link.springer website and search for a keyword, 
		I expect to find some publications with the keyword in the title'

Scenario:
	Given I am in springer website
	When I search for "QoE" to the search box
	And click the Search Button
	Then "QoE" should be reference on the title of some of the publications
