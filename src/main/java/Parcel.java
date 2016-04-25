
public class Parcel {
  private int mLength;
  private int mWidth;
  private int mHeight;
  private int mWeight;
  private int mVolume;
  private int mMiles;
  private double mShipping;

  public Parcel(int length, int width, int height, int weight, int miles) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mMiles = miles;
    mVolume = length * width * height;
  }

  public int getLength() {
    return mLength;
  }
  public int getWidth() {
    return mWidth;
  }
  public int getHeight() {
   return mHeight;
  }
  public int getWeight() {
   return mWeight;
  }
  public int getVolume() {
   return mVolume;
  }
  public double getShipping() {
    mShipping = (mVolume * 0.10 * mWeight * mMiles);
    return mShipping;
  }
}
