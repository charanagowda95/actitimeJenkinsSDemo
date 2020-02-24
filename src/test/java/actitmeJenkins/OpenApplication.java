package actitmeJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenApplication {
	@Test
	public static void getTitle()
	{
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("http://charan/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
