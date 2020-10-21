package dsl

enum class Style {
    DASHED {
        override fun toString(): String = "--"
    },
    DOTTED{
        override fun toString(): String = ".."
    },
    SOLID{
        override fun toString(): String = "__"
    };

    abstract override fun toString(): String
}
