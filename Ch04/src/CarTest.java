
public class CarTest {
	public static void main(String[] args) {
		//1.Ŭ���� �����
		//2.Ŭ���� ����ϱ�(3�� ����)
		//3.��ü ����� (2�� ����)
		//4.��ü ��� (���� �߿�~!)

		
		Car c1;
		//c1�� ������� ��. �̻�, ��ü����, ���۷���
		//�ڷ��� ����, Ŭ���� ��ü
		c1 = new Car();
		// �ϻ�
		//Car() <- ������, ������ ���
		//new Car() = > ��ü
		
		Car c2 = new Car("����");
		
		System.out.println("1------------");
		c1.printCar();
		System.out.println("2------------");
		c2.printCar();
		System.out.println("3------------");
		c1.printCar("������");
		
		System.out.println("4------------");
		Car c3 = new Car("Van", "�̽�Ÿ��", 170, 10);
		c3.printCar();
	}
}
