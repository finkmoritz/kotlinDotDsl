package dsl

class Graph(val builder: () -> Chain) {

    override fun toString(): String {
        val chain = this.builder()
        return "$chain"
    }
}
