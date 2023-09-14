import org.junit.Assert;
import org.junit.Test;

public class ImtResultTest {

    @Test
    public void testgetIMTResultIfHeightLowZero(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(0f,50f);

        Assert.assertEquals("указан некорректный рост",imt);
    }

    @Test
    public void testgetIMTResultIfHeightMoreThreeHundredFifty(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(360f,50f);

        Assert.assertEquals("указан некорректный рост",imt);
    }

    @Test
    public void testgetIMTResultIfWeightLowZero(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(120f,-0f);

        Assert.assertEquals("указан некорректный вес",imt);
    }

    @Test
    public void testgetIMTResultIfWeightMoreOneThousand(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(120f,1500f);

        Assert.assertEquals("указан некорректный рост",imt);
    }

    @Test
    public void testgetIMTResultUnderWeight(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(170f,35f);

        Assert.assertEquals("выраженный дефицит массы тела",imt);
    }

    @Test
    public void testgetIMTResultLittleWeight(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(170f,50f);

        Assert.assertEquals("недостаточная масса тела",imt);
    }

    @Test
    public void testgetIMTResultNormalBodyWeight(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(180f,75f);

        Assert.assertEquals("нормальная масса тела",imt);
    }

    @Test
    public void testgetIMTResultOverweight(){

        ImtResult test = new ImtResult();

        String imt = test.getIMTResult(180f,200f);

        Assert.assertEquals("избыточная масса тела",imt);
    }
}
