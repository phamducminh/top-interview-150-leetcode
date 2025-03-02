/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) return null
        
        var n1 = list1
        var n2 = list2
        var head: ListNode = ListNode(0)
        var cur = head
        
        while (n1 != null && n2 != null) {
            if (n1.`val` <= n2.`val`) {
                cur.next = ListNode(n1.`val`)
                n1 = n1.next
            } else {
                cur.next = ListNode(n2.`val`)
                n2 = n2.next
            }
            
            cur = cur.next
        }
        
        if (n1 != null) {
            cur.next = n1
        }
        
        if (n2 != null) {
            cur.next = n2
        }
        
        return head.next
    }
}