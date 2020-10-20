import dsl.Graph
import dsl.Node

fun main() {
    var yellow = Node("yellow")
    val orange = Node("orange")
    val graph = Graph {
            yellow `--` orange;
    }
    print(graph)
}
