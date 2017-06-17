package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
    @Test
	public void logintest() throws IOException
{
	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/?gfe_rd=cr&ei=44E7WZXIJYry8Afq64KQDw&gws_rd=ssl");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\workspace\\Mars\\GoogleTest\\Screenshot"));
	wd.quit();
}
}
