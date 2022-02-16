package com.tyfa.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.*;

import java.io.*;

public class ReadExcel {
    @Test
    public void test() throws IOException {
        String filePathway = "src/test/resources/Datas.xlsx";
        FileInputStream file = new FileInputStream(filePathway);

        //Let's read Workbook (excel) file. Open an excel file
        Workbook excel = WorkbookFactory.create(file);

        //Select sheet
        Sheet sheet = excel.getSheetAt(0); //Brings the first one. Index starts from 0.

        //Rows
        Row firstRow = sheet.getRow(0);

        //Cells
        Cell name = firstRow.getCell(0);
        Cell number = firstRow.getCell(1);
        Cell category = firstRow.getCell(2);

        System.out.println(name.toString());
        System.out.println(number.toString());
        System.out.println(category.toString());

//        //Kulaklik row
//        Row secondRow = sheet.getRow(1);
//        //Category cell
//        Cell kulaklikCategory = secondRow.getCell(2);

        //Category cell
        Cell kulaklikCategory = sheet.getRow(1).getCell(2);
        System.out.println(kulaklikCategory.toString());

        //Last row index
        int lastRow = sheet.getLastRowNum();
        System.out.println(lastRow);

        //Number of Rows that have data in them
        int rowNumber = sheet.getPhysicalNumberOfRows();
        System.out.println(rowNumber);

        for (int i = 0; i < lastRow; i++) {
            Cell data = sheet.getRow(i).getCell(2);
            System.out.println(data.toString());

        }

        file.close();
    }
}
