package akuan;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JTextField;

import com.lowagie.text.DocumentException;

import pdf.GenPDF;

public class SixYao extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
	public void test(){
		Frame frame = new Frame("给阿宽的小程序");
		frame.setSize(700,700);
		frame.setLayout(new GridLayout(9,9));
		frame.setLocation(200, 200);
		JTextField [] textFields = new JTextField[64];
		for (int i = 0; i < 64; i++) {
			textFields[i] = new JTextField(i+"");
			frame.add(textFields[i]);
		}

		Button b = new Button("点击我");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textValues[]=new String[64];
				for (int i = 0; i < 64; i++) {
					textValues[i]=textFields[i].getText();
				}
				System.out.println(textFields[1].getText());
				System.out.println("yes, it's me");
				try {
					GenPDF.genPDF(textValues);
				} catch (DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.add(b);
		
		frame.addWindowListener(this);
		frame.setVisible(true);
		
		System.out.println("hello gui");
	}
	
	public static void main(String[] args) {
		
		new SixYao().test();
		
	}
	
	class MyWin extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
		}
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowOpened(e);
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosed(e);
		}
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowActivated(e);
		}
	}
}
