package test3;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test3 {

	public static void main(String[] args) {
		Frame f = new Frame();
		TextArea ta = new TextArea();
		
		A handler = new A();
		ta.addMouseListener(handler);
		
		ta.setBackground(Color.ORANGE);
		f.add(ta,BorderLayout.CENTER);
		Panel p =new Panel();
		p.setSize(500, 100);
		p.setBackground(Color.GREEN);
		f.add(p, BorderLayout.SOUTH);
//		Button b = new Button("Button");
//		f.add(b,BorderLayout.SOUTH);
		f.setSize(500, 300);
		f.setVisible(true);

	}

}

class A implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스가 클릭되었어요.");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스가 눌렸어요.");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스가 릴리즈되었어요.");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 TextArea영역 안에 들어왔어요.");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 TextArea영역 밖으로 나갔어요.");
		
	}
	
}
