package com.cjc.disbursment.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.repository.XlsRepository;

@RestController
public class XlsController
{
	@Autowired
	XlsRepository xr;
	public static final String PATH = "C:\\\\Users\\\\lenovo\\";
	String filename="LedgerDb3.xlsx";
	@GetMapping("/getCustomer/{customerid}")
	public String getXls(@PathVariable ("customerid") int cid) throws SQLException, IOException
	{
		System.out.println("inside controller!");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Ledger_Details_vls");
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.createSheet("Ledger db");
			
			XSSFRow row=sheet.createRow(1);
			XSSFCell cell;
			cell=row.createCell(1);
			cell.setCellValue("LEDGERID");
			cell=row.createCell(2);
			cell.setCellValue("ADVANCE_EMI_PAID");
			cell=row.createCell(3);
			cell.setCellValue("AMOUNT_PAY_BY_CUSTOMER");
			cell=row.createCell(4);
			cell.setCellValue("DEFAULTER_COUNT");
			cell=row.createCell(5);
			cell.setCellValue("EMI_AMOUNT");
			cell=row.createCell(6);
			cell.setCellValue("EMI_PAID_DATE");
			cell=row.createCell(7);
			cell.setCellValue("REMAINING_PAY_BY_CUSTOMER");
			cell=row.createCell(8);
			cell.setCellValue("TOTAL_PAID_AMOUNT");
			cell=row.createCell(9);
			cell.setCellValue("CASEID");
			int sel=2;
			
			while(rs.next())
			{
				row=sheet.createRow(sel);
				cell=row.createCell(1);
				cell.setCellValue(rs.getInt("cid"));
				cell=row.createCell(2);
				cell.setCellValue(rs.getString("cust_name"));
				cell=row.createCell(3);
				cell.setCellValue(rs.getString("cust_address"));
				cell=row.createCell(4);
				cell.setCellValue("cust_gender");
				cell=row.createCell(5);
				cell.setCellValue("cust_dob");
				cell=row.createCell(6);
				cell.setCellValue("cust_salalry");
				cell=row.createCell(7);
				cell.setCellValue("cust_annual_income");
				cell=row.createCell(7);
				cell.setCellValue("emailid");
				sel++;
				
			}
			
			FileOutputStream fos=new FileOutputStream(PATH+filename);
			wb.write(fos);
			fos.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "xls generated";
	}

}
