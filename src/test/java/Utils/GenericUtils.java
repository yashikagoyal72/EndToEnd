package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		
		this.driver=driver;
	}

	public void SwitchWindowToChild() {
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> It  = windows.iterator();
		String parent = It.next();
		String child = It.next();
		driver.switchTo().window(child);
	}
}
