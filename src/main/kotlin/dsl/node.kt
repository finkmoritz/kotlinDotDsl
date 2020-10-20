package dsl

class Node(val title: String) {

    infix fun `--`(otherNode: Node): Edge = Edge(this, otherNode)

    override fun toString(): String {
        return "(${title})"
    }
}
