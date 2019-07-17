package Stacks

class MyStack: StackDef<Any> {
    private val stack = mutableListOf<Any>()

    override fun push(item: Any) {
        stack.add(item)
    }

    override fun pop(): Any {
        return stack.removeAt(stack.size - 1)
    }

    override fun peek(): Any {
        return stack[stack.size - 1]
    }

    override fun size(): Int {
        return stack.size
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun printContent() {
        println(stack.joinToString())
    }
}