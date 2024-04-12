package datastructures;

public class SingleLinkedList {
	// 헤드
	Node head;

	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	// 노드 추가
	public void append(int newData){
		Node newNode = new Node(newData);

		// 만약에 head가 null이면 head에 데이터 추가
		if(head == null){
			head = newNode;
			return;
		}

		// last head를 가르킴.
		Node last = head;

		while (last.next != null){
			last = last.next;
		}
		last.next = newNode;

	}

	// 노드 삭제
	public void deleteNode(int key){
		Node temp = head;
		Node prev = null;

		if (temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;       // 현재 노드를 이전 노드로 설정
			temp = temp.next;  // 다음 노드로 이동
		}
		if (temp == null)
			return;
		prev.next = temp.next;

	}

	// 리스트 출력
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}


	public static void main(String[] args){
		SingleLinkedList list = new SingleLinkedList();

		// 리스트 넣기
		list.append(1);
		list.append(2);
		list.append(3);

		System.out.println("=== 리스트 추가 ===");
		list.printList();

		System.out.println("\n=== 리스트 삭제 ===");
		list.deleteNode(2);
		list.printList();
	}
}
