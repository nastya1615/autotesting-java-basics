import org.junit.Assert;
import org.junit.Test;

public class RefundTicketPricePercentTest {

    @Test
    public void returnMoreThanTenDays(){

       RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
       Integer percent = returnTicket.getRefundTicketPricePercent(264,false,false);

        Assert.assertEquals("100", percent.toString());
    }

    @Test
    public void returnSixDays(){

        RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
        Integer percent = returnTicket.getRefundTicketPricePercent(144,false,false);

        Assert.assertEquals("50", percent.toString());
    }

    @Test
    public void returnTenDays(){

        RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
        Integer percent = returnTicket.getRefundTicketPricePercent(240,false,false);

        Assert.assertEquals("50", percent.toString());
    }

    @Test
    public void returnThreeDays(){

        RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
        Integer percent = returnTicket.getRefundTicketPricePercent(72,false,false);

        Assert.assertEquals("30", percent.toString());
    }

    @Test
    public void returnFiveDays(){

        RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
        Integer percent = returnTicket.getRefundTicketPricePercent(120,false,false);

        Assert.assertEquals("30", percent.toString());
    }

    @Test
    public void returnTwoDays(){

        RefundTicketPricePercent returnTicket = new RefundTicketPricePercent();
        Integer percent = returnTicket.getRefundTicketPricePercent(48,false,false);

        Assert.assertEquals("30", percent.toString());
    }
}
