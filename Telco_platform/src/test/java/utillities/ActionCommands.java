package utillities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.Random;

import static utillities.BaseClass.driver;

public class ActionCommands {

    protected void openurl(WebDriver driver, String URL){
        driver.get(URL);
    }
    protected void click (WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
    protected void type (WebDriver driver, By locator, String input){
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        }catch (NoSuchElementException e){
            System.out.println("No such a element "+ e.getMessage());
            throw e;
        }
    }
    protected void verifyText(WebDriver driver, By locator, String expectedResults){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText().trim(),expectedResults);
    }

    protected void assertElementExists(WebDriver driver, By locator, String elementName) {
        verifyElementExists(driver, locator, elementName);
    }

    protected void verifyElementExists(WebDriver driver, By locator, String elementName) {
        try {
            waitTime(driver, locator);
            WebElement element = driver.findElement(locator);
            Assert.assertTrue(element.isDisplayed(), elementName + " is displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail(elementName + " is not found.");
        }
    }

    protected void clearText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.clear();
    }
    protected String getText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
    protected String getAttribute(WebDriver driver,By locator,String attribute){
        WebElement element = driver.findElement(locator);
        String attributeValue = element.getAttribute(attribute);
        return attributeValue;
    }
    protected void hitEnter(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }
    protected void assetString(String expected,String actual){
        Assert.assertEquals(actual,expected);
    }
    protected void waitTime(WebDriver driver,By locator){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void checkVisibility(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
    }
    protected void checkboxValidity(WebDriver driver,By locator,boolean expect){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(expect,element.isSelected());

    }

    protected void humanLikeTyping(WebDriver driver, By locator, String input) {
        try {
            WebElement element = driver.findElement(locator);

            for (char c : input.toCharArray()) {
                element.sendKeys(Character.toString(c));
                try {
                    Thread.sleep((long) (Math.random() * 200 + 100));
                } catch (InterruptedException e) {
                    System.out.println("Interrupted while typing: " + e.getMessage());
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println("No such element: " + e.getMessage());
            throw e;
        }
    }

    public void moveMouseVisuallyAndClick(WebDriver driver, By locator) {
        try {

            WebElement element = driver.findElement(locator);


            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            Thread.sleep(200);


            int elementX = element.getLocation().getX();
            int elementY = element.getLocation().getY();
            int elementWidth = element.getSize().getWidth();
            int elementHeight = element.getSize().getHeight();


            int centerX = elementX + (elementWidth / 2);
            int centerY = elementY + (elementHeight / 2);


            JavascriptExecutor js = (JavascriptExecutor) driver;
            Long windowX = (Long) js.executeScript("return window.screenX;");
            Long windowY = (Long) js.executeScript("return window.screenY;");
            Long browserHeight = (Long) js.executeScript("return window.outerHeight - window.innerHeight;");


            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            double screenScale = gd.getDefaultConfiguration().getDefaultTransform().getScaleX();


            int absoluteX = (int) ((windowX + centerX) * screenScale);
            int absoluteY = (int) ((windowY + centerY + browserHeight) * screenScale);


            Robot robot = new Robot();


            int steps = 30;
            for (int i = 0; i <= steps; i++) {

                int moveX = (int) (absoluteX * i / steps);
                int moveY = (int) (absoluteY * i / steps);


                robot.mouseMove(moveX, moveY);


                Thread.sleep(5);
            }


            robot.mouseMove(absoluteX, absoluteY);


            Thread.sleep(100);


            Point cursorPosition = MouseInfo.getPointerInfo().getLocation();
            if (cursorPosition.x >= elementX && cursorPosition.x <= elementX + elementWidth &&
                    cursorPosition.y >= elementY && cursorPosition.y <= elementY + elementHeight) {

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            } else {
                int adjustment = 5;
                robot.mouseMove(absoluteX, absoluteY - adjustment);


                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }

        } catch (Exception e) {
            System.out.println("Error in moving mouse or clicking: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void hover(WebDriver driver, By locator) {
        try {

            WebElement element = driver.findElement(locator);

            // Scroll element into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            Thread.sleep(200);

            // Get element coordinates and dimensions
            int elementX = element.getLocation().getX();
            int elementY = element.getLocation().getY();
            int elementWidth = element.getSize().getWidth();
            int elementHeight = element.getSize().getHeight();

            // Calculate the center of the element
            int centerX = elementX + (elementWidth / 2);
            int centerY = elementY + (elementHeight / 2);

            // Get browser's position and size details
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Long windowX = (Long) js.executeScript("return window.screenX;");
            Long windowY = (Long) js.executeScript("return window.screenY;");
            Long browserHeight = (Long) js.executeScript("return window.outerHeight - window.innerHeight;");

            // Get screen scaling factor (for high DPI displays)
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            double screenScale = gd.getDefaultConfiguration().getDefaultTransform().getScaleX();

            // Convert element's coordinates to absolute screen coordinates
            int absoluteX = (int) ((windowX + centerX) * screenScale);
            int absoluteY = (int) ((windowY + centerY + browserHeight) * screenScale);

            // Initialize the Robot class to move the mouse
            Robot robot = new Robot();

            // Smooth mouse movement in steps
            int steps = 30;
            for (int i = 0; i <= steps; i++) {
                int moveX = (int) (absoluteX * i / steps);
                int moveY = (int) (absoluteY * i / steps);

                robot.mouseMove(moveX, moveY);

                Thread.sleep(5);  // Adjust this to control movement speed
            }

            // Move the mouse to the final position (center of the element)
            robot.mouseMove(absoluteX, absoluteY);

        } catch (Exception e) {
            System.out.println("Error in moving mouse to hover: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void verifyElementEditable(WebDriver driver, By locator, boolean shouldBeEditable) {
        try {
            // Find the element using the provided XPath
            WebElement element = driver.findElement(locator);

            // Check if the element is disabled
            boolean isDisabled = element.getAttribute("disabled") != null;

            // Check if the element is readonly
            boolean isReadOnly = element.getAttribute("readonly") != null;

            // Check if the element is editable or not
            boolean isEditable = !isDisabled && !isReadOnly;

            // If the user wants to verify the element is editable
            if (shouldBeEditable) {
                if (isEditable) {
                    System.out.println("The element is editable as expected.");
                } else {
                    System.out.println("The element is NOT editable, but it was expected to be.");
                }
            } else {
                // If the user wants to verify the element is not editable
                if (!isEditable) {
                    System.out.println("The element is NOT editable as expected.");
                } else {
                    System.out.println("The element is editable, but it was expected to be uneditable.");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("The element was not found with the provided XPath.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }


    protected void selectItem(WebDriver driver, By locator,String visibleText){
        WebElement element = driver.findElement(locator);
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(visibleText);
    }


    //randomly generate username for admin
    public void genarateusername(WebDriver driver,By locator){
        WebElement element=driver.findElement(locator);
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
        Random random=new Random();
        int length=random.nextInt(16)+5;
        StringBuilder username=new StringBuilder();
        for (int i=0;i<length;i++){
            int index=random.nextInt(characters.length());
            username.append(characters.charAt(index));
        }
        element.sendKeys(username.toString());
    }





}
