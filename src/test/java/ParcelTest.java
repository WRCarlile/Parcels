import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

//the app gets the input and returns the String
  @Test
  public void Parcel_isDimensionAndWeight_true() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(true, testParcel instanceof Parcel);
  }
  @Test
  public void Parcel_isLength_3() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(3, testParcel.getLength());
  }
  @Test
  public void Parcel_isWidth_4() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(4, testParcel.getWidth());
  }
  @Test
  public void Parcel_isHeight_6() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(6, testParcel.getHeight());
  }
  @Test
  public void Parcel_isWeight_2() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(2, testParcel.getWeight());
  }

  @Test
  public void Parcel_isVolume_72() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    assertEquals(72, testParcel.getVolume());
  }
  @Test
  public void Parcel_isShipping_expected() {
    Parcel testParcel = new Parcel(3,4,6,2,2);
    double expected = 28.8;
    assertEquals(28, (int) testParcel.getShipping());
  }
}
