package akuan;

import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
public class FlowLayoutDemo extends Frame
{
     Button b1 = new Button("button1");
     Button b2 = new Button("button2");
     Button b3 = new Button("button3");
     Button b4= new Button("button4");
     FlowLayoutDemo(String title)
     {
            super(title);
            super.setSize(500,400);
 
          //����������Ϊˮƽ����
             super.setLayout(new FlowLayout(FlowLayout.LEFT));
 
             super.add(b1);
             super.add(b2);
             super.add(b3);
             super.add(b4);
     }
     public static void main(String[] args)
    {
             FlowLayoutDemo flowLayoutDemo =
                         new FlowLayoutDemo("FlowLayout��ʾ");
             flowLayoutDemo.setVisible(true);
    }
}