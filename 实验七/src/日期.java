import java.time.LocalDate;//�������ڰ�
import java.time.LocalTime;//����ʱ���

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate dateOne=LocalDate.now();           //��������ʱ�����������ȡ����ʱ��
      System.out.println("��������"+dateOne);
      LocalDate dateTwo=LocalDate.of(2021,8,16); //����һ���Զ���ʱ�����
      System.out.println("�Զ�������"+dateTwo);
      System.out.println(dateOne+"��"+dateTwo+"֮��"+dateOne.isAfter(dateTwo));//�������ڱȽ��Ƿ���֮��
      System.out.println(dateOne+"��"+dateTwo+"֮ǰ��"+dateOne.isBefore(dateTwo));//�Ƿ���֮ǰ
      System.out.println(dateOne+"��"+dateTwo+"��ͬ��"+dateOne.isEqual(dateTwo));//�Ƿ����
      int year=18;
      LocalDate datelater=dateOne.plusYears(-year);     //�������ӷ���
      System.out.println(dateOne+" "+year+"��ǰ�ǣ�\n"+datelater);
      System.out.println("��"+datelater.getDayOfWeek());  //��ȡ���ڷ���
      int second=897;
      LocalTime time=LocalTime.now();   //��ȡ����ʱ��
      System.out.println(time+"�ٹ�"+second+"���ǣ�"+time.plusSeconds(second));
	}
}








//import java.util.Calendar;
//import javax.swing.JOptionPane;
// String str=JOptionPane.showInputDialog("�������һ�����");
//       int yearOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("���������·�");
//       int monthOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("��������·ݵ�����");
//       int dayOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("������ڶ������");
//       int yearTwo=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("�����������·�");
//       int monthTwo=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("��������·ݵ�����");
//       int dayTwo=Integer.parseInt(str);
//       Calendar cal=Calendar.getInstance();
//       cal.set(yearOne, monthOne, dayOne);
//       long timeOne=cal.getTimeInMillis();