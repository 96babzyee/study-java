public class Goods1Main {
	public static void main(String[] args) {
		//Goods1 g1[];
		//g1 = new Goods1[5];
		Goods1 g1[] = new Goods1[5];
		
//		�߿� ! ��ü�迭(1�� ���鶧 g1[],���� g1)��
//		���ҿ� �� ��ü ���� (g1[0], g1[1],g1[2] ...)
		for(int i=0;i<g1.length;i++) {
			g1[i]=new Goods1(); // ��ü �����
		}
//		g1[0] = new Goods1(); //��ü �����
//		g1[1] = new Goods1(); //��ü �����
//		g1[2] = new Goods1(); //��ü �����
//		g1[3] = new Goods1(); //��ü �����
//		g1[4] = new Goods1(); //��ü �����

		g1[0].name = "��Ź��"; //��ü�迭�� �� ������ 1���� ��ü�� ���(name)�� �ֱ�
		g1[0].price = 150000; //��ü�迭�� �� ������ 1���� ��ü�� ���(price)�� �ֱ�
		
		g1[1].name = "�����";
		g1[1].price = 450000;
		
		g1[2].name = "���ڷ���";
		g1[2].price = 170000;
		
//		��ü�� �޼ҵ带 ���� ��� ���� ����(�� �Ҵ�)
		g1[3].setName("TV");
		g1[3].setPrice(512000);
		
		//��� ��ü ���� ���(name, price)�� ���
		for(int i=0;i<g1.length;i++) {
//			��ü(��:g1[i])�� ������� name ����
//			�׷��� ��������� ���� �����ϴ� ���� ��ü���⿡ ����
//			System.out.println("��ǰ��: "+g1[i].name);
//			System.out.println("��ǰ����: "+g1[i].price);
			System.out.print(i+1+"-");			
			//��ü�� �޼ҵ带 ���ؼ� ��������� ����
			g1[i].printAll();
			System.out.println();
		}
	}

}
