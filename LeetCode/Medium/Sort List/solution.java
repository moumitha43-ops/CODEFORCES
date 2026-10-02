class Solution {
    public ListNode sortList(ListNode head) {
        
        int e = 0;
        int c = 0;
        ListNode temp = head;
        while(temp!=null ){
            c++;
            temp = temp.next;
        }
        int[] a = new int[c];
        temp = head;
        while(temp!=null ){
            a[e++]=temp.val;
            temp = temp.next;
        }
        temp = head;
        e = 0;
        Arrays.sort(a);
        
        while(temp!=null ){
            temp.val = a[e++];
            temp = temp.next;
        }
        return head;
    }
}