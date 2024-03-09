import kotlin.math.pow

// Questão 1
class Produto {
    var nome: String
    var preco: Double

    // Implemente os construtores conforme especificado na questão
    constructor() {
        this.nome = "Produto"
        this.preco = 0.0
    }

    constructor(nome: String) {
        this.nome = nome
        this.preco = 0.0
    }

    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }
}


// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    // Utilize os modificadores de visibilidade para definir os atributos nome e idade conforme especificado na questão

    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
    fun mostrarIdade() {
        println("Idade = $idade")
    }
}


// Questão 3
abstract class Personagem {
    // Crie um método abstrato atacar() conforme especificado na questão
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Guerreiro
        println("O guerreiro atacou com sua espada.")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Mago
        println("O mago lançou um feitiço")
    }
}


// Questão 4
interface FormaGeometrica {
    // Declare um método abstrato calcularArea() conforme especificado na questão
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Retangulo conforme especificado na questão
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Circulo conforme especificado na questão
        return Math.PI * raio.pow(2.0)
    }
}


// Questão 5
class ContaBancaria {
    var numeroConta: String = ""

    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão
    var nomeTitular: String = ""
        get() = field.capitalize()

    // Implemente override do setter para o atributo saldo conforme especificado na questão
    var saldo: Double = 0.0
        set(value) = if(value < 0) field = 0.0 else field = value
}


fun main() {
    // Crie instâncias das diferentes classes Produto utilizando os seus construtores e imprima os detalhes de cada produto.
    val p1 = Produto()
    val p2 = Produto("Panela")
    val p3 = Produto("Vaso", 25.99)

    println("P1: (nome=${p1.nome}, preco=${p1.preco}")
    println("P2: (nome=${p2.nome}, preco=${p2.preco}")
    println("P3: (nome=${p3.nome}, preco=${p3.preco}")


    // Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.
    val cliente = Cliente()
    cliente.mostrarIdade()


    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
    val guerreiro = Guerreiro()
    val mago = Mago()
    guerreiro.atacar()
    mago.atacar()


    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
    val circulo = Circulo(2.0)
    val retangulo = Retangulo(4.0, 2.0)
    println("Area circulo: ${circulo.calcularArea()}")
    println("Area retangulo: ${retangulo.calcularArea()}")


    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
    val conta = ContaBancaria()
    conta.nomeTitular = "ian"
    conta.saldo = -10.0
    println("Conta: (nomeTitular=${conta.nomeTitular}, saldo=${conta.saldo})")
}