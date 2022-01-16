package WebHadir.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import WebHadir.pages.FormRegister;
import WebHadir.pages.FormRegristration;
import WebHadir.pages.FormStaff;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import WebHadir.config.AutomationFrameworkConfiguration;
import WebHadir.driver.DriverSingleton;
import WebHadir.pages.Login;
import WebHadir.pages.ReportingKaryawan;
import WebHadir.utils.ConfigurationProperties;
import WebHadir.utils.Constants;
import WebHadir.utils.TestCases;
import WebHadir.utils.Utils;
import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private Login login;
	private ReportingKaryawan reportingKaryawan;
	private FormRegristration formRegristration;
	private FormStaff formStaff;
	private FormRegister formRegister;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/Report.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		login = new Login();
		reportingKaryawan = new ReportingKaryawan();
		formStaff = new FormStaff();
		formRegristration = new FormRegristration();
		formRegister = new FormRegister();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	///////////// LOGIN /////////////////////
	
	@Given("User go to the website")
	public void User_go_to_the_website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+ Constants.URL);
	}	
	
	@When("User input username password and click SignIn")
	public void User_input_username_password_and_click_SignIn() {
		login.inputLogin(configurationProperties.getUsernameLogin(), configurationProperties.getPasswordLogin());
		extentTest.log(LogStatus.PASS, "User input username password and click login");
	}
	
	
	///////////// SEARCH BY /////////////////////
	
	@Given("User go to the reporting karyawan page")
	public void User_go_to_the_reporting_karyawan_page() {
		reportingKaryawan.gotoReportingKaryawan();
		extentTest.log(LogStatus.PASS, "User go to the reporting karyawan page");
	}
	
	@When("User click dropdown list for NIK")
	public void User_click_dropdown_list_for_NIK() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(LogStatus.PASS, "User click dropdown list for NIK");
	}
	
	@And("User click list NIK")
	public void User_click_list_NIK() {
		reportingKaryawan.klikListNik();
		extentTest.log(LogStatus.PASS, "User click list NIK");
	}
	
	@And("User input NIK in form search and click button search")
	public void User_input_NIK_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByNik(configurationProperties.getInNIK());
		extentTest.log(LogStatus.PASS, "User input NIK in form search and click button search");
	}
	
	@When("User click dropdown list for Name")
	public void User_click_dropdown_list_for_Name() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(LogStatus.PASS, "User click dropdown list for Name");
	}
	
	@And("User click list name")
	public void User_click_list_name() {
		reportingKaryawan.klikListName();
		extentTest.log(LogStatus.PASS, "User click list name");
	}
	
	@And("User input name in form search and click button search")
	public void User_input_name_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByName(configurationProperties.getInName());
		extentTest.log(LogStatus.PASS, "User input name in form search and click button search");
	}
	
	@When("User click dropdown list for Leader")
	public void User_click_dropdown_list_for_Leader() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(LogStatus.PASS, "User click dropdown list for Leader");
	}
	
	@And("User click list leader")
	public void User_click_list_leader() {
		reportingKaryawan.klikListName();
		extentTest.log(LogStatus.PASS, "User click list leader");
	}
	
	@And("User input leader in form search and click button search")
	public void User_input_leader_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByName(configurationProperties.getInLeader());
		extentTest.log(LogStatus.PASS, "User input leader in form search and click button search");
	}
	
	// Form Registration (Dwiky Kurniawan)
		@When("^User Membuka halaman Form Registration")
		public void goToFormRegristration() {
			formRegristration.pageRegist();
			extentTest.log(LogStatus.PASS, "User Membuka halaman Form Registration");
		}
		
		@When("^User Membuka halaman Form Staff dari Form Regristration")
		public void goToStafff() {
			formRegristration.PageStaff();
			extentTest.log(LogStatus.PASS, "User Membuka halaman Form Staff dari Form Regristration");
		}
		
		@When("^User Pilih file foto wajah")
		public void goUploadFoto() {
			formRegristration.btnChooseFoto(configurationProperties.getFoto2());
			extentTest.log(LogStatus.FAIL, "User gagal upload foto");
		}
		
		@When("^User Mengisi username, email, fullname, password, Imei, dan NIK")
		public void goInputData() {
			formRegristration.InputBiodata(configurationProperties.getUsername2(), configurationProperties.getEmail2(), configurationProperties.getPasswword2(), configurationProperties.getPasswword2(), configurationProperties.getImei2(), configurationProperties.getNik2());
			extentTest.log(LogStatus.PASS, "User Mengisi username, email, fullname, password, Imei, dan NIK");
		}
		
		@When("^User Memilih level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, dan gm")
		public void goChooseDepartement() {
			formRegristration.chooseDepartement(configurationProperties.getLevel(), configurationProperties.getTipekaryawan(), configurationProperties.getDepartemen(), configurationProperties.getPosisi(), configurationProperties.getJamkerja(), configurationProperties.getLokasi(), 
			configurationProperties.getLembur(), configurationProperties.getCuti(), configurationProperties.getJammasuk(), configurationProperties.getJamkeluar(), configurationProperties.getAbsenpoint(), 
			configurationProperties.getLeader(), configurationProperties.getSupervisor(), configurationProperties.getManager());
			extentTest.log(LogStatus.PASS, "User Memilih level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, dan gm");
		}
		
		@When("^User Mendaftarkan anggota karyawan")
		public void goToSubmit() {
			formRegristration.SubmitRegist();
			extentTest.log(LogStatus.FAIL, "User gagal Mendaftarkan anggota karyawan karena gagal upload foto");
		}
		
		@Then("^User Berhasil mendaftarkan anggota karyawan")
		public void getDisplayFormRegist() {
			formRegristration.DisplayFormRegist();
			assertEquals(configurationProperties.getDisplayFormRegist(), formRegristration.DisplayFormRegist());
			extentTest.log(LogStatus.FAIL, "User gagal mendaftarkan anggota karyawan");
		}
		
		//Form Staff (Dwiky Kurniawan)
		@When("^User Membuka halaman Form Staff")
		public void gotoFormSatff() {
			formStaff.FormStaffPage();
			extentTest.log(LogStatus.PASS, "User Membuka halaman Form Staff");
		}
		
		@When("^User Mencari data karyawan berdasarkan kategori yang ditentukan")
		public void goPageStaff() {
			formStaff.searchEmployee(configurationProperties.getCatName(), configurationProperties.getNameEmployee());
			extentTest.log(LogStatus.PASS, "User Mencari data karyawan berdasarkan kategori yang ditentukan");
		}
		
		@When("^User membuka form view history")
		public void goViewHistory() {
			formStaff.ViewHistory();
			extentTest.log(LogStatus.PASS, "User membuka form view history");
		}
		
		@When("^User mengeksport data history absen karyawan")
		public void goEksportData() {
			formStaff.pageViewHistory(configurationProperties.getStartDate(), configurationProperties.getCatName2());
			extentTest.log(LogStatus.PASS, "User mengeksport data history absen karyawan");
		}
		@When("^User membuka form edit data")
		public void goEditData() {
			formStaff.formEditData();
			extentTest.log(LogStatus.PASS, "User membuka form edit data");
		}
		@When("^User mengedit foto karyawan")
		public void editFoto() {
			formStaff.editChooseFoto(configurationProperties.getFoto2());
			extentTest.log(LogStatus.PASS, "User mengedit foto karyawan");
		}
		
		@When("^User mengedit biodata karyawan")
		public void editBiodata() {
			formStaff.InputEditBiodata(configurationProperties.getEmail3(), configurationProperties.getFullname3(), configurationProperties.getPassword3(), configurationProperties.getImei3(), configurationProperties.getNik3());
			extentTest.log(LogStatus.PASS, "User mengedit biodata karyawan");
		}
		
		@When("^User mengedit departement karyawan")
		public void editDepartement() {
			formStaff.chooseEditDepartement(configurationProperties.getLevel2(), configurationProperties.getTipekaryawan(), configurationProperties.getDepartemen(), configurationProperties.getPosisi(), configurationProperties.getJammasuk(), configurationProperties.getLokasi(), 
			configurationProperties.getLembur(), configurationProperties.getCuti(), configurationProperties.getJammasuk(), configurationProperties.getJamkeluar(), configurationProperties.getAbsenpoint());
			extentTest.log(LogStatus.PASS, "User mengedit departement karyawan");
		}
		
		@Then("^User berhasil mengubah data karyawan")
		public void displaySatff() {
			formStaff.displayFormstaff();
			assertEquals(configurationProperties.getDisplayFormStaff(), formStaff.displayFormstaff());
			extentTest.log(LogStatus.PASS, "User berhasil mengubah data Karyawan");
		}
		
		//Form Register (Dwiky KUrniawan)
		
		@When("^User Membuka halaman Form Register")
		public void goPageRegister() {
			formRegister.PageRegister();
			extentTest.log(LogStatus.PASS, "User Membuka halaman Form Register");
		}
		
		@When("^User menambah data karyawan di Form Register")
		public void AddRegister() {
			formRegister.Register();
			extentTest.log(LogStatus.PASS, "User menambah data karyawan di Form Register");
		}
		
		@When("^User mengupload foto")
		public void chooseFotoRegisterPage() {
			formRegister.btnChooseFotoRegister(configurationProperties.getFoto2());
			extentTest.log(LogStatus.FAIL, "User gagal mengupload foto");
		}
		
		@When("^User mengisi biodata karyawan")
		public void biodataRegister() {
			formRegister.InputBiodataRegister(configurationProperties.getFullname4(), configurationProperties.getLevel(), configurationProperties.getSupervisor(), configurationProperties.getManager(), 
					configurationProperties.getEmail3(), configurationProperties.getUsername2(), configurationProperties.getPasswword2(), configurationProperties.getNik3(), configurationProperties.getTipekaryawan(), 
					configurationProperties.getPosisi(), configurationProperties.getImei3(), configurationProperties.getJamkerja(), configurationProperties.getJammasuk(), configurationProperties.getJamkeluar(), configurationProperties.getLokasi(), 
					configurationProperties.getAbsenpoint(), configurationProperties.getCuti(), configurationProperties.getLembur());
			extentTest.log(LogStatus.PASS, "User mengisi biodata karyawan");
		}
		
		@When("^User mengkonfirmasi register karyawan")
		public void confirmRegister() {
			formRegister.SubmitRegister();
			extentTest.log(LogStatus.FAIL, "User gagal mengkonfirmasi register karyawanr karena gagal upload foto");
		}
		
		@When("^User mencari data karyawan sesuai filter yang telah disesuaikan")
		public void searchKaryawanRegister() {
			formRegister.SearchKaryawanRegister(configurationProperties.getCategory(), configurationProperties.getChooseDivisi());
			extentTest.log(LogStatus.PASS, "User mencari data karyawan sesuai filter yang telah disesuaikan");
		}
		
		@When("^User click button next dan previous")
		public void NextAndPrev() {
			formRegister.BtnNextAndPrev();
			extentTest.log(LogStatus.PASS, "User click button next dan previous");
		}
		
		@When("^User click lihat detail")
		public void formLihatDetail() {
			formRegister.FormLihatDetail();
			extentTest.log(LogStatus.FAIL, "User gagalvclick lihat detail karena tidak menampilkan apa-apa");
		}
		
		@When("^User click ubah data")
		public void formUbahData() {
			formRegister.FormUbahData();
			extentTest.log(LogStatus.PASS, "User click ubah data");
		}
		
		@When("^User mengubah data karyawan")
		public void editDataRegister() {
			formRegister.UbahDataRegister(configurationProperties.getFoto2(), configurationProperties.getFullname4(), configurationProperties.getLevel(), configurationProperties.getEmail4(), 
					configurationProperties.getPasswword2(), configurationProperties.getNik4(), configurationProperties.getTipekaryawan2(), configurationProperties.getImei4(), configurationProperties.getChooseDivisi(),
					configurationProperties.getJamkerja(), configurationProperties.getJammasuk(), configurationProperties.getJamkeluar(), configurationProperties.getLokasi(), configurationProperties.getAbsenpoint(),
					configurationProperties.getCuti(), configurationProperties.getLembur3());
			extentTest.log(LogStatus.PASS, "User mengubah data karyawan");
		}
		@Then("^User berhasil mengubah data")
		public void getDisplayRegisterPage() {
			formRegister.displayRegister();
			assertEquals(configurationProperties.getDisplayRegister(), formRegister.displayRegister());
			extentTest.log(LogStatus.PASS, "User berhasil mengubah data");
		}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}
