import org.junit.Assert;
import org.junit.Test;

public class MarkResultTest {

    @Test
    public void limitValueForBadMarksZeroPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(0) ;

        Assert.assertEquals("2",result);
    }

    @Test
    public void limitValueForBadMarksThirtyFivePoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(35) ;

        Assert.assertEquals("2",result);
    }

    @Test
    public void AverageValueForBadMarks(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(25) ;

        Assert.assertEquals("2",result);
    }


    @Test
    public void limitValueForSatisFactoryThirtySixPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(36) ;

        Assert.assertEquals("3",result);
    }

    @Test
    public void limitValueForSatisFactoryFiftySixPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(56) ;

        Assert.assertEquals("3",result);
    }

    @Test
    public void AverageValueSatisFactory(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(40) ;

        Assert.assertEquals("3",result);
    }


    @Test
    public void limitValueForGoodMarkFiftySevenPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(57) ;

        Assert.assertEquals("4",result);
    }

    @Test
    public void limitValueForGoodMarkSeventyOnePoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(71) ;

        Assert.assertEquals("4",result);
    }

    @Test
    public void AverageValueGoodMark(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(65) ;

        Assert.assertEquals("4",result);
    }

    @Test
    public void limitValueForExcellentMarkSeventyTwonPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(72) ;

        Assert.assertEquals("5",result);
    }

    @Test
    public void limitValueForExcellentMarkOneHundredPoints(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(100) ;

        Assert.assertEquals("5",result);
    }

    @Test
    public void AverageValueExcellentMark(){

        MarkResult mark = new MarkResult();

        String result = mark.getMarkResult(90) ;

        Assert.assertEquals("5",result);
    }
}
