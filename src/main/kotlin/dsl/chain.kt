package dsl

open class Chain(var nodes: MutableList<Node>) {

    infix fun `--`(node: Node): Chain {
        nodes.add(node)
        return this
    }

    infix fun `--`(otherChain: Chain): Chain {
        nodes.addAll(otherChain.nodes)
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
