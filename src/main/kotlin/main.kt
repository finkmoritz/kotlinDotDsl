import dsl.Graph
import dsl.Node

fun main() {
    val yellow = Node("yellow")
    val orange = Node("orange")
    val graph = Graph {
        yellow `--` orange;
    }
    print(graph)
}
