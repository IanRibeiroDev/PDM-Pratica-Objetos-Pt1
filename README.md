# PDM-Pratica-Objetos-Parte1

### Agora, para testar os conhecimentos apresentados, vamos realizar um exercício prático abordando alguns dos conceitos que foram abordados acima.

## Questão 1
a) Crie uma classe chamada Produto com os seguintes atributos:

nome: String
preco: Double

b) Implemente a classe de três formas diferentes, variando o construtor em cada uma delas.

Um construtor que não recebe parâmetros e inicializa nome como "Produto" e preco como 0.0.
Um construtor que recebe apenas o nome do produto como parâmetro e inicializa preco como 0.0.
Um construtor que recebe tanto o nome quanto o preço do produto como parâmetros.

c) Crie instâncias das diferentes classes Produto utilizando os seus construtores e imprima os detalhes de cada produto.

## Questão 2
a) Crie uma classe chamada Cliente com os seguintes atributos:

nome: String
idade: Int

b) Utilize os modificadores de visibilidade para definir que o atributo nome seja público e o atributo idade seja privado.

c) Crie um método público na classe Cliente chamado mostrarIdade() que imprime a idade do cliente.

d) Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.

## Questão 3
a) Suponha que você esteja desenvolvendo um sistema de jogos. Crie uma classe abstrata chamada Personagem com o método abstrato atacar().

b) Imagine que no seu jogo existam diferentes tipos de personagens, como Guerreiro e Mago. Crie essas subclasses de Personagem e implemente o método atacar() de cada uma delas de acordo com suas características de combate. O Guerreiro ataca com espada e o Mago lança um feitiço.

c) Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.

## Questão 4
a) Desenvolva uma interface em chamada FormaGeometrica com um método abstrato calcularArea().

b) Implemente duas classes, Retangulo e Circulo, que implementem a interface FormaGeometrica e forneçam a implementação do método calcularArea() para cada uma delas. A classe Retangulo deve receber a altura e a largura como parâmetros no construtor e calcular a área multiplicando a altura pela largura. A classe Circulo deve receber o raio como parâmetro no construtor e calcular a área usando a fórmula π * raio * raio.

c) Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.

## Questão 5
a) Crie uma classe chamada ContaBancaria com os seguintes atributos:

numeroConta: String
nomeTitular: String
saldo: Double

b) Implemente um getter personalizado para a propriedade nomeTitular para retorná-la iniciando em letra maiúscula.

c) Implemente override do setter para o atributo saldo de forma que o valor do saldo não possa ser negativo. Se um valor negativo for atribuído, o saldo deve ser mantido como zero.

d) Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
