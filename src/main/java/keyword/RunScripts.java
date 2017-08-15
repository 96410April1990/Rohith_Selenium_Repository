package keyword;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wrappers.OpentapsWrappers;

public class RunScripts extends OpentapsWrappers{

	/*
	 *  Run Scripts ------
	 * 
	 */
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		testCaseName 	= "TC001 - Twitter Login";
		testDescription = "Log into twitter using the given credentials";	
	}

	@Test
	public void runScripts() throws IOException {

		CallWrappersUsingKeyword keywords = new CallWrappersUsingKeyword();

		try {
			FileInputStream fis = new FileInputStream("C://Users//NANDAKUMARSIR//April//POM//keywords//KeywordDriver.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();			

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					
					if(row.getCell(3).getStringCellValue().toLowerCase().equals("yes"))
						keywords.getAndCallKeyword("C://Users//NANDAKUMARSIR//April//POM//keywords//"+row.getCell(1).getStringCellValue()+".xlsx");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
