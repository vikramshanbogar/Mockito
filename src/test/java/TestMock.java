import org.example.IncomeTaxDept;
import org.example.Operations;
import org.example.Tax;
import org.example.Transaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

import static org.mockito.Mockito.*;

public class TestMock {

    @Test
    public void testOperationOnCond() {
        Operations operations = new Operations(null);
        List<Transaction> list = operations.OnCOndition(p -> p.getAmount() > 1000);
        Assert.assertTrue(list.size() == 4);
    }


    @Test
    public void getTotalTransactionsAmount() {
        Operations operations = new Operations(null);
        int totalAmt = operations.getTotalTransactionsAmount();
        Assert.assertEquals(totalAmt, 10000);
    }

    @Test
    public void getTotalTransactionsAmountWithTax() {
        Transaction transaction = new Transaction(6, 6000, "Cafe");
        IncomeTaxDept incomeTaxDeptMock = mock(IncomeTaxDept.class);
        //Tax structure is not implemented, pls stub and proceed with testing !!!!
        when(incomeTaxDeptMock.getTaxAmountByType(Mockito.any(), Mockito.any())).thenReturn(new Tax("temp", 0)); //Stubbing the Tax Value
        Operations operations = new Operations(incomeTaxDeptMock);
        Assert.assertEquals(transaction.getAmount(), operations.getTotalTransactionsAmountWithTax(transaction));
    }
}
