package ʵ���;
import javax.swing.*;//����һ��Win��̳�JFrame��
import java.awt.*;
class Win extends JFrame{       
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�޲������췽������ֹ�����������洴�������ʱ�����
	Win(){}     
	//�вι��췽��
	Win(String s,int x,int y,int w,int h){
		//Ϊ�������ñ��ⷽ��
		setTitle(s); 
		//���ô���λ�ô�С�Լ���ť�ȷ���
		into(x,y,w,h);  
		 //���ô��ڿɼ�
		setVisible(true);   
		//�����������ڵ�Ӧ�ó���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	void into(int x,int y,int w,int h){ 
		 //����λ�ô��ڴ�С
		setBounds(x, y, w, h);     
		//���ð�ťλ�þ���
		setLayout(new FlowLayout());  
		//���ð�ť�ı�
		JButton an=new JButton("�й�"); 
		//JFrame ����һ����������ֻ��һ����ܡ�
		Container con ; 
		//��getContentPane()�������JFrame��������壬�ٶ���������
		con=getContentPane();      
		//������ɫ
		Color color=new Color(170, 255, 150);
		//��Ҫ���õ���ɫ����������
	    con.setBackground(color);      
	    //���ð�ť����ɫ
		an.setBackground(Color.yellow); 
		 //���ð�ť������ɫ
        an.setForeground(Color.BLUE); 
        //��ͼƬ���õ���ť��
        Icon icon=new ImageIcon("aLightOn.png");
        //���ð�ť����
        Font font =new Font("�����п�",Font.BOLD,50);
        an.setFont(font);                          
        an.setIcon(icon);
        add(an);            //����ť��ӵ�JFrame�����
		}
	
}
public class Testwin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Win win1=new Win();	//�����޲������췽��
  		@SuppressWarnings("unused")
		Win win2=new Win("My First Frame",100,100,288,288);//�����в������췽��
//		    JFrame win=new JFrame("My First Frame");   //����JFrame����������������вι��췽��
//		    JButton an=new JButton("�й�");             //����һ����ť��������вι��췽��
//		    win.setLayout(new FlowLayout());             //ͨ���������JFrame����ķ���
//          Container con =win.getContentPane();           //����һ��������������win�������getContentPane()�������JFrame��������壬�ٶ���������
//          Color color=new Color(170, 255, 150);         //������ɫ��
//          con.setBackground(color);                     //������Ϊwin���ñ�������ɫ
//          win.setBounds(188, 388, 388, 388);             //���ô���λ�ô�С
//          win.setVisible(true);                             //���ô��ڿɼ�
//          win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرմ��ڽ�������
//          an.setBackground(Color.yellow);        
//          an.setForeground(Color.BLUE);
//          Icon icon=new ImageIcon("aLightOn.png");//a.gif
//          Font font =new Font("��Բ",Font.BOLD+Font.ITALIC,20);
//          an.setFont(font);  
//          an.setIcon(icon);
//          win.add(an); 
	}

}
