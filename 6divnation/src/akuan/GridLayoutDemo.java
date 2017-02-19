package akuan;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class GridLayoutDemo extends Frame {
	Button[] buttons = new Button[64];

	GridLayoutDemo(String title) {
		super(title);
		super.setSize(900, 600);

		super.setLayout(new GridLayout(8, 8));

		for (int i = 0; i < 64; i++) {
			buttons[i] = new Button("b" + i);
			super.add(buttons[i]);
		}
		super.add(new Panel());
	}

	public static void main(String[] args) {
		GridLayoutDemo gridLayoutDemo = new GridLayoutDemo("GridLayoutÑÝÊ¾");
		gridLayoutDemo.setVisible(true);
	}
}