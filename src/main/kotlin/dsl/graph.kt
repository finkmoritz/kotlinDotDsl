package dsl

class Graph(vararg chains: Chain) {

    private val chains = mutableListOf<Chain>()

    init {
        this.chains.addAll(chains)
    }

    override fun toString(): String {
        var ret = ""
        for (chain in chains) {
            ret += "$chain\n"
        }
        return ret
    }
}
