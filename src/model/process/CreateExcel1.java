package model.process;
import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreateExcel1 {
	public void readexcel(){
        try {
            // 打开文件

            WritableWorkbook book = Workbook.createWorkbook(new File("booklist.xls"));
            // 生成名为“第一页”的工作表，参数0表示这是第一页
            WritableSheet sheet1 = book.createSheet("Sheet", 0);
            // 在Label对象的构造子中指名单元格位置是第一列第一行(0,0)

            Label label1=new Label(0,0,"id");

            Label label2=new Label(1,0,"coursename");
            Label label3=new Label(2,0,"teacherid");
            Label label4=new Label(3,0,"state");
            
         //   Label label5=new Label(4,0,"兴趣");
      
            
            sheet1.addCell(label1);
            sheet1.addCell(label2);
            sheet1.addCell(label3);
            sheet1.addCell(label4);
           // sheet1.addCell(label5);
            //sheet1.addCell(label6);
           // sheet1.addCell(label7);

            // 写入数据并关闭文件
            book.write();
            book.close();
            System.out.println("Excel已生成！");
        } catch (Exception e) {
            System.out.println(e);
        }
}
}