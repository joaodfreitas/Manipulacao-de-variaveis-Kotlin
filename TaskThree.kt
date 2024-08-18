import java.text.DecimalFormat

fun main() {
    val nomeProduto: String = "Notebook"
    val precoUnitario: Double = 3500.0
    val quantidadeComprada: Int = 5
    val taxaImposto: Double = 15.0 // em %
    val margemLucroDesejada: Double = 20.0 // em %

    val totalSemImposto: Double = precoUnitario * quantidadeComprada
    val valorImposto: Double = totalSemImposto * (taxaImposto / 100)
    val totalComImposto: Double = totalSemImposto + valorImposto
    val precoVendaSugerido: Double = totalComImposto * (1 + margemLucroDesejada / 100)

    val df = DecimalFormat("R$ #,##0.00")
    val totalComImpostoFormatado: String = df.format(totalComImposto)
    val precoVendaFormatado: String = df.format(precoVendaSugerido)

    val mensagemFinal: String = "Produto: $nomeProduto\n" +
            "Valor total com impostos: $totalComImpostoFormatado\n" +
            "Preço de venda sugerido: $precoVendaFormatado"

    println("Nome do produto: $nomeProduto")
    println("Preço unitário: R$ $precoUnitario")
    println("Quantidade comprada: $quantidadeComprada")
    println("Taxa de imposto: $taxaImposto%")
    println("Margem de lucro desejada: $margemLucroDesejada%")
    println("Valor total sem impostos: R$ ${df.format(totalSemImposto)}")
    println("Valor do imposto: R$ ${df.format(valorImposto)}")
    println("Valor total com impostos: $totalComImpostoFormatado")
    println("Preço de venda sugerido: $precoVendaFormatado")
    println("\n$mensagemFinal")
}

