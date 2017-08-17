package dataDriven;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelLibrary  {

    public ExcelLibrary() {
    }

    @Test
    public void dataDriven() throws IOException {
        FileInputStream excelFile = new FileInputStream("workeroData.xlsx");
        Workbook workbook = new XSSFWorkbook(excelFile);
        FileOutputStream excelData = new FileOutputStream("workeroData.xlsx");
        Sheet sheet = workbook.getSheetAt(0);

        for(int i = 1; i <= sheet.getLastRowNum(); i++) {
//            String officeName = sheet.getRow(i).getCell(0).getStringCellValue();
//            System.out.println(officeName);
//
//            String vatNumber = sheet.getRow(i).getCell(1).getStringCellValue();
//            System.out.println(vatNumber);
        }
    }
}
