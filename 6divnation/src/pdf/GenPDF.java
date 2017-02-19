package pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPRow;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class GenPDF {
	
	public static final String PDF_FILE_PATH = "f:/六爻"+new Date().getTime()+".pdf";
	
	public static void genPDF(String args[]) throws DocumentException, IOException{
		new GenPDF(args);
	}
	public GenPDF(String args []) throws DocumentException, IOException {
		Document doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, new FileOutputStream(PDF_FILE_PATH));
		doc.open();
		// 标题字体
		BaseFont bfTitle = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		Font titleFont = new Font(bfTitle, 18, Font.NORMAL);

		// 内容字体
		BaseFont bfComic = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		Font font = new Font(bfComic, 9, Font.NORMAL);

		Paragraph titleP = new Paragraph("卦象\n\n", titleFont);
		titleP.setAlignment(titleP.ALIGN_CENTER);
		doc.add(titleP);
		PdfPTable table = new PdfPTable(8);
//		table.setWidthPercentage(100);
//		table.setWidthPercentage(100);
//		table.addCell(new Paragraph("Children-id", font));
//		PdfPCell cell = new PdfPCell(new Paragraph("09140800002", font));
//		cell.setColspan(3);
//		table.addCell(cell);
		// 添加第一行
		for(int j=0;j<args.length;j++){
			table.addCell(new Paragraph(args[j], font));
		}
//		table.addCell(new Paragraph("Name(CN)", font));
//		table.addCell(new Paragraph("党宁生", font));
//		table.addCell(new Paragraph("Name(EN)", font));
//		table.addCell(new Paragraph("DANG NING SHENG", font));
//
//		// 添加第二行
//		table.addCell(new Paragraph("Sex(CN)", font));
//		table.addCell(new Paragraph("男", font));
//		table.addCell(new Paragraph("Sex(EN)", font));
//		table.addCell(new Paragraph("MALE", font));
//		
//		table.addCell(new Paragraph("Sex(CN)", font));
//		table.addCell(new Paragraph("男", font));
//		table.addCell(new Paragraph("Sex(EN)", font));
//		table.addCell(new Paragraph("MALE", font));
//		
//		table.addCell(new Paragraph("Sex(CN)", font));
//		table.addCell(new Paragraph("男", font));
//		table.addCell(new Paragraph("Sex(EN)", font));
//		table.addCell(new Paragraph("MALE", font));
		
		for (PdfPRow row : (ArrayList<PdfPRow>) table.getRows()) {
			for (PdfPCell cells : row.getCells()) {
				if (cells != null) {
					cells.setPadding(10.0f);
				}
			}
		}
		doc.add (table); 
		doc.close();
	}
	
	public static void main(String[] args) throws DocumentException, IOException {
		new GenPDF(new String[1]);
	}
	
}
