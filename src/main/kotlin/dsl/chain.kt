package dsl

open class Chain(val nodes: MutableList<Node>) {

    init {
        if(nodes.size > nodes.toSet().size) {
            throw IllegalArgumentException("Chain cannot contain duplicate Nodes!")
        }
    }

    infix fun `--`(node: Node): Chain {
        if (nodes.contains(node)) {
            throw IllegalArgumentException("Chain $this already contains Node $node!")
        }
        nodes.add(node)
        return this
    }

    override fun toString(): String {
        var ret = "";
        if(nodes.isNotEmpty()) {
            ret += nodes[0]
            for(i in 1 until nodes.size) {
                ret += " -- ${nodes[i]}"
            }
        }
        return ret
    }
}
