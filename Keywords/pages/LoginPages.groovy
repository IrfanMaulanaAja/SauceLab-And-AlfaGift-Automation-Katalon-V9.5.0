package pages

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as obj
import com.kms.katalon.core.util.KeywordUtil

public class LoginPages {
	def Login(String username, String password) {
		try {
			Mobile.delay(5)
			Mobile.tap(obj('Object Repository/SwagLabs/android.widget.EditText - Username'), 2)
			Mobile.setText(obj('Object Repository/SwagLabs/android.widget.EditText - Username'), username, 2)
			Mobile.tap(obj('Object Repository/SwagLabs/android.widget.EditText - Password'), 2)
			Mobile.setText(obj('Object Repository/SwagLabs/android.widget.EditText - Password'), password, 2)
			Mobile.takeScreenshot()
			Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - LOGIN'), 2)
			Mobile.takeScreenshot()
		} catch (Exception e) {
			println(e.getMessage())
		}
	}
}
