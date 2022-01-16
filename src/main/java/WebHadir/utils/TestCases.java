package WebHadir.utils;

public enum TestCases {

	T1("Testing the authentication login"),
	T2("Testing the employee reporting"),
	T3("Testing form regristration page"),
	T4("Testing form staff page"),
	T5("Testing form Register page");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
