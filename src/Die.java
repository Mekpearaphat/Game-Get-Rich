import java.util.Random;

public class Die {
    private int faceValue;
    public void roll()
    {
        faceValue = (new Random().nextInt(6))+1;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
}
