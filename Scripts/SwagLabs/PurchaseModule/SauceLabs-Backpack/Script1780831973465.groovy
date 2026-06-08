import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable
import pages.LoginPages
import pages.orderProductItemsPages

def loginUser = new LoginPages()
def orderItem = new orderProductItemsPages()

Runtime.getRuntime().exec("adb shell pm clear " + GlobalVariable.BaseApp)
Mobile.startExistingApplication(GlobalVariable.BaseApp)

/* Login Sauce Labs */
loginUser.Login("standard_user", "secret_sauce")

/* Proccess Order Item Backpack */
orderItem.addToCart()
orderItem.detailItemBackpack()
orderItem.detailInformation("First Irfan 01", "Last Irfan 01", "12345")
orderItem.checkOutConfirmatioBackpack()
