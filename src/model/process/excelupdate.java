package model.process;
import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class excelupdate {

	
	
	private String  bookName = null;
	private int  bookid = 0;
	private int teacherid=0;
	private int state=0;
    public void updateexcel(String  bookName,int  bookid,int teacherid,int state)
    {
        try {
            // Excel����ļ�
        
        	 this.bookName = bookName;
        	 this. bookid =  bookid;
        	 
             this.teacherid=teacherid;
             this.state=state;
             
            Workbook wb = Workbook.getWorkbook(new File("booklist.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("booklist.xls"),
                    wb);
            // ���һ��������

            WritableSheet sheet2 = book.getSheet(0);
            String  id=null;
            id=id+bookid;
            sheet2.addCell(new Label(0,sheet2.getRows()-1, id));
            sheet2.addCell(new Label(1, sheet2.getRows()-1, bookName));
            String ID=null;
            ID=ID+teacherid;
            sheet2.addCell(new Label(2, sheet2.getRows()-1, ID));
            String state1=null;
            state1=state1+state;
            sheet2.addCell(new Label(2, sheet2.getRows()-1, state1));
            
	
            System.out.println("��Ϣ��ӳɹ���");
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
   /* public void updatesex(String sex){
        try {
            // Excel����ļ�
        
        	String strSex = null;

        	strSex = sex;
            Workbook wb = Workbook.getWorkbook(new File("booklist.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("booklist.xls"),
                    wb);
            // ���һ��������

            WritableSheet sheet2 = book.getSheet(0);
            sheet2.addCell(new Label(2,sheet2.getRows(), strSex));

            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void updatejob(String job){
        try {
            // Excel����ļ�
        
        	String strjob= null;

        	strjob = job;
            Workbook wb = Workbook.getWorkbook(new File("info.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("info.xls"),
                    wb);
            // ���һ��������

            WritableSheet sheet2 = book.getSheet(0);
            sheet2.addCell(new Label(3,sheet2.getRows()-1, strjob));

            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    

    
    public void updatehabbit(String habbit){
        try {
            // Excel����ļ�
        
        	String strHabbit = null;

        	 strHabbit =  habbit;
            Workbook wb = Workbook.getWorkbook(new File("info.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("info.xls"),
                    wb);
            // ���һ��������

            WritableSheet sheet2 = book.getSheet(0);
            sheet2.addCell(new Label(4,sheet2.getRows()-1,  strHabbit));

            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
    

}
