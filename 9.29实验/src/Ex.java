
public class Ex {

	public static void main(String[] args) {
		XiyoujiRenwu zhubajie = null,sunwukong = null;
		zhubajie=new XiyoujiRenwu();
		sunwukong=new XiyoujiRenwu();
		zhubajie.name=PersonName.�˽�;
		zhubajie.height=1.83f;
		zhubajie.weight=86f;
		zhubajie.head="��ͷ";
		sunwukong.name=PersonName.���;
		sunwukong.height=1.66f;
		sunwukong.weight=1000f;
		sunwukong.head="��ͷ";
		System.out.println(zhubajie.name+"����ߣ�"+zhubajie.height);
		System.out.println(zhubajie.name+"�����أ�"+zhubajie.weight);
		System.out.println(zhubajie.name+"��ͷ��"+zhubajie.head);
		System.out.println(sunwukong.name+"����ߣ�"+sunwukong.height);
		System.out.println(sunwukong.name+"�����أ�"+sunwukong.weight);
		System.out.println(sunwukong.name+"��ͷ��"+sunwukong.head);
		zhubajie.speak(zhubajie.name+"����Ȣϱ��");
        sunwukong.speak(sunwukong.name+"����"+
		                 sunwukong.name+"�����ƭ�˽䱳��");
        System.out.println(sunwukong.name+"���ڵ�ͷ��"+sunwukong.head);  
	}

}
