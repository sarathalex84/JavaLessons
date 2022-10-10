import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteExcel {
    public static void main(String[] args) throws IOException {
        //FileInputStream to fetch the excel file from its stored location
        FileInputStream fis=new FileInputStream("C:\\Users\\Sarath_Alexander\\Desktop\\Age_Validation.xlsx");
        //poi supports two formats of excel(.xlsx) and (.xls)
        // use XSSF for .xlsx and HSSF for (.xls)
        XSSFWorkbook wb=new XSSFWorkbook(fis); // pass the FIS object here and initialise workbook
        //we read the sheet from workbook as we have named the sheet in xl as Age

        // XSSFSheet sheet=wb.getSheet("Age");
        // we can also use another method getSheetAt(0)  to read the sheet at 0 index
        XSSFSheet sheet=wb.getSheetAt(0);
        //count the total no of row in the sheet.
        int rowcount=sheet.getLastRowNum();
        System.out.println("Total no of rows in the sheet"+"" +rowcount);
        //getting the count of columns present in sheet to get the headers
        int colcount=sheet.getRow(1).getLastCellNum();
        System.out.println("Total columns in the sheet"+""+colcount);
        //now to get values we iterate through the sheet.
        //using for loop;
       for(int r=0;r<rowcount;r++) // to iterate through the rows
       {
           XSSFRow row=sheet.getRow(r);
           for(int c=0;c<colcount;c++){
               XSSFCell cell=row.getCell(c);
               //if cell contains string or integers or boolean then we use getCellType();
               switch (cell.getCellType()){
                   case STRING:
                       System.out.println(cell.getStringCellValue());break;
                   case NUMERIC:
                       System.out.println(cell.getNumericCellValue());break;
                   case BOOLEAN:
                       System.out.println(cell.getBooleanCellValue());break;
               }
           }
           System.out.println();
//           if(cell.getCe)
       }
    }
}
