import dsl.Graph
import dsl.Node

fun main() {
    val yellow = Node("yellow")
    val green = Node("green")
    val red = Node("red")
    val blue = Node("blue")

    val graph = Graph (
        yellow `--` green `--` red,
        green `--` blue,
    )
    print(graph)
}
