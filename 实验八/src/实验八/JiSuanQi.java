package ʵ���;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
class WinJ extends JFrame{
	private static final long serialVersionUID = 1L;
	WinJ(){}
	//��������
    JPanel pane=new JPanel();
    //���������ı���
    JTextField num1=new JTextField(7);
    JTextField num2=new JTextField(7);
    JTextField result=new JTextField(7);
    //�����ĸ���ť
    JButton jia=new JButton("��");
    JButton jian=new JButton("��");
    JButton cheng=new JButton("��");
    JButton chu=new JButton("��");
	WinJ(String s,int x,int y,int w,int h){
		setTitle(s);
		into(x,y,w,h);
	}
  public void into(int x,int y,int w,int h){
	  setBounds(x,y,w,h);
	  //����������
	  pane.add(num1);
	  pane.add(num2);
	  pane.add(result);
	  pane.add(jia);
	  pane.add(jian);
	  pane.add(cheng);
	  pane.add(chu); 
	  //�������봰�ڿ��
	  setContentPane(pane);
	  //��������������ù��췽��
	  MyActionListener listener=new MyActionListener(this);
	  //Ϊ�¼�Դ���ü�����
	  jia.addActionListener(listener);
	  jian.addActionListener(listener);
	  cheng.addActionListener(listener);
	  chu.addActionListener(listener);
	  
  }
  //����һ����������ʵ��ActionListener�ӿڡ�
class MyActionListener implements ActionListener{
	//������������������
      WinJ winj1=new WinJ();
	public MyActionListener(WinJ winj1) {
		// TODO Auto-generated method stub
		this.winj1=winj1;
	}
	//�����¼�����
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��������һ���쳣���� �����벻�����ֵ�ʱ�򱨳��쳣
		try {
			//�õ�ǰ�����������������ת��Ϊdouble ��
		double n1=Double.parseDouble(winj1.num1.getText());
		double n2=Double.parseDouble(winj1.num2.getText());
		double r=0;
		//e.getActionCommand()���������ڰ�ť�ϵ��ַ���
		String str=e.getActionCommand();
		if(str=="��") {
			//�ӷ�����
			r=n1+n2;
			//Ϊ�������ı���������ֵ
			winj1.result.setText(""+r);
		    }
		else if(str=="��") {
			 r=n1-n2;    winj1.result.setText(""+r);
			}
		else if(str=="��") {
			r=n1*n2;     winj1.result.setText(""+r);
			         }
		else r=n1/n2;    winj1.result.setText(""+r);
		  }
		catch(NumberFormatException exp) {
			//�쳣����
			winj1.result.setText("����������");
		}	
	}
	  
  }	
}
public class JiSuanQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinJ winj=new WinJ("������",100,100,288,288);
		winj.setVisible(true);
		winj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
