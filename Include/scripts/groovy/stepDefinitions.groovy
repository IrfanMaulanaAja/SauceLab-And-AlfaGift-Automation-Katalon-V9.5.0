import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as obj

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

class stepDefinitions {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("the Alfagift app is open")
	def openApp() {
		Mobile.startExistingApplication(GlobalVariable.BaseAppAlfaGift)
	}

	@When("the dashboard is displayed successfully")
	def verifyDashboard() {
		Mobile.verifyElementVisible(obj('Object Repository/AlfaGift/android.widget.EditText - Cari kebutuhan kamu di sini'), 3)
	}

	@Then("the user searches for a product")
	def searchFindProduct() {
		Mobile.tap(obj('Object Repository/AlfaGift/android.widget.EditText - Cari kebutuhan kamu di sini'), 3)
		Mobile.setText(obj('Object Repository/AlfaGift/android.widget.FrameLayout'), 'popok', 3)
		Mobile.tap(obj('Object Repository/AlfaGift/android.widget.TextView - popok'), 3)
		Mobile.tap(obj('Object Repository/AlfaGift/android.widget.TextView -  Keranjang'), 3)
	}
}