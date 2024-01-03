//
//
//
//class Node{
//    public Integer data;
//    public Node nextAddress;
//}
//
//class SinglyLLImp{
//    private Node head;
//
//    SinglyLLImp(){
//        this.head = null;
//    }
//    public void insertFirst(Integer data){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.nextAddress = null;
//
//        if(head == null){
//            head = newNode;
//        }else {
//            newNode.nextAddress = head;
//            head = newNode;
//        }
//    }
//
//    public void insertLast(Integer data){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.nextAddress = null;
//
//        if (head == null){
//         head = newNode;
//        }else {
//            Node temp = head;
//            while (temp.nextAddress != null){
//                temp = temp.nextAddress;
//            }
//            temp.nextAddress = newNode;
//
//        }
//    }
//
//    public void insertAtPos(Integer data , Integer pos ){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.nextAddress = null;
//
//        Integer count = this.count();
//
//        if(pos <= 0 || pos > count+1){
//            System.out.println("invalid position ");
//        }
//        else if (pos == 1){
//            this.insertFirst(data);
//        }else if (pos == count+1){
//            this.insertLast(data);
//            System.out.println("linke no 59");
//        }else {
//            Node temp = head;
//            for (int i = 1; i<pos-1;i++){
//                temp = temp.nextAddress;
//            }
//            newNode.nextAddress = temp.nextAddress;
//            temp.nextAddress = newNode;
//        }
//
//    }
//    public void display(){
//        System.out.println("linkedlist : ");
//        Node temp = head;
//        while (temp != null){
//            System.out.print("| "+temp.data+" |->");
//            temp = temp.nextAddress;
//        }
//        System.out.println("NULL");
//
//    }
//    public void deleteFirst(){
//        if(head == null){
//            return;
//        }else {
//            head = head.nextAddress;
//        }
//    }
//    public void deleteLast(){
//        if(head == null){
//            return;
//        }else if (head.nextAddress == null){
//            this.deleteFirst();
//        }
//        else {
//            Node temp = head;
//            while (temp.nextAddress.nextAddress != null){
//                temp=temp.nextAddress;
//            }
//            temp.nextAddress = null;
//
//        }
//    }
//    public Integer count(){
//        Integer counter = 0;
//        Node temp = head;
//        while (temp != null){
//            counter++;
//            temp = temp.nextAddress;
//        }
//        return counter;
//    }
//}
//
//
//public class SinglyLinkedList {
//    public static void main(String[] args) {
//    SinglyLLImp singlyLLImp = new SinglyLLImp();
//    singlyLLImp.insertFirst(10);
//    singlyLLImp.display();
//        singlyLLImp.insertFirst(20);
//        singlyLLImp.display();
//        singlyLLImp.insertFirst(30);
//        singlyLLImp.display();
//        Integer count1 = singlyLLImp.count();
//        System.out.println("size of linkedlsit : "+ count1);
//
//
//        System.out.println("insertLast");
//        singlyLLImp.insertLast(100);
//        singlyLLImp.display();
//        singlyLLImp.insertLast(220);
//        singlyLLImp.display();
//        singlyLLImp.insertLast(320);
//        singlyLLImp.display();
//
//        Integer count = singlyLLImp.count();
//        System.out.println("size of linkedlsit : "+ count);
//
//
//        System.out.println("******************************************************************");
//        singlyLLImp.insertAtPos(600 , 8);
//        singlyLLImp.insertAtPos(600 , -1);
//
//        singlyLLImp.insertAtPos(600 , 0);
//
//        singlyLLImp.insertAtPos(1000 , 1);
//        singlyLLImp.display();
//
//        singlyLLImp.insertAtPos(2000 , 7);
//        singlyLLImp.display();
//        Integer count2 = singlyLLImp.count();
//        System.out.println("size of linkedlsit : "+ count2);
//
//
//        singlyLLImp.insertAtPos(666000 , 3);
//        singlyLLImp.display();
//        System.out.println("******************************************************************");
//
//        singlyLLImp.deleteFirst();
//        singlyLLImp.display();
//
//        singlyLLImp.deleteLast();
//        singlyLLImp.display();
//
//    }
//}