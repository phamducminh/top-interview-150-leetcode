/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {

    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null

        // Creating a new weaved list of original and copied nodes.
        var ptr: Node? = node
        while (ptr != null) {
            // Cloned node
            val newNode = Node(ptr.`val`)

            // Inserting the cloned node just next to the original node.
            // If A->B->C is the original linked list,
            // Linked list after weaving cloned nodes would be
            // A->A'->B->B'->C->C'
            newNode.next = ptr.next
            ptr.next = newNode
            ptr = newNode.next
        }

        ptr = node

        // Now link the random pointers of the new nodes created.
        // Iterate the newly created list and use the original
        // nodes' random pointers, to assign references to random
        // pointers for cloned nodes.
        while (ptr != null) {
            ptr.next!!.random = ptr.random?.next
            ptr = ptr.next?.next
        }

        // Unweave the linked list to get back the original linked list
        // and the cloned list.
        // i.e. A->A'->B->B'->C->C' would be broken to A->B->C and A'->B'->C'.
        var ptrOldList = node // A->B->C
        var ptrNewList = node.next // A'->B'->C'
        val headNew = node.next
        while (ptrOldList != null) {
            ptrOldList.next = ptrOldList.next?.next
            ptrNewList!!.next = ptrNewList.next?.next

            ptrOldList = ptrOldList.next
            ptrNewList = ptrNewList!!.next
        }

        return headNew
    }
}