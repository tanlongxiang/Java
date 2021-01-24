package 实验八;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
class WinJ extends JFrame{
	private static final long serialVersionUID = 1L;
	WinJ(){}
	//创建容器
    JPanel pane=new JPanel();
    //创建三个文本框
    JTextField num1=new JTextField(7);
    JTextField num2=new JTextField(7);
    JTextField result=new JTextField(7);
    //创建四个按钮
    JButton jia=new JButton("加");
    JButton jian=new JButton("减");
    JButton cheng=new JButton("乘");
    JButton chu=new JButton("除");
	WinJ(String s,int x,int y,int w,int h){
		setTitle(s);
		into(x,y,w,h);
	}
  public void into(int x,int y,int w,int h){
	  setBounds(x,y,w,h);
	  //容器添加组件
	  pane.add(num1);
	  pane.add(num2);
	  pane.add(result);
	  pane.add(jia);
	  pane.add(jian);
	  pane.add(cheng);
	  pane.add(chu); 
	  //容器放入窗口框架
	  setContentPane(pane);
	  //声明监听器类调用构造方法
	  MyActionListener listener=new MyActionListener(this);
	  //为事件源设置监听器
	  jia.addActionListener(listener);
	  jian.addActionListener(listener);
	  cheng.addActionListener(listener);
	  chu.addActionListener(listener);
	  
  }
  //创建一个监听器类实现ActionListener接口。
class MyActionListener implements ActionListener{
	//创建监听器监听对象
      WinJ winj1=new WinJ();
	public MyActionListener(WinJ winj1) {
		// TODO Auto-generated method stub
		this.winj1=winj1;
	}
	//处理事件程序
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//首先设置一个异常处理 当输入不是数字的时候报出异常
		try {
			//得到前两个窗口输入的数据转换为double 型
		double n1=Double.parseDouble(winj1.num1.getText());
		double n2=Double.parseDouble(winj1.num2.getText());
		double r=0;
		//e.getActionCommand()方法依赖于按钮上的字符串
		String str=e.getActionCommand();
		if(str=="加") {
			//加法运算
			r=n1+n2;
			//为第三个文本框设置数值
			winj1.result.setText(""+r);
		    }
		else if(str=="减") {
			 r=n1-n2;    winj1.result.setText(""+r);
			}
		else if(str=="乘") {
			r=n1*n2;     winj1.result.setText(""+r);
			         }
		else r=n1/n2;    winj1.result.setText(""+r);
		  }
		catch(NumberFormatException exp) {
			//异常处理
			winj1.result.setText("请输入数字");
		}	
	}
	  
  }	
}
public class JiSuanQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinJ winj=new WinJ("计算器",100,100,288,288);
		winj.setVisible(true);
		winj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
