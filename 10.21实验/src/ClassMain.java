class GrandFather{
	 private String name;   //����˽�б���
	 private int age ;
	GrandFather(String name ,int age){  //����ŷ���������Ҫ����������ͬ
		this.name=name;//setName(name);   //��������ùؼ�������ȫ�ֱ�����ֵ��Ҳ������������set������
		this.age=age;//setAge(age);            ���������set������ȫ�ֱ�����ֵ
	}
	//public void setName(String name){   //�������set����������Щ
	//	this.name=name;
	//}
	//public void setAge(int age){
	//	this.age=age;
//	}
	public String getName() {            //��������get����
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void getGrangFather() {        //������ʾүү��Ϣ�ķ�������������������get������
		System.out.println("үү��������"+getName()+"  "+"���䣺"+getAge());//����ѡ���ӡ���Ҳ����return�������ַ������
	}
}
class Father extends GrandFather{     //��������̳и���
	  private String occupation;       //�����µ�����
	Father(String name,int age,String occupation){  //���췽��
		super(name,age);     //����Ҫ�õ�����Ĺ��췽���������췽�����ܱ��̳У�����ͨ���ؼ��ֽ��е���
		this.occupation=occupation;//setOccupation(occupation);  //����ְҵ���и�ֵͬ����ͬ�����������ַ���
	}
    public String getOccupation() {  
    	return this.occupation;
    }
    public void getFather() {     //��ʾ���׵���Ϣ
    	System.out.println("���׵�������"+getName()+"  ���䣺"
           +getAge()+"  "+"ְҵ��"+getOccupation());
    }
}
public class ClassMain {
      
	public static void main(String[] args) {  
		GrandFather GF=new GrandFather("wuzongyao",78); //�����������ڸ��෽�����ô���Ĺ��췽��
		Father F=new Father("wushengguang",48,"����");//������������������ù��췽��
        GF.getGrangFather();       //�����������
        F.getFather();
	}

}
