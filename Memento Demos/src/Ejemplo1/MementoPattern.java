package Ejemplo1;
public class MementoPattern {
	public static void main(String args[]){
		RegularClass regularClass = new RegularClass();
		regularClass.setData("First Report");
		System.out.println(regularClass.data);
		regularClass.makeBackup();
		regularClass.setData("Second Report");
		System.out.println(regularClass.data);
		regularClass.makeBackup();
		regularClass.recoverBackup();
		System.out.println(regularClass.data);
	}
	
}
