import dsl.Graph
import dsl.Node
import dsl.Style

fun main() {
    val yellow = Node("yellow")
    val green = Node("green")
    val red = Node("red")
    val blue = Node("blue")

    val graph = Graph (
        yellow .. green .. red,
        (green .. blue) [Style.DASHED],
    )
    print(graph)
}
