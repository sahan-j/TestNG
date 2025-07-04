package com.ucsc.automation.fileio;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ExcelHandler {

    private static Map<Integer, Object[]> studentDetails = new HashMap<>();

    static {
        studentDetails.put(1, new Object[]{"Sanath", 37});
        studentDetails.put(2, new Object[]{"Shama", 22});
        studentDetails.put(3, new Object[]{"Ishini", 26});
    }

    public static void writeExcel() throws IOException {
        OutputStream outputStream = new FileOutputStream("studentDetails.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook();  // start a new workbook
        XSSFSheet sheet = wb.createSheet("sheet01");

        IntStream.range(0, studentDetails.size()).forEach(index -> {
            XSSFRow row = sheet.createRow(index);
            Object[] objArr = studentDetails.get(index + 1);

            for (int c = 0; c < objArr.length; c++) {
                XSSFCell cell = row.createCell(c);
                Object value = objArr[c];

                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                }
            }
        });

        // Write the output to a file
        try (FileOutputStream out = new FileOutputStream("detail.xlsx")) {
            wb.write(out);
            System.out.println("Excel file written successfully!");
        }

        wb.close();
    }

    public static void main(String[] args) {
        try {
            writeExcel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}