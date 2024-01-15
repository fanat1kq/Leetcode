public class ListNodeq {
      public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) { this.val = val; }

          @Override
          public String toString() {
              return "ListNode{" +
                      "val=" + val +
                      '}';
          }
      }
    public static ListNode reverseList(ListNode head) {
        ListNode previosNode=null;
        ListNode currentNode=head;
        while(currentNode!=null){
            ListNode nextNode=currentNode.next;
            currentNode.next=previosNode;
            previosNode=currentNode;
            currentNode=nextNode;

        }
        return previosNode;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
//        ListNode a=new ListNode(4);
//        ListNode a=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=null;
        System.out.println(reverseList(a));

    }
}

