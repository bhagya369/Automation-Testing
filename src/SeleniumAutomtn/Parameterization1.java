package SeleniumAutomtn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {

FileInputStream file = new FileInputStream("C:\\Users\\91708\\Pictures\\Screenshots\\paramexcel.xlsx");
String value=WorkbookFactory.create(file).getSheet("page1").getRow(0).getCell(0).getStringCellValue();

System.out.println(value);
//double value1=WorkbookFactory.create(file).getSheet("page1").getRow(1).getCell(0).getNumericCellValue();
//System.out.println(value1);
String value3 =WorkbookFactory.create(file).getSheet("Page1").getRow(1).getCell(0).getStringCellValue();
System.out.println(value3);
String value2=WorkbookFactory.create(file).getSheet("page1").getRow(2).getCell(0).getStringCellValue();
System.out.println(value2);


}
}