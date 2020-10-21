package dsl

class Node(val title: String) {

    operator fun minus(otherNode: Node): Chain = Chain(mutableListOf(this, otherNode))

    override fun toString(): String {
        return "(${title})"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Node) {
            return title == other.title
        }
        return false
    }
}
