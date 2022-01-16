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

	@Value("${foto2}")
	private String foto2;
	
	@Value("${username2}")
	private String username2;
	
	@Value("${email2}")
	private String email2;
	
	@Value("${fullname2}")
	private String fullname2;
	
	@Value("${password2}")
	private String passwword2;
	
	@Value("${imei2}")
	private String imei2;
	
	@Value("${nik2}")
	private String nik2;
	
	@Value("${level}")
	private String level;
	
	@Value("${tipekaryawan}")
	private String tipekaryawan;
	
	@Value("${departemen}")
	private String departemen;
	
	@Value("${posisi}")
	private String posisi;
	
	@Value("${jamkerja}")
	private String jamkerja;
	
	@Value("${lokasi}")
	private String lokasi;
	
	@Value("${lembur}")
	private String lembur;
	
	@Value("${cuti}")
	private String cuti;
	
	@Value("${jammasuk}")
	private String jammasuk;
	
	@Value("${jamkeluar}")
	private String jamkeluar;
	
	@Value("${absenpoint}")
	private String absenpoint;
	
	@Value("${leader}")
	private String leader;
	
	@Value("${supervisor}")
	private String supervisor;
	
	@Value("${manager}")
	private String manager;
	
	@Value("${displayFormRegist}")
	private String displayFormRegist;
	
	@Value("${foto3}")
	private String foto3;
	
	@Value("${email3}")
	private String email3;
	
	@Value("${fullname3}")
	private String fullname3;
	
	@Value("${password3}")
	private String password3;
	
	@Value("${imei3}")
	private String imei3;
	
	@Value("${nik3}")
	private String nik3;
	
	@Value("${startDate}")
	private String startDate;
	
	@Value("${displayFormStaff}")
	private String displayFormStaff;
	
	@Value("${category")
	private String category;
	
	@Value("${chooseDivisi}")
	private String chooseDivisi;
	
	@Value("${lembur3}")
	private String lembur3;
	
	@Value("${nik4}")
	private String nik4;
	
	@Value("${fullname4}")
	private String fullname4;
	
	@Value("${imei4}")
	private String imei4;
	
	@Value("${email4}")
	private String email4;
	
	@Value("${tipekaryawan2}")
	private String tipekaryawan2;
	
	@Value("${displayRegister}")
	private String displayRegister;
	
	@Value("${catName}")
	private String catName;
	
	@Value("${nameEmployee}")
	private String nameEmployee;
	
	@Value("${catName2}")
	private String catName2;
	
	@Value("${level2}")
	private String level2;
	
	public String getFoto2() {
		return foto2;
	}

	public String getUsername2() {
		return username2;
	}

	public String getEmail2() {
		return email2;
	}

	public String getFullname2() {
		return fullname2;
	}

	public String getPasswword2() {
		return passwword2;
	}

	public String getImei2() {
		return imei2;
	}

	public String getNik2() {
		return nik2;
	}

	public String getLevel() {
		return level;
	}

	public String getTipekaryawan() {
		return tipekaryawan;
	}

	public String getDepartemen() {
		return departemen;
	}

	public String getPosisi() {
		return posisi;
	}

	public String getJamkerja() {
		return jamkerja;
	}

	public String getLokasi() {
		return lokasi;
	}

	public String getLembur() {
		return lembur;
	}

	public String getCuti() {
		return cuti;
	}

	public String getJammasuk() {
		return jammasuk;
	}

	public String getJamkeluar() {
		return jamkeluar;
	}

	public String getAbsenpoint() {
		return absenpoint;
	}

	public String getLeader() {
		return leader;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public String getManager() {
		return manager;
	}

	public String getDisplayFormRegist() {
		return displayFormRegist;
	}

	public String getFoto3() {
		return foto3;
	}

	public String getEmail3() {
		return email3;
	}

	public String getFullname3() {
		return fullname3;
	}

	public String getPassword3() {
		return password3;
	}

	public String getImei3() {
		return imei3;
	}

	public String getNik3() {
		return nik3;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getDisplayFormStaff() {
		return displayFormStaff;
	}

	public String getCategory() {
		return category;
	}

	public String getChooseDivisi() {
		return chooseDivisi;
	}

	public String getLembur3() {
		return lembur3;
	}

	public String getNik4() {
		return nik4;
	}

	public String getFullname4() {
		return fullname4;
	}

	public String getImei4() {
		return imei4;
	}

	public String getEmail4() {
		return email4;
	}

	public String getTipekaryawan2() {
		return tipekaryawan2;
	}

	public String getDisplayRegister() {
		return displayRegister;
	}

	public String getCatName() {
		return catName;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public String getCatName2() {
		return catName2;
	}

	public String getLevel2() {
		return level2;
	}

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
