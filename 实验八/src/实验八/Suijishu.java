package ʵ���;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
class WinJ1 extends JFrame{
	private static final long serialVersionUID = 1L;
	Random random=new Random();
	int realNumber=random.nextInt(100)+1;
	WinJ1(){}
	//��������
    JPanel pane=new JPanel();
    //���������ı���
    JTextField guess=new JTextField(7);
    JTextField result1=new JTextField(7);
    JTextField result2=new JTextField(7);
    //�����ĸ���ť
    JButton yes=new JButton("ȷ��");
    //������ǩ
    Label guessf1 = new Label("������²⣺");
    Label guessf2 = new Label("��Ĳ²�����");
    Label guessf = new Label("��ȷ����ǣ�");
	WinJ1(String s,int x,int y,int w,int h){
		
		setTitle(s);
		into(x,y,w,h);
	}
  public void into(int x,int y,int w,int h){
	  setBounds(x,y,w,h);
	  //����������
	  pane.add(guessf1);
	  pane.add(guess);
	  pane.add(guessf2);
	  pane.add(result1);
	  pane.add(guessf);
	  pane.add(result2);
	  pane.add(yes);
	  //�������봰�ڿ��
	  setContentPane(pane);
	  MyActionListener1 myActionListener1=new MyActionListener1(this);
	  yes.addActionListener(myActionListener1);
  }
}
class MyActionListener1 implements ActionListener{
	 WinJ1 winJ1;
     public MyActionListener1(WinJ1 winJ1) {
		// TODO Auto-generated constructor stub
         this.winJ1=winJ1;
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(winJ1.guess.getText());
			if(n==winJ1.realNumber) {
				winJ1.result1.setText("�¶��ˣ�");
				winJ1.result2.setText();
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}
public class Suijishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinJ1 win1=new WinJ1("���������С",100,100,288,288);
		win1.setVisible(true);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
