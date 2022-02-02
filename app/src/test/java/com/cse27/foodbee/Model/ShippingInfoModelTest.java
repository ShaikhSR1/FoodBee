import static org.junit.Assert.assertEquals;

import android.text.TextUtils;
import android.util.Patterns;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import android.content.Context;

import com.cse27.foodbee.Model.ShippingInfoModel;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;

public class ShippingInfoModelTest {
    ShippingInfoModel shippingInfoModel,shippingInfoModel1;

    public int a;

    TextUtils textUtils= Mockito.mock(TextUtils.class);
    Patterns patterns = Mockito.mock(Patterns.class);



    public String[][] testCases= {
            {"","","","",""},
            {"Asraf Ullah Rahat","","","",""},
            {"Asraf Ullah Rahat","rahatju41","","",""},
            {"Asraf Ullah Rahat","rahatju41.com","","",""},
            {"Asraf Ullah Rahat","rahatju41@gmailcom","","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.","","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","01795","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","0179523440","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","017952344041","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","01795234404","",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","01795234404","Dhanmondi",""},
            {"Asraf Ullah Rahat","rahatju41@gmail.com","01795234404","Dhanmondi","Yammy Food"},

    };

    int testOutput[]= {0,1,2,2,2,2,3,4,4,4,5,6,6};



    public String getFullNameTest(int a) {
        String testCase1 = testCases[a][0];
        return testCase1;
    }
    public String getEmailTest(int a) {
        String testCase2 = testCases[a][1];
        return testCase2;
    }
    public String getPhoneTest(int a) {
        String testCase3 = testCases[a][2];
        return testCase3;
    }
    public String getAddressTest(int a) {
        String testCase4 = testCases[a][3];
        return testCase4;
    }
    public String getOptionalNoteTest(int a) {
        String testCase5 = testCases[a][4];
        return testCase5;
    }

    public int getOutput(int a) {
        int output=testOutput[a];
        return output;
    }
    /**
     * Calling constructor
     */
    public void setUp(int n) throws Exception {
        shippingInfoModel = new ShippingInfoModel(testCases[n][0], testCases[n][1], testCases[n][2], testCases[n][3], testCases[n][4]);
    }



    /**
     * Checks Shipping Info Validity
     */
    @Test
    public void testIsShippingInfoValid0() throws Exception {
        int n=0;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid1() throws Exception {
        int n=1;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid2() throws Exception {
        int n=2;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid3() throws Exception {
        int n=3;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid4() throws Exception {
        int n=4;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid5() throws Exception {
        int n=5;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid6() throws Exception {
        int n=6;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid7() throws Exception {
        int n=7;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid8() throws Exception {
        int n=8;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid9() throws Exception {
        int n=9;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid10() throws Exception {
        int n=10;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid11() throws Exception {
        int n=11;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }

    @Test
    public void testIsShippingInfoValid12() throws Exception {
        int n=12;
        setUp(n);
        assertEquals(testOutput[n], shippingInfoModel.isShippingInfoValid());
    }


}