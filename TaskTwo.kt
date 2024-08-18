fun main() {
    val personName: String = "João"
    val personAge: Int = 30
    val monthlySalary: Double = 5000.0
    val monthsWorked: Int = 12
    val productsBought: Int = 50

    val annualGrossSalary: Double = monthlySalary * monthsWorked
    val annualNetSalary: Double = annualGrossSalary - 3000.0
    val message: String = "Olá, $personName! Seu salário anual líquido é de R$$annualNetSalary."

    println("Nome da pessoa: $personName")
    println("Idade da pessoa: $personAge")
    println("Salário bruto mensal: R$$monthlySalary")
    println("Meses trabalhados no ano: $monthsWorked")
    println("Quantidade de produtos comprados: $productsBought")
    println("Salário bruto anual: R$$annualGrossSalary")
    println("Salário líquido anual: R$$annualNetSalary")
    println(message)
}
