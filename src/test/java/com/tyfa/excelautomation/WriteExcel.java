package com.tyfa.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.*;

import java.io.*;

public class WriteExcel {

    @Test
    public void test() throws IOException {
        String filePathway = "src/test/resources/Datas.xlsx";
        FileInputStream file = new FileInputStream(filePathway);//You need this line to open an excel file


        //Let's read Workbook (excel) file. Open an excel file
        Workbook excel = WorkbookFactory.create(file);

        FileOutputStream fileOutputStream = new FileOutputStream(filePathway);//You need this line to save an excel file

        //Select sheet
        Sheet sheet = excel.getSheetAt(0); //Brings the first one. Index starts from 0.

        //Creating a ew cell and entering data in it
        sheet.getRow(0).createCell(3).setCellValue("Comment");
        sheet.getRow(1).createCell(3).setCellValue("50");
        sheet.getRow(2).createCell(3).setCellValue("100");
        sheet.getRow(3).createCell(3).setCellValue(5);

        //To delete a row
        Row deletedRow = sheet.getRow(3);
        sheet.removeRow(deletedRow);

        //To delete a cell
        Cell deletedCell = sheet.getRow(0).getCell(0);
        sheet.getRow(0).removeCell(deletedCell);

        //To make changes on your excel file and save the changes you need to have the following file
        excel.write(fileOutputStream);

        excel.close();
        file.close();
    }
}
