package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtils {
	public ChromeDriver driver;
	public GenericUtils(ChromeDriver driver) {
		
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
