import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.junit.jupiter.api.Assertions;

public class CarAttributeTest {

  example.model.Car car;

  @When("^Car created$")
  public void createCar() {
     example.service.CarService service = new example.service.CarServiceImpl();
     car = service.createCar();
  }

  @Then("^Car price should be 0.0$")
  public void checkPrice() {
     Assertions.assertEquals(car.getPrice(), 0.0);
  }

  @And("Car model should be test")
  public void checkModel() {
     Assertions.assertEquals(car.getModel(), "test");
  }

  @And("^Car year should be 0$")
  public void checkYear() {
     Assertions.assertEquals(car.getYear(), 0);
  }

  @And("Car make should be test")
  public void checkMake() {
    Assertions.assertEquals(car.getMake(), "test");
  }
}
