package 杂;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Run extends JFrame {
public Run() {
Container container = this.getContentPane();
container.setLayout(new BorderLayout());
SinPanel sinPanel = new SinPanel();
container.add(sinPanel, BorderLayout.CENTER);
this.setTitle("Show Sin Fuction!");
this.setSize(new Dimension(400, 400));
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Dimension frameSize = this.getSize();
this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
this.setVisible(true);
}

public static void main(String[] args) {
new Run();
}
}

class SinPanel extends JPanel {
public void paintComponent(Graphics g) {
super.paintComponent(g);

Dimension panelSize = this.getSize();
Location center = new Location(panelSize.width / 2, panelSize.height / 2);
int radius = (int) ((Math.min(panelSize.width, panelSize.height) / 2) * 0.9);

// 确定每个点的坐标
int[] x = new int[2 * radius + 1];
int[] y = new int[2 * radius + 1];
for (int i = 0; i < 2 * radius + 1; i++) {
x[i] = center.x - radius + i;
double y1 = Math.sin(((double) (-radius + i) / radius) * 4 * Math.PI);// 这个很重要，sin()里面必须为double值
int y2 = (int) (y1 * 100);
y[i] = center.y - y2;
}

g.setColor(Color.black);
// 画坐标轴
g.drawLine(center.x - radius, center.y, center.x + radius, center.y);
g.drawLine(center.x, center.y - radius, center.x, center.y + radius);
g.drawLine(center.x + radius, center.y, center.x + radius - 10, center.y - 7);
g.drawLine(center.x + radius, center.y, center.x + radius - 10, center.y + 7);
g.drawLine(center.x, center.y - radius, center.x - 7, center.y - radius + 10);
g.drawLine(center.x, center.y - radius, center.x + 7, center.y - radius + 10);

g.drawPolyline(x, y, 2 * radius + 1);

g.setColor(Color.red);
g.setFont(new Font("ScanSerif", Font.BOLD, 12));
g.drawString("X", center.x + radius, center.y - 10);
g.drawString("Y", center.x + 10, center.y - radius);
}
}

class Location {
public int x;
public int y;

public Location(int x, int y) {
this.x = x;
this.y = y;
}
}