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
    // HashMap which holds old nodes as keys
    // and new nodes as its values.
    val visitedHash = hashMapOf<Node, Node>()

    fun copyRandomList(node: Node?): Node? {
        if (node == null) {
            return null
        }

        // If we have already processed the current node,
        // then we simply return the cloned version of it.
        if (visitedHash.containsKey(node)) {
            return visitedHash[node]
        }

        // Create a new node with the value same as old node.
        val newNode = Node(node.`val`)

        // Save this value in the hash map. This is needed since
        // there might be loops during traversal due to randomness
        // of random pointers and this would help us avoid them.
        visitedHash[node] = newNode

        // Recursively copy the remaining linked list starting once 
        // from the next pointer and then from the random pointer.
        // Thus we have two independent recursive calls. Finally we 
        // update the next and random pointers for the new node created.
        newNode.next = copyRandomList(node.next)
        newNode.random = copyRandomList(node.random)

        return newNode
    }
}