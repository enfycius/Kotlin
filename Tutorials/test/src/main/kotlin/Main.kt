import java.io.InputStream
import java.io.OutputStream

interface Document {
    val version: Long
    val size: Long

    val name: String

        get() = "NoName"

    fun save(input: InputStream)
    fun load(stream: OutputStream)
    fun getDescription(): String {
        return "Documents $name has $size byte(-s)"
    }
}

fun main(args: Array<String>) {
    var name: Char = 'k'
    val name2: String = "kotlin"

//    name2 = "Java"

    var array = arrayOf(1, 2, 3)

    println(array[1])
//    println(array[3])

    var perfectSquares = Array(10, { k -> k * k })

    println(perfectSquares[2])

    for (k in perfectSquares) {
        println(k)
    }

//    for i in range(0, 100):

    for (i: Int in 1..9) {
        for (j: Int in 1..9) {
            println(i*j)
        }
    }

    class Person2(firstName: String, lastName: String, howOld: Int?) {
        private val name: String
        private val age: Int?

        init {
            this.name = "$firstName, $lastName"
            this.age = howOld
        }

        fun getName(): String = this.name
        fun getAge(): Int? = this.age
    }

    class DocumentImpl: Document {
        override val size: Long
            get() = 0
        override fun load(stream: OutputStream) {

        }

        override fun save(input: InputStream) {

        }

        override val version: Long

            get() = 0
    }
    
    var person = Person2("Jonghyeok", "Kim", 24)

    println(person.getName())
    println(person.getAge())

    println(name is Char)

    println(name)

    println("Hello")
    println("World")
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}