package a16_�⺻Ŭ����;

// �⺻Ŭ������ JRE ���̺귯������ �����ϴ� Ŭ������

public class ObjectEx{
	
	@Override
	public String toString() {
		return "�ȳ��ϼ���. toString�Դϴ�.";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public static void main(String[] args) {
		ObjectEx objEx = new ObjectEx();
		String str = new String();
		System.out.println(str);
		System.out.println(objEx);
		System.out.println(objEx.hashCode());
		System.out.println(objEx.equals(objEx));
	}
}
