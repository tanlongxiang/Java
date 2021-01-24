package 实验八;
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
	//创建容器
    JPanel pane=new JPanel();
    //创建三个文本框
    JTextField guess=new JTextField(7);
    JTextField result1=new JTextField(7);
    JTextField result2=new JTextField(7);
    //创建四个按钮
    JButton yes=new JButton("确定");
    //创建标签
    Label guessf1 = new Label("请输入猜测：");
    Label guessf2 = new Label("你的猜测结果：");
    Label guessf = new Label("正确结果是：");
	WinJ1(String s,int x,int y,int w,int h){
		
		setTitle(s);
		into(x,y,w,h);
	}
  public void into(int x,int y,int w,int h){
	  setBounds(x,y,w,h);
	  //容器添加组件
	  pane.add(guessf1);
	  pane.add(guess);
	  pane.add(guessf2);
	  pane.add(result1);
	  pane.add(guessf);
	  pane.add(result2);
	  pane.add(yes);
	  //容器放入窗口框架
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
				winJ1.result1.setText("猜对了！");
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
		WinJ1 win1=new WinJ1("猜随机数大小",100,100,288,288);
		win1.setVisible(true);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
