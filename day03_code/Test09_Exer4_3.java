/*
4����Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
���������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
��ʾ���Ӽ�������
Scanner input=new Scanner(System.in);
input.nextInt();//���մӼ��������һ������
input.next();����һ���ַ���
input.nextDouble();//����һ��С��
input.nextBoolean();//����һ������ֵ
*/
class Test09_Exer4_3{
	public static void main(String[] args){
		//1�������з�������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���������ߣ���λ��cm����");
		int height = input.nextInt();
		
		System.out.print("������Ƹ�����λ��ǧ�򣩣�");
		double money  = input.nextDouble();
		
		System.out.print("�������Ƿ�˧��˧/��˧����");
		String handsom = input.next();
		
		//2���ж�
		/*
		�ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
		�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
		���������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
		������������������㣬�򣺡����ޣ���
		handsom=="˧" �ǲ��Ե�
		"˧".equals(handsom) �ǿ��Եģ�String����ıȽ�
		*/
		if(height>=180 && money>=1 && "˧".equals(handsom)){	
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height>=180 || money>=1 || "˧".equals(handsom)){
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("���ޣ�");
		}
	}
}