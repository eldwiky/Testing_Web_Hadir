package WebHadir.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${inputUsername}")
	private String usernameLogin;
	
	@Value("${inputPassword}")
	private String passwordLogin;
	
	@Value("${inputNIK}")
	private String inNIK;
	
	@Value("${inputName}")
	private String inName;
	
	@Value("${inputLeader}")
	private String inLeader;

	
	public String getInLeader() {
		return inLeader;
	}

	public String getInName() {
		return inName;
	}
	
	public String getInNIK() {
		return inNIK;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}
	
	public String getUsernameLogin() {
		return usernameLogin;
	}
	
	public String getBrowser() {
		return browser;
	}

	
}
