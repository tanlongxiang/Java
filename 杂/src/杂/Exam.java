package 杂;
import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Exam extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L; //属性
	JTextField tfParama = new JTextField(5);
	JTextField tfParamb = new JTextField(5);
	JTextField tfParamc = new JTextField(5);
	boolean firstDigit = true;//用于判断是否是数字
	JTable tblfunction = new JTable();
	DefaultTableModel dtm = new DefaultTableModel(4,9);

	double a= 0.0;
	double b= 0.0;
	double c= 0.0;
	double dScale = 0.0;
	int ix[]= new int [18];
	int iy[]=new int [18];
	
	
	public Exam() //构造函数
	{
		setTitle("正弦函数列表绘图");
		setSize(1000, 1000);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();//容器
		contentPane.setLayout(new BorderLayout(100,10)); //设置组件水平和垂直间隔。
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		Label lblInputb = new Label("角频率：");
		Label lblInputa = new Label("幅值：");
		Label lblInputc = new Label("初相角：");
		JButton btnOk = new JButton("确定");

		JButton btnCancel = new JButton("取消");
		
	    JLabel xingxiJLabel=new JLabel("<html> <p align=\"center\">姓名:张佳美 学号: 学院:资源工程学院 <br>输入正弦函数三要素</html>");

			
		  p1.setLayout(new BorderLayout());
		  p1.add(BorderLayout.NORTH,xingxiJLabel);
		// p1.add(BorderLayout.CENTER,lblInputParam);
		 p1.setLayout(new FlowLayout()); 
		p2.add(lblInputa);
		p2.add(tfParama);	
		p2.add(lblInputb);
		p2.add(tfParamb);
		p2.add(lblInputc);
		p2.add(tfParamc);
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		p3.add(btnOk);
		p3.add(btnCancel);		
		p4.setLayout(new BorderLayout());
		p4.add(BorderLayout.NORTH, p1);
		p4.add(BorderLayout.CENTER, p2);
		p4.add(BorderLayout.SOUTH, p3);
		Label lblFunVal = new Label("函数值表： ");	
		p5.add(lblFunVal);
		
		tblfunction.setModel(dtm);		
		tblfunction.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); //不可随容器组件大小变化自动调整宽度. 
		dtm.setValueAt("x", 0, 0);
		dtm.setValueAt("y", 1, 0);
		dtm.setValueAt("x", 2, 0);
		dtm.setValueAt("y", 3, 0);
		p6.add("Center", tblfunction);	
		p7.setLayout(new BorderLayout());
		p7.add(BorderLayout.NORTH, p5);
		p7.add(BorderLayout.CENTER, p6);
		
		contentPane.add(BorderLayout.NORTH, p4);
		contentPane.add(BorderLayout.CENTER, p7);
	}	


	public void setTable()
	{
		double x = 0.0;
		double y = 0.0;
		for(int i=0;i<8;i++)
		{
			x = c + b * 22.5/3 * i ;
            y = a * Math.sin(x*3.14/180);
            ix[i] = (int) ((int) x*3.14/180*100);
            iy[i] = (int) (y*100+600);
			dtm.setValueAt(String.valueOf(x), 0, 1+i);
			dtm.setValueAt(String.valueOf(y), 1, 1+i);           
			dtm.setValueAt(String.valueOf(x), 2, 1+i);
			dtm.setValueAt(String.valueOf(y), 3, 1+i);
			
			}
		}
	
	public void paint(Graphics g)
	{			
	
		super.paint(g);
		double x;
		double y;
		g.drawString("函数图形:",465,280);
		g.drawRect(100,300,800,600);

		if(ix[0]!=0){
            for(int i=0;i<18;i++)
            {
                x = c + b * 22.5/3 * i ;
                y = a * Math.sin(x*3.14/180);
                ix[i] = (int) ((int) x*3.14/180*100);
                iy[i] = (int) (y*10+600);
            }
            for(int i=1;i< 18;i++){
                g.drawLine(ix[i-1], iy[i-1],ix[i],iy[i]);
                System.out.println(ix[i-1]+"  "+ iy[i-1]);
            }
        }

		
	}
	
	@Override
	public void actionPerformed(ActionEvent  event) {
		// TODO Auto-generated method stub
		String label = event.getActionCommand();
		
		if (label.equals("确定") )
		{
			a = Double.parseDouble(tfParama.getText());
			b = Double.parseDouble(tfParamb.getText());
			c = Double.parseDouble(tfParamc.getText());	
		
			setTable();
			repaint();
		} 
		else if (label.equals("取消")) 
		{
			for(int i=0;i<8;i++)
            {
                ix[i] = 0;
                iy[i] = 0;
            }
            repaint();	
		} 
	}
	
	public static void main(String[] args) 
	{
		JFrame frame = new Exam();	
		frame.setVisible(true);
		frame.setResizable(true);
	}	
	
}
