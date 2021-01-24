package 实验八;
import javax.swing.*;//创建一个Win类继承JFrame类
import java.awt.*;
class Win extends JFrame{       
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//无参数构造方法，防止在主方法里面创建对象的时候出错
	Win(){}     
	//有参构造方法
	Win(String s,int x,int y,int w,int h){
		//为窗口设置标题方法
		setTitle(s); 
		//设置窗口位置大小以及按钮等方法
		into(x,y,w,h);  
		 //设置窗口可见
		setVisible(true);   
		//结束窗口所在的应用程序
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	void into(int x,int y,int w,int h){ 
		 //设置位置窗口大小
		setBounds(x, y, w, h);     
		//设置按钮位置居中
		setLayout(new FlowLayout());  
		//设置按钮文本
		JButton an=new JButton("中国"); 
		//JFrame 不是一个容器，它只是一个框架。
		Container con ; 
		//用getContentPane()方法获得JFrame的内容面板，再对其加入组件
		con=getContentPane();      
		//设置颜色
		Color color=new Color(170, 255, 150);
		//将要设置的颜色放入容器中
	    con.setBackground(color);      
	    //设置按钮背景色
		an.setBackground(Color.yellow); 
		 //设置按钮字体颜色
        an.setForeground(Color.BLUE); 
        //将图片设置到按钮中
        Icon icon=new ImageIcon("aLightOn.png");
        //设置按钮字体
        Font font =new Font("华文行楷",Font.BOLD,50);
        an.setFont(font);                          
        an.setIcon(icon);
        add(an);            //将按钮添加到JFrame框架中
		}
	
}
public class Testwin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Win win1=new Win();	//调用无参数构造方法
  		@SuppressWarnings("unused")
		Win win2=new Win("My First Frame",100,100,288,288);//调用有参数构造方法
//		    JFrame win=new JFrame("My First Frame");   //创建JFrame类对象调用它里面的有参构造方法
//		    JButton an=new JButton("中国");             //创建一个按钮对象调用有参构造方法
//		    win.setLayout(new FlowLayout());             //通过对象调用JFrame里面的方法
//          Container con =win.getContentPane();           //创建一个容器对象用用win对象调用getContentPane()方法获得JFrame的内容面板，再对其加入组件
//          Color color=new Color(170, 255, 150);         //调用颜色类
//          con.setBackground(color);                     //容器来为win设置背景板颜色
//          win.setBounds(188, 388, 388, 388);             //设置窗口位置大小
//          win.setVisible(true);                             //设置窗口可见
//          win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭窗口结束程序
//          an.setBackground(Color.yellow);        
//          an.setForeground(Color.BLUE);
//          Icon icon=new ImageIcon("aLightOn.png");//a.gif
//          Font font =new Font("幼圆",Font.BOLD+Font.ITALIC,20);
//          an.setFont(font);  
//          an.setIcon(icon);
//          win.add(an); 
	}

}
