/*package com.cjc.disbursment.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.w3c.dom.Document;

import com.cjc.disbursment.model.Customer;
import com.cjc.disbursment.repository.PdfRepository;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class PdfController
{
	@Autowired
	PdfRepository prepo;
	@GetMapping("/getPdf/{customerid}")
	public String generatePdf(@PathVariable ("customerid")int customerid) throws DocumentException, FileNotFoundException
	{
		System.out.println("inside controller!");
		Customer c=prepo.getCustomerById(customerid);
		Document theDocument=new Document(PageSize.A4,50,50,50,50);
		PdfWriter writer=PdfWriter.getInstance(theDocument,new FileOutputStream("C:\\"+c.getCust_name()+"Disburtment_Letter"+".pdf"));
		theDocument.open();
		Paragraph p1=new Paragraph();
		p1.setSpacingBefore(100);
		theDocument.add(p1);
		theDocument.add(new Paragraph("To,\n"+
      		   " Mr./Mrs./Miss :-"+c.getCust_name()+"\n"+
      		   " S/O :-________________________\n"+
      		   " Current Address :"+c.getCust_address()+"\n"+
      		   " Email id:-"+c.getEmailid()+"\n\n"+

      		   " We refer to your application for a Two/three/four Wheeler Loan from VLS PVT LTD\n\n"));
		PdfPTable table=new PdfPTable(4);
		PdfPCell cell= new PdfPCell(new Phrase("Make"));
		table.addCell(cell);
		
		PdfPCell cell1= new PdfPCell(new Phrase("Model"));
		table.addCell(cell1);
		
		PdfPCell cell3=new PdfPCell(new Phrase("Dealer Name"));
        table.addCell(cell3);
        
        PdfPCell cell4=new PdfPCell(new Phrase("SubDealer Name"));
        table.addCell(cell4);
        table.setHeaderRows(1);
        
        table.addCell(""+c.getCustid());
        table.addCell(""+c.getCust_name());
        table.addCell(""+c.getCust_address());
        table.addCell(""+c.getEmailid());
           
        theDocument.add(table);
        
        theDocument.add(new  Paragraph( "We are pleased to inform you that your application has been approved on the terms and condition as lister below:\n\n"));
         
        PdfPTable table1=new PdfPTable(6);
        PdfPCell pcell1=new PdfPCell(new Phrase("Cost of vehicle"));
        table.addCell(pcell1);
        
        PdfPCell pcell2=new PdfPCell(new Phrase("Tenure"));
        table.addCell(pcell2);
        
        PdfPCell pcell3=new PdfPCell(new Phrase("Monthly EMI"));
        table.addCell(pcell3);
        
        PdfPCell pcell4=new PdfPCell(new Phrase("Advance EMI"));
        table.addCell(pcell4);
        
        PdfPCell pcell5=new PdfPCell(new Phrase("Down payment"));
        table.addCell(pcell5);
        
        PdfPCell pcell6=new PdfPCell(new Phrase("Amount payable by VLS to dealer"));
        table.addCell(pcell6);
        table.setHeaderRows(1);
        
        table.addCell("1");
        table.addCell("Mini cooper");
        table.addCell("Alto");
        table.addCell("Vdk");
        table.addCell("2");
        table.addCell("Duster");
        
        theDocument.add(table);
        
        theDocument.add(new  Paragraph( "You are requested to make the down-payment as mentioned, directly to the dealer and take receipt for the same.\n"+
        "This 'Offer Of Letter' order is valid for a period of 7 days from the date of issuance of this letter.\n"+
        "Kindly contact your dealer to avail your Vehicle Loan Services PVT LTD loan.\n\n"));
       
        theDocument.add(new  Paragraph("FOR\n"+"VLS PVT LTD\n"+"AAAAAAAA\n"+"\n\n"+"Vehicle loan services PVT LTD\n"+
                          "408,Shree Complex,\n"+"AKURDI-411061\n"+"PUNE."));
         theDocument.close();   
	
	System.out.println("Done");
	


	return "data get successfully";
		
		
		

		
	}

}*/
