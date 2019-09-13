package com.globallogic.utils;

import static com.globallogic.utils.Constants.Episode_sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private XSSFWorkbook workbook;
	private Sheet sheet;

	private FileOutputStream file_out;

	public ExcelUtils(String filePath) {

		try {
			file_out = new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(Episode_sheet);
	}

	public void createExcelFileandWriteCell(String filePath, ArrayList<String> episode_tile,
			ArrayList<String> episode_durations) {
		try {

			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());

			Row row = sheet.createRow(0);
			Cell cell = row.createCell(1);
			Cell cell2 = row.createCell(2);
			cell.setCellStyle(style);
			cell.setCellValue("Episode title");
			cell2.setCellStyle(style);
			cell2.setCellValue("Episode durations");

			for (int i = 1; i <= episode_tile.size() - 1; i++) {
				row = sheet.createRow(i);
				cell = row.createCell(1);
				cell2 = row.createCell(2);
				cell.setCellStyle(style);
				cell.setCellValue(episode_tile.get(i));
				cell2.setCellStyle(style);
				cell2.setCellValue(episode_durations.get(i));

			}

			workbook.write(this.file_out);
			file_out.close();
			workbook.close();
		} catch (Throwable e) {
			e.printStackTrace();

			System.exit(0);
		}
	}

}
