fun main() {
    val age: Int = 75
    val heigth: Double = 1.75
    val name: String = "Cleiton"
    val isEstudant: Boolean = false

    val anotherAge: Int = 30
    val addAge: Int = age + anotherAge
    val doubledHeight: Double = heigth * 2
    val greeting: String = "Olá, $name!"

    println("Idade da pessoa: $age")
    println("Altura da pessoa: $heigth metros")
    println("Nome da pessoa: $name")
    println("É estudante? $isEstudant")
    println("Soma das idades: $addAge")
    println("Altura duplicada: $doubledHeight metros")
    println(greeting)
}
