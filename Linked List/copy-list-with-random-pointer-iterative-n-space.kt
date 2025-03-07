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
    val visitedHash = hashMapOf<Node?, Node?>()

    fun getClonedNode(node: Node?): Node? {
        if (node == null) return null

        if (!visitedHash.containsKey(node)) {
            visitedHash[node] = Node(node.`val`)
        }
        return visitedHash[node]
    }

    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null

        var oldNode: Node? = node
        var newNode: Node? = Node(oldNode!!.`val`)
        visitedHash[oldNode] = newNode

        while (oldNode != null) {
            newNode!!.random = getClonedNode(oldNode.random)
            newNode!!.next = getClonedNode(oldNode.next)

            oldNode = oldNode?.next
            newNode = newNode?.next
        }

        return visitedHash[node]
    }
}