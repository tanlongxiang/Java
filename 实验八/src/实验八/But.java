package 实验八;
import javax.swing.*;
import java.awt.event.*;
  class An extends JFrame {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		An(){} 
	    //创建标签
	    JLabel jla=new JLabel();
	    //创建容器
    	JPanel pane =new JPanel();
        //做出两个按钮
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
        //将容器加入框架
    	setContentPane(pane);
    	//将按钮组件放入容器
    	pane.add(an3);
    	pane.add(an4);	
    	pane.add(jla);
    	//创建监听器类对象
    	MyActionListener listener=new MyActionListener(this);
    	//为事件源设置监听器
    	an3.addActionListener(listener);
    	an4.addActionListener(listener);
    }
    }
  //创建一个监听器类实现ActionListener接口。
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
              System.out.println("点击了确定按钮");
             //事件处理
             anniu.jla.setText("     点击了确定按钮      ");
		}
		else {
			 System.out.println("点击了取消按钮");
			 anniu.jla.setText("     点击了取消按钮      ");
		}
	 }
 }
public class But {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           @SuppressWarnings("unused")
		An an1=new An();
           @SuppressWarnings("unused")
		An an2=new An("按钮事件演示",50,50,10,100);
	}

}
