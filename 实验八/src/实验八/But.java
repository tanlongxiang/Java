package ʵ���;
import javax.swing.*;
import java.awt.event.*;
  class An extends JFrame {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		An(){} 
	    //������ǩ
	    JLabel jla=new JLabel();
	    //��������
    	JPanel pane =new JPanel();
        //����������ť
    	JButton an3=new JButton("OK");
    	JButton an4=new JButton("Cancel"); 
    	
    An(String s,int x,int y, int w,int h){
    	setTitle(s);
    	inti();                    
    	setBounds(x,y,w,h);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void inti() {               
        //������������
    	setContentPane(pane);
    	//����ť�����������
    	pane.add(an3);
    	pane.add(an4);	
    	pane.add(jla);
    	//���������������
    	MyActionListener listener=new MyActionListener(this);
    	//Ϊ�¼�Դ���ü�����
    	an3.addActionListener(listener);
    	an4.addActionListener(listener);
    }
    }
  //����һ����������ʵ��ActionListener�ӿڡ�
  class MyActionListener implements ActionListener{
	      An anniu=new An();
		public MyActionListener(An anniu)
		{
			this.anniu=anniu;
		}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str=e.getActionCommand();
		if(str=="OK") {
              System.out.println("�����ȷ����ť");
             //�¼�����
             anniu.jla.setText("     �����ȷ����ť      ");
		}
		else {
			 System.out.println("�����ȡ����ť");
			 anniu.jla.setText("     �����ȡ����ť      ");
		}
	 }
 }
public class But {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           @SuppressWarnings("unused")
		An an1=new An();
           @SuppressWarnings("unused")
		An an2=new An("��ť�¼���ʾ",50,50,10,100);
	}

}
