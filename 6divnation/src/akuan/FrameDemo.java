package akuan;

import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.TextArea;
public class FrameDemo extends Frame
{
       Label label = new Label("���ƣ�",Label.RIGHT);
       TextField tf = new TextField(20);
       TextArea ta = new TextArea();
       Button button = new Button("OK");
      //��ѡ
      CheckboxGroup group1 = new CheckboxGroup();
      Checkbox cb1 = new Checkbox("��",group1,false);
      Checkbox cb2 = new Checkbox("Ů",group1,false);
      Choice choice = new Choice();
      String[] items = {"China","USA","Japan","Korea","Germany"};
     FrameDemo(String title)
   {
             super(title);
             //���ô��ڴ�С
             super.setSize(500,400);
             super.setLayout(new FlowLayout(FlowLayout.LEFT));
             super.add(label);
             super.add(tf);
             ta.setEnabled(false);//����д
             super.add(ta);
             super.add(button);
             super.add(cb1);
             super.add(cb2);
            for(int i = 0; i < items.length; i++)
            {
                 choice.addItem(items[i]);
            }
            super.add(choice);
            int width = (int)label.getSize().getWidth();
            int height = (int)label.getSize().getHeight();
            System.out.println("Width:" + width);
            System.out.println("Height:" + height);
     }
    public static void main(String[] args)
   {
           //����һ�����ڵĶ���
           FrameDemo frame = new FrameDemo("Frame��ʾ");
            //��ʾ����
            frame.setVisible(true);
      }
}