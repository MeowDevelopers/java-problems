package datastructures;

public class DoublyLinkedList {
	Node head;

	static class Node{
		int data;
		Node prev;
		Node next;

		Node(int d){
			data = d;
			prev = null;
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

		// last를 head로 초기화
		Node last = head;

		while (last.next != null){
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}

	// 노드 삭제
	public void deleteNode(int key){
		Node temp = head;

		// 첫번째 노드가 삭제 대상 노드가 된 경우
		if (temp != null && temp.data == key){
			head = temp.next;
			if(head != null){
				head.prev = null;
			}
			return;
		}

		// 삭제할 노드 찾기
		while (temp != null && temp.data != key) {
			temp = temp.next;
		}

		// 삭제할 노드가 리스트에 없는 경우
		if (temp == null)
			return;

		// 삭제할 노드의 next 노드의 prev를 현재 노드의 prev로 업데이트
		if (temp.next != null){
			temp.next.prev = temp.prev;
		}

		// 삭제할 노드의 prev 노드의 next를 현재 노드의 next로 업데이트
		if (temp.prev != null){
			temp.prev.next = temp.next;
		}
	}

	// 리스트 출력
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}


	// 리스트를 뒤에서 앞으로 출력
	public void printListReverse() {
		Node tnode = head;
		// 마지막 노드까지 이동
		while (tnode != null && tnode.next != null) {
			tnode = tnode.next;
		}

		// 뒤에서 앞으로 출력
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.prev;
		}
	}

	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();

		// 리스트 넣기
		list.append(1);
		list.append(2);
		list.append(3);

		System.out.println("=== 리스트 추가 후 ===");
		list.printList();
		System.out.println(); // 줄바꿈

		System.out.println("=== 리스트 역순 출력 ===");
		list.printListReverse();
		System.out.println(); // 줄바꿈

		// 리스트에서 요소 삭제
		list.deleteNode(2);

		System.out.println("=== 2 삭제 후 리스트 출력 ===");
		list.printList();
		System.out.println(); // 줄바꿈

		System.out.println("=== 리스트 역순 출력 ===");
		list.printListReverse();
	}

}
