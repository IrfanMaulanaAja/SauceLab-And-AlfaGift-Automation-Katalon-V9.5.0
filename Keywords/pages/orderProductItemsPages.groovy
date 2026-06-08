package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as obj

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling



public class orderProductItemsPages {
	public void addToCart() {
		try {
			boolean isAddToCart = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/android.widget.TextView - Sauce Labs Backpack'), 3, FailureHandling.OPTIONAL)
			
			if(isAddToCart) {
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - Sauce Labs Backpack'), 2)
				Mobile.scrollToText("ADD TO CART")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - ADD TO CART'), 2)
			}else {
				KeywordUtil.logInfo("Tidak Berhasil ke detail product")
			}
			
			Mobile.takeScreenshot()
			Mobile.tap(obj('Object Repository/SwagLabs/keranjang'), 2)
			Mobile.takeScreenshot()
		} catch (Exception e) {
			println(e.getMessage())
		}
	}
	
	public void addToCartBikeLight() {
		try {
			boolean isAddToCart = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/SauceLabsBikeLight/android.widget.TextView - Sauce Labs Bike Light'), 3, FailureHandling.OPTIONAL)
			
			if(isAddToCart) {
				Mobile.tap(obj('Object Repository/SwagLabs/SauceLabsBikeLight/android.widget.TextView - Sauce Labs Bike Light'), 2)
				Mobile.scrollToText("ADD TO CART")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - ADD TO CART'), 2)
			}else {
				KeywordUtil.logInfo("Tidak Berhasil ke detail product")
			}
			
			Mobile.takeScreenshot()
			Mobile.tap(obj('Object Repository/SwagLabs/keranjang'), 2)
			Mobile.takeScreenshot()
		} catch (Exception e) {
			println(e.getMessage())
		}
	}

	public void detailItem() {
		try {
			boolean isText = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/SauceLabsBikeLight/android.widget.TextView - Sauce Labs Bike Light'), 3, FailureHandling.OPTIONAL)

			if(isText) {
				KeywordUtil.logInfo("Berhasil ke halaman detail pesanan")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - CHECKOUT'), 2)
				Mobile.takeScreenshot()
			}else {
				KeywordUtil.logInfo("Gagal ke halaman detail pesanan")
			}
		} catch (Exception e) {
			println(e.getMessage())
		}
	}
	
	public void detailItemBackpack() {
		try {
			boolean isText = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/android.widget.TextView - Sauce Labs Backpack'), 3, FailureHandling.OPTIONAL)

			if(isText) {
				KeywordUtil.logInfo("Berhasil ke halaman detail pesanan")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - CHECKOUT'), 2)
				Mobile.takeScreenshot()
			}else {
				KeywordUtil.logInfo("Gagal ke halaman detail pesanan")
			}
		} catch (Exception e) {
			println(e.getMessage())
		}
	}

	public void detailInformation(String firstName, String lastName, String cityCode) {
		try {
			Mobile.setText(obj('Object Repository/SwagLabs/firstName'), firstName, 2)
			Mobile.setText(obj('Object Repository/SwagLabs/LastName'), lastName, 2)
			Mobile.setText(obj('Object Repository/SwagLabs/ZipCode'), cityCode, 2)
			Mobile.takeScreenshot()
			Mobile.hideKeyboard()
			Mobile.delay(1)
			Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - CONTINUE'), 2)
			Mobile.takeScreenshot()
		} catch (Exception e) {
			println(e.getMessage())
		}
	}

	public void checkOutConfirmation() {
		try {
			boolean isNominal = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/SauceLabsBikeLight/android.widget.TextView - 9.99'), 2, FailureHandling.OPTIONAL)

			if(isNominal) {
				KeywordUtil.logInfo("Berhasil ke halaman checkOut Konfirmasi")
				Mobile.scrollToText("FINISH")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - FINISH'), 2)
			}else {
				KeywordUtil.logInfo("Tidak berhasil ke halaman checkOut Konfirmasi")
			}

			boolean isSuccessOrder = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/android.widget.TextView - THANK YOU FOR YOU ORDER'), 2, FailureHandling.OPTIONAL)
			if (isSuccessOrder) {
				KeywordUtil.logInfo("Berhasil ke halaman sukses order barang")
			}else {
				KeywordUtil.logInfo("Tidak berhasil ke halaman sukses order barang")
			}
		} catch (Exception e) {
			println(e.getMessage())
		}
	}
	
	public void checkOutConfirmatioBackpack() {
		try {
			boolean isNominal = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/android.widget.TextView - 29.99'), 2, FailureHandling.OPTIONAL)

			if(isNominal) {
				KeywordUtil.logInfo("Berhasil ke halaman checkOut Konfirmasi")
				Mobile.scrollToText("FINISH")
				Mobile.tap(obj('Object Repository/SwagLabs/android.widget.TextView - FINISH'), 2)
			}else {
				KeywordUtil.logInfo("Tidak berhasil ke halaman checkOut Konfirmasi")
			}

			boolean isSuccessOrder = Mobile.waitForElementPresent(obj('Object Repository/SwagLabs/android.widget.TextView - THANK YOU FOR YOU ORDER'), 2, FailureHandling.OPTIONAL)
			if (isSuccessOrder) {
				KeywordUtil.logInfo("Berhasil ke halaman sukses order barang")
			}else {
				KeywordUtil.logInfo("Tidak berhasil ke halaman sukses order barang")
			}
		} catch (Exception e) {
			println(e.getMessage())
		}
	}
}
