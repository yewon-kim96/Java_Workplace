package client;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClientUi {
	TextArea ta;
	TextField tf;	
	
	public void chatMsg() {
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
	public void onCreate() {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("채팅");
		 tf=new TextField(20);
		 ta=new TextArea();	
		 MenuBar mb = new MenuBar();
		 Menu file_menu = new Menu("파일");
		 Menu edit_memu = new Menu("편집");
		 MenuItem open_item = new MenuItem("열기");
		 MenuItem save_item = new MenuItem("저장");
		 
		 file_menu.add(open_item);
		 file_menu.add(save_item);
		 mb.add(file_menu);
		 mb.add(edit_memu);
		 f.setMenuBar(mb);
		 
		 open_item.addActionListener(new ActionListener() {
			
			 @Override
			 public void actionPerformed(ActionEvent a) {
				 System.out.println("file open");
				 FileDialog open = new FileDialog(f, "열기 창", FileDialog.LOAD);
				 open.setVisible(true);
				 
				 FileReader fr = null;
					BufferedReader br = null;
					
					try {
						fr = new FileReader(open.getDirectory()+open.getFile());
						br = new BufferedReader(fr);
						String oneLine="";
						ta.setText(""); //앞의 내용이 지워지는 효과
						while((oneLine = br.readLine()) != null) {
							ta.append(oneLine +"\n");	
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}finally {
						try {
							if(br != null) br.close();
							if(fr != null) fr.close();
					} catch(IOException e) {
						
					}

				}
			 
		 }
	});
		 
//		 ta.addTextListener(e -> System.out.println("text change"));
		 
//		 ta.addMouseListener(new MouseAdapter() { //inner 클래스 -> 가독성을 높이기 위해서
//			 @Override
//			public void mouseEntered(MouseEvent e) {
//				ta.append("마우스 진입\n");
//			}
//		});
		 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//채팅 서버 연결
				
			}
		} );
		//((/*ActionEvent*/ e)  -> chatMsg()); //람다식 표현 방법(function에 function이 들어가는 것) 
			//@FunctionalInterface -> 람다식 표현 가능
			// 하고 싶은 일
	        //반복되는 코드가 있을 때 메소드로 분리하고 호출해서 사용하면 된다.
					
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
			}
		});
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ClientUi ui=new ClientUi();
		ui.onCreate();
	}//end main
	
	
	
	


}//end ClientUi