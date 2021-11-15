*The purpose of this project is to perform basic automation for the monefy app on Android device*

#### Pre-Requisite
- Install java version (prefer "14.0.2")
- Install node (prefer "16.13.0")
- Install npm (prefer "8.1.0")
- Install maven

#### Tools requirement
- Appium server (>=1.19.1)
- IntelliJ IDEA/Eclipse (with cucumber plugins)
- Vysor (to view app on Desktop)

#### Dependencies
- appium: java-client (7.6.0) 
- cucumber: cucumber-java >= 1.2.5
- testng > 7.1.0 (stable)
- junit >= 4.11
- cucumber-junit >= 6.11.0
- cucumber-testng
- cucumber-java

#### Run
 - Connect the android device using USB cable with USB debugging enabled
 - Start Appium server (From terminal or desktop app)
 - Please download the apk file from the link https://www.apkmonk.com/app/com.monefy.app.lite/ and put that in the directory "/resources/apps"
 - Update the config.properties file as per your device 
     * _To get UDID: use command `adb devices` to list the connected devices_ 
 - Select individual feature file for execution or right click on feature folder and run(all feature)

##### Further things to implement in automation
- Configure the cucumbersuite and run through terminal
- JENKINS configuration if possible
- Reports generation from code or JENKINS plug-ins
    