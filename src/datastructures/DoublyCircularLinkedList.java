package datastructures;

public class DoublyCircularLinkedList {
	Node head = null;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			data = d;
			next = this;
			prev = this;
		}
	}

	public void append(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
		}
	}

	public void deleteNode(int key) {
		if (head == null)
			return; // 리스트가 비어있으면 반환

		Node temp = head, prev = null;
		do {
			if (temp.data == key) {
				if (temp == head && temp.next == head) {
					head = null;
				} else {
					if (temp == head) {
						head = head.next;
					}
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				return;
			}
			temp = temp.next;
		} while (temp != head); // head로 돌아올 때까지 계속
	}

	public void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();

		// 리스트에 요소 추가
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);

		System.out.println("=== 원형 리스트에 추가된 요소들 ===");
		list.printList();

		// 노드 삭제 테스트
		list.deleteNode(3); // 3을 삭제
		System.out.println("=== 노드 3 삭제 후 리스트 ===");
		list.printList();

		// head 노드 삭제 테스트
		list.deleteNode(1); // head 노드인 1을 삭제
		System.out.println("=== 노드 1 삭제 후 리스트 ===");
		list.printList();
	}
}
