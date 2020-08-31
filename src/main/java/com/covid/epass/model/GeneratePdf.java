package com.covid.epass.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdf {
	public static ByteArrayOutputStream pass(UserPojo userPojo) throws DocumentException, MalformedURLException, IOException {
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Rectangle rect= new Rectangle(577,825,18,15);
		rect.setBorder(Rectangle.BOX);
		rect.setBorderWidth(2);
        rect.setBorderColor(BaseColor.BLACK);
		Font green = new Font(FontFamily.HELVETICA, 20, Font.BOLD, BaseColor.BLUE);
		Image image1 = Image.getInstance("logo.jpg");
		image1.setAlignment(Element.ALIGN_CENTER);
		image1.scaleAbsolute(50, 50);  
		
		Paragraph para1=new Paragraph("Covid-19 e-pass"+"\n\n",green);
		para1.setAlignment(Element.ALIGN_CENTER);
		Paragraph para2=new Paragraph("Holder of this pass is authorised to travel to the destination as given in this pass by the government of Tamil Nadu.");
		para2.setAlignment(Element.ALIGN_CENTER);
		PdfWriter.getInstance(document, out);
		document.open();
		PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(60);
        table.setWidths(new int[]{3,1,3});
        
        PdfPCell hcell;
        
        hcell = new PdfPCell(new Phrase("Name"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getUname()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Address"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getAddress()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Mobile Number"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getMobileno()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        hcell = new PdfPCell(new Phrase("Aadhar Number"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getProofno()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Travelling from"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getDistrict()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Travelling to"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getDestination()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Purpose"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getUpurpose()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("No.Of.Persons"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        String num=Integer.toString(userPojo.getNoOfperson());
        hcell = new PdfPCell(new Phrase(num));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Vehicle Number"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getvNo()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase("Valid till"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(":"));
        hcell.setPaddingLeft(5);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        table.addCell(hcell);
        
        hcell = new PdfPCell(new Phrase(userPojo.getEndDate()));
        hcell.setPaddingLeft(5);
        hcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hcell.setHorizontalAlignment(Element.ALIGN_LEFT);
        hcell.setBorder(Rectangle.NO_BORDER);
        
        BarcodeQRCode barcodeQRCode = new BarcodeQRCode("name : "+userPojo.getUname()+"  Address  :  "+userPojo.getAddress()+"  Destination : "+userPojo.getDestination()+"  Validity till :  "+userPojo.getEndDate(), 1000, 1000, null);
        Image codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(300, 300);
        codeQrImage.setAlignment(5);
        table.setSpacingBefore(10);
        table.addCell(hcell);
        document.add(rect);
        document.add(image1);
        table.setSpacingBefore(0);
        document.add(para1);
		document.add(table);
		document.add(codeQrImage);
		document.add(para2);
        document.close();
		return out;
	}
}
