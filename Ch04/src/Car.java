public class Car {
	//����, ������, �޼ҵ�
	//Ŭ������ ����� ������� 3����
	//1.(���)����(==�ʵ�)
	//2.������(�޼ҵ�==�Լ�) 
	//3.(���)�޼ҵ� (==�Ϲ� �޼ҵ�, �Ϲ� �Լ�)
	
	//1.�������
	//String type = "SUV"; => Ŭ������ ���� ������X
	String type;
	String name;
	int maxSpeed; //�ְ�ӵ�
	int curSpeed; //����ӵ�
	
	//2.������ �޼ҵ�
	//������ Ư¡=> 1.Ŭ������� ����  2.��ȯ��X(ǥ�õ� X)
	//�������� Ư¡ => 1.�������  �ʱ�ȭ (�⺻��)
	//���� �����ڸ� �ȸ���� �����Ǿ� ����(�Ʒ�ó��) => ����Ʈ ������
//	Car() {
//		
//	}
	Car(){ //������� ���� �ʱ�ȭ, ������ �����
		type = "SUV"; //��ü�� ���� ����
		name = "��Ÿ��";
		maxSpeed = 200;
		curSpeed = 0;
	}
	
	Car(String name)//�޼ҵ�� ����� "�̸��ߺ���"
	{
		this();// Car() ����� �ҷ����°�(ȣ��)
		this.name = name;
//		type = "sport";//��ü�� ���� ������ �ȴ�~!
//		this.name = name;
//		maxSpeed = 300;
//		curSpeed = 0;
	}
	
	Car(String type, String name, int maxSpeed, int curSpeed) {
		this.type = type;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.curSpeed = curSpeed;
	}
	
	//3.�޼ҵ� �����
	void printCar(){
		System.out.println(type);
		System.out.println(name);
		System.out.println(maxSpeed);
		System.out.println(curSpeed);
	}
	
	void printCar(String type) {
		System.out.println(type);
	}
	
}
