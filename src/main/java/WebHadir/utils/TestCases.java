package WebHadir.utils;

public enum TestCases {

	T1("Testing the authentication login"),
	T2("Testing the employee reporting");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
