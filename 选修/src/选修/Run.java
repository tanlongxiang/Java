package 选修;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
class WinJ extends JFrame{
	private static final long serialVersionUID = 1L;
	WinJ(){}
	Container contentPane = this.getContentPane();//容器
	JTable biaoge1 = new JTable();
	DefaultTableModel biaoge = new DefaultTableModel(4,9);
	//创建容器
    JPanel pane1=new JPanel();
    JPanel pane2=new JPanel();
    JPanel pane3=new JPanel();
    JPanel pane4=new JPanel();
    JPanel pane5=new JPanel();
    JPanel pane6=new JPanel();
    JPanel pane7=new JPanel();
    JPanel pane8=new JPanel();
    //标签
    Label xingxiJLabel=new Label("姓名：严淙 学号：20190865  学院：生命科学学院");
    Label canshu = new Label("输入正弦函数三要素");
    Label  fuzhi= new Label("幅值：");
    Label  jiaopinglv= new Label("角频率：");
    Label  chuxiangjiao= new Label("初相角：");
    Label  biaozhi = new Label("函数值表： ");
    //创建三个文本框
    JTextField fuzhi1=new JTextField(7);
    JTextField jiaopinglv1=new JTextField(7);
    JTextField chuxiangjiao1=new JTextField(7);
    //创建四个按钮
    JButton yes=new JButton("确定");
    JButton no=new JButton("取消");
	WinJ(String s,int x,int y,int w,int h){
		setTitle(s);
		contentPane.setLayout(new BorderLayout(100,10)); //设
		into(x,y,w,h);
		
	}
  public void into(int x,int y,int w,int h){
	  setBounds(x,y,w,h);
	  //容器添加组件
	  contentPane.setLayout(new BorderLayout(100,10));
	 
	  pane1.add(xingxiJLabel);
	  pane2.add(canshu);
	  pane3.add(fuzhi);
	  pane3.add(fuzhi1);
	  pane3.add(jiaopinglv);
	  pane3.add(jiaopinglv1);
	  pane3.add(chuxiangjiao);
	  pane3.add(chuxiangjiao1);
	  pane8.add(yes);
	  pane8.add(no);
	  pane4.setLayout(new BorderLayout());
	  pane4.add(BorderLayout.NORTH,pane1);
	  pane4.add(BorderLayout.CENTER,pane2); 
	  pane4.add(BorderLayout.SOUTH, pane3);
	  pane5.add(BorderLayout.NORTH,pane8);
	  pane5.add(BorderLayout.CENTER,pane4);
	  pane5.add(biaozhi);
	  biaoge1.setModel(biaoge);
	  biaoge1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	  biaoge.setValueAt("x", 0, 0);
	  biaoge.setValueAt("y", 1, 0);
	  biaoge.setValueAt("x", 2, 0);
	  biaoge.setValueAt("y", 3, 0);
	  pane6.add("center",biaoge1);
	  pane7.setLayout(new BorderLayout());
      pane7.add(BorderLayout.NORTH, pane5);
	  pane7.add(BorderLayout.CENTER, pane6);
	  contentPane.add(BorderLayout.NORTH,pane4);
	  contentPane.add(BorderLayout.CENTER,pane7);
	  //容器放入窗口框架
//	  setContentPane(pane1);
//	  setContentPane(BorderLayout.NORTH,pane4);
	  //setContentPane(pane7);
	  //声明监听器类调用构造方法
	//  MyActionListener listener=new MyActionListener(this);
	  //为事件源设置监听器
//	  jia.addActionListener(listener);
//	  jian.addActionListener(listener);
//	  cheng.addActionListener(listener);
//	  chu.addActionListener(listener);
  }
  }




public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinJ winj=new WinJ("正弦函数列表绘图",100,100,800,800);
		winj.setVisible(true);
		winj.setLocationRelativeTo(null);
		winj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
