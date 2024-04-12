package datastructures;

public class CircularLinkedList {
	Node head = null;
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public void append(int newData){
		Node newNode = new Node(newData);

		// 만약에 head가 null이면 head에 데이터 추가
		if(head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head){
				temp = temp.next;
			}
			temp.next = newNode; // 마지막 노드의 next를 새 노드로 설정
			newNode.next = head; // 새 노드의 next를 head로 설정하여 원을 완성
		}
	}

	// 노드 삭제
	public void deleteNode(int key) {
		if (head == null) return;
		if (head.data == key && head.next == head) {
			head = null;
			return;
		}

		Node curr = head, prev = null;
		do {
			if (curr.data == key) {
				if (prev != null) {
					prev.next = curr.next;
				}
				if (curr == head) {
					head = curr.next;
				}
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
	}


	// 리스트 출력
	public void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			System.out.println(); // 줄 바꿈
		}
	}
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

		// 리스트에 요소 추가
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);

		System.out.println("=== 추가 후 리스트 ===");
		list.printList();

		// 리스트에서 요소 삭제
		list.deleteNode(3);

		System.out.println("=== 3 삭제 후 리스트 ===");
		list.printList();

		// 다시 추가
		list.append(5);
		System.out.println("=== 5 추가 후 리스트 ===");
		list.printList();

	}

}
