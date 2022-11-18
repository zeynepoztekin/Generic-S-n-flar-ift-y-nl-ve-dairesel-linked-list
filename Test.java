public class Test{
	public static void main(String[] args){
		MyDoublyCircularLinkedList<Integer> mylist = new MyDoublyCircularLinkedList<Integer>();
		mylist.insert(1, 1); //1
		mylist.insert(2, 2); //1 2
		mylist.insert(3, 3); //1 2 3
		mylist.insert(4, 4); //1 2 3 4
		mylist.reverseInsert(1, 5); //1 2 3 4 5
		mylist.reverseInsert(1, 6); //1 2 3 4 5 6

		//test 1 - 30 puan
		System.out.println("-------------------");
		mylist.printAll(); //1 2 3 4 5 6
		System.out.println("-------------------");

		//test 2 - 35 puan
		mylist.remove(1); //2 3 4 5 6
		mylist.reverseRemove(2); //2 3 4 6
		mylist.insert(1, 999); //999 2 3 4 6
		System.out.println("*********************");
		mylist.reversePrintAll(); //6 4 3 2 999
		mylist.search(4); //4
		mylist.print(2); //2
		System.out.println("*********************");

		//test 3 - 35 puan
		System.out.println("+++++++++++++");
		mylist.remove(7); //remove failed
		mylist.remove(1); //2 3 4 6
		mylist.insert(9, 9); //insert failed
		mylist.reverseRemove(-1); //reverseRemove failed
		mylist.search(5); //search failed
		mylist.print(5); //print failed
		System.out.println("+++++++++++++");
	}
}
