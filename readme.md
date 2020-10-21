# Kotlin DOT DSL

## Overview

**[DOT](https://graphviz.org/doc/info/lang.html)** is a **Domain Specific Language (DSL)** that is used in the **Graphviz - Graph Visualization Software**
to describe graphs. A graph is an ensemble of nodes connected by edges.

This project aims to mimic this language using various features of the _Kotlin_ language.

## Example

This is the graph described with DOT:
```
graph graphname {
    yellow -- green -- red [style=dotted];
    green -- blue;
}
```

Using this library, we can write it in Kotlin:
```
val yellow = Node("yellow")
val green = Node("green")
val red = Node("red")
val blue = Node("blue")

val graph = Graph (
 (yellow `--` green `--` red) [Style.DOTTED],
 green `--` blue,
)
print(graph)
```

This code prints the following graph:
```
(yellow) .. (green) .. (red)
(green) -- (blue)
```
_(This graph is of course only for demonstrational purpose)_
