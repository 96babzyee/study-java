public class Goods1 { //Ŭ���� => ��ü�� Ŭ������ ����� ���� ��
	// 3��� 
	// 1. �������
	// 2. ������
	// 3. ����޼ҵ�
	String name;
	int    price;
	
	Goods1() {
		name = "��ǰ�����";
		price = 0;
	}
	
	void setName(String name) {
		this.name = name;
	}
		
	void setPrice(int price) {
		this.price = price;
	}
	

	void printAll() {
		System.out.println("��ǰ��: "+name); //this ��������
//		System.out.println("��ǰ��: "+this.name);
		System.out.println("��ǰ����: "+price); //this ��������
//		System.out.println("��ǰ����: "+this.price);
	}
	
}
