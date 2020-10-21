package dsl

open class Chain(val nodes: MutableList<Node>) {

    var style = Style.DOTTED

    init {
        if(nodes.size > nodes.distinct().size) {
            throw IllegalArgumentException("Chain cannot contain duplicate Nodes!")
        }
    }

    operator fun rangeTo(node: Node): Chain {
        if (nodes.contains(node)) {
            throw IllegalArgumentException("Chain $this already contains Node $node!")
        }
        nodes.add(node)
        return this
    }

    operator fun get(style: Style): Chain {
        this.style = style
        return this
    }

    override fun toString(): String {
        var ret = "";
        if(nodes.isNotEmpty()) {
            ret += nodes[0]
            for(i in 1 until nodes.size) {
                ret += " $style ${nodes[i]}"
            }
        }
        return ret
    }
}
