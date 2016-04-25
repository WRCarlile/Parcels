import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

//the app gets the input and returns the String
  @Test
  public void Parcel_isDimensionAndWeight_true() {
    Parcel testParcel = new Parcel(3,4,6,2);
    assertEquals(true, testParcel instanceof Parcel);
  }
}
