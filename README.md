## *Oi, eu sou o Miguel!*
Sou um estudante que esta buscando aprender Java. <br>
Aqui ficarão minhas anotações do curso de Java do **DevDojo**<br>


## Como o Java funciona?
![img.png](img.png)

O Java funciona com um compilador, que vai transformar o arquivo .java 
em um arquivo .class (bytecode), para ser lido por um JVM (Java Virtual Machine),
que difere para cada sistema operacional.

## Tipos Primitivos

Os Tipos Primitivos vão guardar em memória um valor simples <br>
Java possui **8 tipos primitivos**, sendo eles:<br>
int -> Funciona para **número inteiros pequenos**<br>
long -> Funciona para **número inteiros grandes** <br>
float -> Funciona para **números decimais pequenos** <br>
double -> Funciona para **números decimais grandes** <br>
byte -> valores capazes de serem armazenados em **1 byte** (8 bits) <br>
short -> valores capazes de serem armazenados em **2 bytes** (16 bits) <br>
boolean -> Valores **verdadeiros** ou **falsos** <br>
char -> Capaz de armazenar **1 caractere** ou valores da **tabela ASCII** ou **tabela Unicode** <br>

![img_1.png](img_1.png)
*Tabela com cada tipo primitivo e seu tamanho*

Note que com excessão do tipo *boolean*, todos os valores armazenam **valores númericos**.

Cast -> Força o Java a colocar uma variavel de um tipo primitivo em outra de outro tipo primitivo <br>
*Não é uma boa prática, já que é só trocar o tipo primitivo da váriavel* <br>

### Troquei o Project language level do 21 para o 8.

## Operadores

### Aritméticos <br>
**Sinais** <br> + = soma <br> - = subtração <br>* = multiplicação<br>/ = divisão<br>

*Se você dividir dois números inteiros, o resultado sempre será um inteiro.*

### Relacionais <br>
Sempre vão retornar valores lógicos (*true* ou *false*)

**Sinais**<br> > : Maior que <br> < : Menor que <br> >= : Maior ou igual a <br> <= : Menor ou igual a <br> == : igual a <br> != : Diferente de <br>

### Lógicos <br>
Serve para comparar valores lógicos (*true* ou *false*)

**Sinais** <br> && = and -> todas as afirmações tem que ser verdadeiras, para o operador ser verdadeiro.<br> || = or -> apenas uma afirmação precisa ser verdadeira, para o operador ser verdadeiro. <br>

### Operadores de Atribuição
Servem para escrever um código mais curto

**Sinais** <br> 
= : atribui um valor a uma variavel<br> 
+= : adiciona um valor a variável <br> 
-= : subtrai um valor da variavel <br> 
*= : multiplica a variavel por um valor <br> 
/= divide a variavel por um valor <br> 
%= : calcula o resto da divisão por um valor <br>

*++ -- -> forma mais abreviada ainda dos operadores de atribuição* <br>
se colocar o ++/-- antes da variavel, o compilador irá adicionar +1 ou subtrair -1 antes de utilizar a variavel. <br>
se colocar o ++/-- depois da variavel, o compilador irá usar a variável primeiro, depois ira adicionar/subtrair 1.

