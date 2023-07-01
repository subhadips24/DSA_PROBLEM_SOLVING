package linkedList;

public class MianLL {
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst(18);
		list.addFirst(14);
		list.addFirst(13);
		list.addFirst(12);
		list.addToLast(2838439);
		list.addInPosition(250040076, 8);
		System.out.println(list.getSize());
		list.display();
	}

}
