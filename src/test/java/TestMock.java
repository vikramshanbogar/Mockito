import org.example.IncomeTaxDept;
import org.example.Operations;
import org.example.Tax;
import org.example.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class TestMock {

    @Test
    public void testOperationOnCond() {
        Operations operations = new Operations();
        List<Transaction> list = operations.OnCOndition(p -> p.getAmount() > 1000);
        Assert.assertTrue(list.size() == 4);
    }


    @Test
    public void getTotalTransactionsAmount() {
        Operations operations = new Operations();
        int totalAmt = operations.getTotalTransactionsAmount();
        Assert.assertEquals(totalAmt, 10000);
    }

    @Test
    public void getTotalTransactionsAmountWithTax() {
       Operations operationsMock = mock(Operations.class);
        Transaction transaction = new Transaction(6, 6000, "Cafe");
       when(operationsMock.getTotalTransactionsAmountWithTax(transaction)).thenReturn(0000);
//        IncomeTaxDept incomeTaxDeptMock = mock(IncomeTaxDept.class);
//        when(incomeTaxDeptMock.getTaxAmountByType(Mockito.any(),Mockito.any())).thenReturn(new Tax("new",0));
        System.out.println("After Mockng Tax value is zero, only Transaction to be paid");
//        Operations operations = new Operations();
//        operations.setIncomeTaxDept(incomeTaxDeptMock);
        Assert.assertEquals(0, operationsMock.getTotalTransactionsAmountWithTax(transaction));
    }
}
