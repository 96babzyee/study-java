
public class HumanMain {
	
	Human aHuman2;

	public static void main(String[] args) 
	{
		Human aHuman;//���۷��� ������?? �̻�
		aHuman = new Human("ȫ�浿");
//		aHuman.age = 21;
//		aHuman.height = 180.5;
//		aHuman.weight = 73.2;
		//HumanMainŬ�������� HumanŬ������ ������ ���� ���� �ϸ� �ȵ�!
		//�޼ҵ�� �����ؾ� �Ѵ�. ĸ��ȭ, ����ȭ
		
		aHuman.setAge(21);
//		aHuman.printAge();
		
		//���⼭ age�� ��������� �ƴ϶� main()�޼ҵ��� ��������!!
		int age = aHuman.getAge();
//		System.out.println("���̴�=" + aHuman.age);
		System.out.println("HuamnMain 1: ���̴�=" + age );
		System.out.println("HuamnMain 2: ���̴�=" + aHuman.getAge() );
		
//		System.out.println("�̸���=" + aHuman.name);
//		System.out.println("�����Դ�=" + aHuman.weight);
		
		
		Human h1[] = new Human[5];
		
		for(int i=0; i< h1.length; ++i)
		{
			h1[i] = new Human("ȫ�浿");
			h1[i].setScanner();
		}
		
		for(int i=0; i< h1.length; ++i)
		{
			h1[i].printAll();
		}
				

	}

}
