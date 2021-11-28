#  TRABALHO BIMESTRAL
![UNIPAR ](https://www.calendariodovestibular.com.br/wp-content/uploads/2013/03/post_unipar.png) 

## TRABALHO  
## DE
PROGRAMAÇÃO ORIENTADA A OBJETOS
=============================
   

### Acadêmicos: Henrique Borges da Silva - Rafael Maximino Testa
### R.A: 00195578 - 00204260
### Orientador: Geferson Luis Simonette
*******
#####   Toledo, 27/11/2021

*****
# 1- O que é ? E para que serve o throw no Java? 
 A palavra-chave throw serve para lançar uma exceção (mais precisamente um Throwable, mas em 99,9% dos casos uma exceção). A palavra-chave throws serve para declarar que um método pode lançar exceções de um determinado tipo.

##### Para entender melhor o que significa "poder lançar exceções", vejamos:
 **Esta é a hierarquia das classes Throwable**

![Throwable](https://www.oracle.com/technetwork/es/images/img1-5928057.png)
##### Focando nas subclasses de Exception e RuntimeException, que são os casos mais comuns.

Em Java há dois tipos de exceções:
* Checked exceptions: as que precisam ser tratadas em tempo de compilação (são subclasses de Exception mas não de RuntimeException), tendo como exemplos em nossa hierarquia as classes ExcecaoA e ExcecaoB;
* Unchecked exceptions: as que não precisam ser tratadas em tempo de compilação (são subclasses de RuntimeException), tendo como exemplos em nossa hierarquia as classes ExcecaoC e ExcecaoD.

> Quando dizemos "tratadas em tempo de compilação", quero dizer que se uma determinada exceção é lançada dentro de um método por meio da palavra-chave throw, esse mesmo método deve capturar a exceção ou então declarar que a lança por meio da cláusula throws (o que significa efetivamente postergar a captura da exceção para outros métodos que chamem esse método). No caso de subclasses de RuntimeException, esse tratamento não é necessário, e a exceção em questão pode ser lançada por qualquer parte do código em qualquer situação.
Quando o código em execução chega a uma linha contendo a palavra-chave throw, note que essa linha está dentro de um método que está dentro de outro método e assim por diante, isto é, durante a execução do código existe uma pilha de execução de métodos. No momento em que o throw é executado e a exceção é lançada, ela é propagada ao longo da pilha de execução de métodos até chegar ao fim da pilha ou então ser capturada por um bloco catch, que permite tratar essa exceção, relançá-la, ou lançar uma nova exceção de um tipo diferente de volta para a pilha de execução de métodos.


# Exemplo: uso do **TRY CATCH** & **THROW** 

![TRY CATCH & THROW](https://s3.amazonaws.com/webucator-how-tos/2052.png)
****
# 2) Em que situações deve-se usar o finally? 
O bloco finally é utilizado para garantir que um código seja executado após um try , mesmo que uma exceção tenha sido gerada. Mesmo que tenha um return no try ou no catch , o bloco finally é sempre executado.
##### Por qual motivo isso acontece?
O bloco finally, geralmente, é utilizado para fechar conexões, arquivos e liberar recursos utilizados dentro do bloco try/catch. Como ele é sempre executado, nós conseguimos garantir que sempre após um recurso ser utilizado dentro do try/catch ele poderá ser fechado/liberado no finally.
O bloco finally **sempre será executado, salvo em raras situações.**
De forma geral ele é a garantia de que seu código irá liberar recursos ocupados mesmo que ocorram exceções (Exceptions) ou o método contendo o try retorne prematuramente (return).
Exemplo:
![Finally](https://www.galinhaprogramadora.com.br/wp-content/uploads/2019/06/codigo-exemplo-blocos-try-catch-finally-1024x503.png)


Os únicos momentos em que o finally não será chamado são:
* Se você chamar System.exit()
* um outro thread interromper o atual (através do método interrupt())
* Se a JVM der crash antes.
****
# 3) Quando devemos usar o throws? Qual a sua finalidade? 
* A instrução Throws serve para autorizar uma classe ou método a estourar exceções de determinado tipo. Ou seja, ele quem autoriza uma classe ou método chamar o throw, explicado na primeira pergunta.
* O throws é usado quando quer enviar possível exceção do método que está utilizando para outras classes, para quando esse procedimento não é fundamental naquela classe, aí vai precisar da exceção em outra classe. A finalidade do throws é na assinatura do método que é uma participação de que o método pode criar uma exceção. Também podemos considerar que throws é uma exceção que será lançada por esse método, para quando for possível chamar o método. Quando ocorre isso significa que ao chamar esse método será informado de que essa exceção conseguiu ser apresentada.
****
### Referências 
 *  [Throw ](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/throw)
 *  [Finally](https://www.guj.com.br/t/finally/75238)
  *  [Throws](https://www.guj.com.br/t/throw-e-throws/39358)


