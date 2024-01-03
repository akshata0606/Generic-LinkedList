class Node{
    public Integer data;
    public Node next;
}
class SinglyCircularImp {
    private Node head;
    private Node tail;

    public SinglyCircularImp() {
        this.head = null;
        this.tail = null;
    }

    public void InsertFirst(Integer data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            head= newNode;
            tail.next = head;
        }

    }

    public void InsertLast(Integer data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null && tail == null) {
            this.InsertFirst(data);
        } else {
            tail.next = newNode;
            newNode.next = head;
        }
    }
    public void DeleteFirst() {
        if (head == null && tail == null){
            return;
        }else if (head.next == head){
            head = null;
            tail =null;
        }else {
            head = head.next;
            tail.next = head;
        }

    }
        public void DeleteLast(){

            System.out.println("Akshata");
            if (head == null && tail == null){
                return;
            }else if(head.next == head){
                this.DeleteFirst();
            }else {
                Node temp = head;
                while (temp.next != tail){
                    temp = temp.next;
                }
                temp.next = head;
                tail = temp;

            }

        }
    public void InsertAtPos(Integer data,Integer pos){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Integer count = count();
        if(pos == 0 || pos > count+1){
            System.out.println("!! invalid position !!");
            return;
        }else if (pos == 1){
            this.InsertFirst(data);
        } else if (count+1 == pos) {
            this.InsertLast(data);
        }else {
            Node temp = head;
            for (int i = 1; i < pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }
    public void DeleteAtPos(Integer pos){

        Integer count = count();
        if(pos == 0 || pos > count+1){
            System.out.println("!! invalid position !!");
            return;
        }else if (pos == 1){
            this.DeleteFirst();
        } else if (count == pos) {
            this.DeleteLast();
        }else {
            Node temp = head;
            for (int i = 1; i < pos-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }
    public Integer count(){
        Integer counter = 0;
        Node temp = head;
        if (head == null && tail == null){

            return counter;
        }
        do{
            counter++;
            temp = temp.next;
        }while (temp != tail.next);
        return counter;
    }
    public void Display() {
        Node temp = head;
        if (head == null && tail == null){
            System.out.println("your linkedlist is empty!!");
            return;
        }
        do{
            System.out.print("| "+temp.data+" | =>");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("END");
    }

}
public class SinglyCircularLL {
    public static void main(String[] args) {
        SinglyCircularImp singlyCircularImp = new SinglyCircularImp();

        singlyCircularImp.InsertFirst(10);
        singlyCircularImp.InsertFirst(20);
        singlyCircularImp.InsertFirst(30);
        singlyCircularImp.InsertFirst(40);
        singlyCircularImp.InsertFirst(50);
        singlyCircularImp.Display();
        singlyCircularImp.DeleteFirst();
        singlyCircularImp.Display();
        System.out.println("count of linkedlist :: "+singlyCircularImp.count());
        singlyCircularImp.DeleteLast();
        singlyCircularImp.Display();

        singlyCircularImp.DeleteLast();
        singlyCircularImp.Display();

        System.out.println("count of linkedlist :: "+singlyCircularImp.count());
        singlyCircularImp.InsertAtPos(1,0);

        singlyCircularImp.InsertAtPos(1,5);

        singlyCircularImp.InsertAtPos(1,1);

        singlyCircularImp.Display();
        System.out.println("*****");

        singlyCircularImp.InsertAtPos(2,1);
        singlyCircularImp.Display();

        singlyCircularImp.InsertAtPos(100,3);
        singlyCircularImp.Display();

        singlyCircularImp.InsertAtPos(200,3);
        singlyCircularImp.Display();

        System.out.println("******** for delete at pos");
        singlyCircularImp.DeleteAtPos(0);
        singlyCircularImp.DeleteAtPos(10);
        singlyCircularImp.DeleteAtPos(3);
        singlyCircularImp.Display();
        singlyCircularImp.DeleteAtPos(3);
        singlyCircularImp.Display();
        singlyCircularImp.DeleteAtPos(1);
        singlyCircularImp.Display();

        singlyCircularImp.DeleteAtPos(1);
        singlyCircularImp.Display();

}
}
