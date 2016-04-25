import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Your name");
  }
  @Test
  public void nameTest() {
    goTo("http://localhost:4567/");
    fill("#userName").with("Ryan");
    submit("#btn");
    assertThat(pageSource()).contains("Welcome Ryan");
  }

  @Test
  public void squareTestIsASquare() {
    goTo("http://localhost:4567/");
    fill("#userName").with("Ryan");
    submit("#btn");
    fill("#length").with("3");
    fill("#width").with("4");
    fill("#height").with("6");
    fill("#weight").with("2");
    fill("#miles").with("2");
    submit(".btn");
    assertThat(pageSource()).contains("Your final cost is");
  }



}
