package Stacks

interface StackDef<T> {

    fun push(item: T)

    fun pop(): T

    fun peek(): T

    fun size(): Int

    fun isEmpty(): Boolean

    fun printContent()
}