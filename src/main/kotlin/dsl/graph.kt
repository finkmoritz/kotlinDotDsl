package dsl

class Graph(val builder: () -> Edge) {

    override fun toString(): String {
        val edge = this.builder()
        return "${edge.firstNode} -- ${edge.secondNode}"
    }
}
