package dsl

class Node(val title: String) {

    infix fun `--`(otherNode: Node): Chain = Chain(mutableListOf(this, otherNode))

    override fun toString(): String {
        return "(${title})"
    }
}
