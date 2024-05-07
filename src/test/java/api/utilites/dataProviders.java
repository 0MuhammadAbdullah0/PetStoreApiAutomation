package api.utilites;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class dataProviders {

    @DataProvider(name="data")
    public String[][] getAllData() throws IOException
    {
        XLUtils xl=new XLUtils("data.xlsx");

        int rownum=xl.getRowCount("Sheet1");
        int colcount=xl.getCellCount("Sheet1",1);

        String apidata[][]=new String[rownum][colcount];
        for(int i=1;i<=rownum;i++)
        {
            for (int j=0;j<colcount;j++)
            {
                apidata[i-1][j]=xl.getCellData("Sheet1",i,j);
            }
        }
        return apidata;
    }
    @DataProvider(name = "Username")
    public String[] getUsername() throws IOException {
        XLUtils xl = new XLUtils("data.xlsx");

        int rownum = xl.getRowCount("Sheet1");
        String apidata[] = new String[rownum];

        for (int i = 1; i <= rownum; i++) {

            apidata[i - 1] = xl.getCellData("Sheet1", i, 1);
        }
        return apidata;
    }
}
