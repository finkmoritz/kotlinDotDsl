import dsl.Graph
import dsl.Node

fun main() {
    val yellow = Node("yellow")
    val orange = Node("orange")
    val red = Node("red")
    val blue = Node("blue")

    val graph = Graph (
        yellow `--` orange `--` red,
        orange `--` blue,
    )
    print(graph)
}
