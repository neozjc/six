package akuan;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
public class BorderLayoutDemo extends Frame
{
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        Button b5 = new Button("Button5");
        BorderLayoutDemo(String title)
       {
               super(title);
               super.setSize(500,400);
 
               //将窗口设置为边框布局
               super.setLayout(new BorderLayout());
 
               super.add(b1,BorderLayout.NORTH);
               super.add(b2,BorderLayout.SOUTH);
               super.add(b3,BorderLayout.WEST);
               super.add(b4,BorderLayout.EAST);
               super.add(b5,BorderLayout.CENTER);
      }
      public static void main(String[] args)
     {
               BorderLayoutDemo borderLayoutDemo =
                            new BorderLayoutDemo("BorderLayout演示");
                borderLayoutDemo.setVisible(true);
      }
}
