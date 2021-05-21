package java_20210521;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) {

		// 새 엑셀 파일 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 새 시트 생성
		HSSFSheet sheet = workbook.createSheet("new file");
		// 행(row)을 생성
		HSSFRow row = sheet.createRow(0);
		// 셀(열) 생성
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(0,0)");

		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(0,1)");

		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(0,2)");

		// 1번째 행
		row = sheet.createRow(1);
		
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(1,0)");

		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(1,1)");

		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(1,2)");

		// 2번째 행
		row = sheet.createRow(2);
		
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(2,0)");

		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(2,1)");

		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(2,2)");
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("C:\\Users\\user\\Desktop\\test_case.xls");
			workbook.write(fout);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fout != null) fout.close();
					if(workbook != null) workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
