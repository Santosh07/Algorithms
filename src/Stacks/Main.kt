package Stacks

import java.util.*

fun main() {
    val myStack = MyStack()
    val stack = Stack<String>()

    myStack.push(8)

    myStack.printContent()

    myStack.push(false)
    myStack.push("Stack")
    myStack.push(5.4)

    myStack.printContent()

    myStack.pop()
    myStack.printContent()
    myStack.pop()
    myStack.printContent()
}