package com.ucsc.automationcc.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ExcelReader {
    public static void readExcel(String filePath) throws IOException {
        InputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        System.out.println("Reading from Excel file...");

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    System.out.print(cell.getStringCellValue() + "\t");
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    System.out.print((int) cell.getNumericCellValue() + "\t");
                }
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }

    public static void main(String[] args) {
        try {
            readExcel("studentDetails.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}