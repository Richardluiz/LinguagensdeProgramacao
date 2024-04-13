# LOTOFÁCIL - Sistema de Loteria em Java

Este é um sistema simples de loteria chamado LOTOFÁCIL desenvolvido em Java. Ele permite que os jogadores façam apostas, verifiquem os resultados e calculem prêmios de acordo com as regras da loteria. O sistema funciona através do terminal, lendo e escrevendo dados.

## Requisitos

- JDK (Java Development Kit)
- Biblioteca Scanner para entrada de dados: [Documentação do Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- Biblioteca Random para geração de números aleatórios: [Documentação do Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
- Biblioteca Character para manipulação de caracteres: [Documentação do Character](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

## Como Jogar

1. Clone este repositório para sua máquina local.
2. Abra o terminal e navegue até o diretório onde o repositório foi clonado.
3. Compile o código Java usando o seguinte comando:

4. Execute o programa usando o seguinte comando:

5. Siga as instruções apresentadas no terminal para fazer suas apostas.

## Regras do Jogo

- O menu LOTOFÁCIL permite que os jogadores façam diferentes tipos de apostas.
- Enquanto o usuário não digitar 0 para sair, novas apostas serão permitidas.
- Regras para a aposta de 0 a 100:
  - O jogador deve digitar um número inteiro de 0 a 100.
  - Se o número estiver fora deste intervalo, será exibida a mensagem "Aposta inválida".
  - O sistema sorteia aleatoriamente um número de 0 a 100.
  - Se o jogador acertar o número sorteado, ele ganha R$ 1.000,00; caso contrário, é exibida a mensagem "Que pena! O número sorteado foi: X".
- Regras para a aposta de A à Z:
  - O jogador deve digitar uma letra de A a Z (maiúscula ou minúscula).
  - Se a entrada não for uma letra, será exibida a mensagem "Aposta inválida".
  - O sistema escolhe uma letra premiada.
  - Se o jogador acertar a letra premiada, ele ganha R$ 500,00; caso contrário, é exibida a mensagem "Que pena! A letra sorteada foi: X".
- Regras para a aposta de número par ou ímpar:
  - O jogador deve digitar um número inteiro.
  - O sistema verifica se o número é par ou ímpar.
  - Se o número digitado for par, o jogador ganha R$ 100,00; caso contrário, é exibida a mensagem "Que pena! O número digitado é ímpar e a premiação foi para números pares".

## Entrega

Para entregar este projeto:

1. Crie uma conta no GitHub, caso ainda não tenha uma.
2. Crie um repositório chamado LOTOFÁCIL ou utilize um repositório existente.
3. Faça o upload do seu projeto para o repositório criado.
4. Crie um arquivo README.md com instruções sobre o projeto e como executá-lo, indicando a versão do JDK e as bibliotecas utilizadas.
5. Entregue o link do seu repositório no Canvas da disciplina de Linguagens de Programação.

**Exemplo de entrega:**
- Link da sua entrega: `https://github.com/seunome/lotofacil`
- Arquivos do repositório: `Loteria.java` e `README.md`
  ## Video Exemplo
  https://drive.google.com/file/d/1XHsfJlkkFmlcEWhRDCWIzjyK8nV1fDN-/view?usp=drive_link





