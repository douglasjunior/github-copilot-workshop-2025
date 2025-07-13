---
theme: seriph
background: ./images/mohammad-rahmani-8qEB0fTe9Vw-unsplash.jpg
title: Dominando o GitHub Copilot - Workshop Prático
layout: cover
transition: slide-left
css: unocss
highlighter: shiki
lineNumbers: true
mdc: true
---

# Dominando o GitHub Copilot

Workshop Prático para Desenvolvedores

**Por**: Douglas Nassif (douglas.junior@db1.com.br)

---

## O que é o GitHub Copilot?

- Ferramenta de autocomplete de código alimentada por IA.
- Desenvolvida pela GitHub em parceria com a OpenAI.
- Disponível como extensão para VSCode e plugin para IntelliJ.

---

## Como Funciona?

- Utiliza modelos de machine learning treinados em código público.
- Analisa o contexto do código para sugerir completions.
- Pode gerar trechos de código, funções completas ou até arquivos inteiros.

---

## Benefícios para Desenvolvedores

- Acelera o processo de codificação com sugestões inteligentes.
- Ajuda a aprender novas frameworks e linguagens.
- Reduz código boilerplate.
- Auxilia na depuração e refatoração.

<br>
<br>

<v-click>

### Demonstração Rápida:

- Abra uma pasta vazia no VS Code
- Crie `hello.js`
- Digite `function helloWorld() {` e aceite sugestões
- Execute com `node hello.js` para ver "Hello, World!"

</v-click>

---

## Introdução ao Autocomplete

- À medida que você digita, o Copilot analisa o contexto do seu código e exibe sugestões inline, geralmente em cinza claro.
- Você pode aceitar a sugestão pressionando Tab ou uma tecla específica do seu editor.
O Copilot pode sugerir desde nomes de variáveis até funções completas, loops, estruturas condicionais e até testes unitários.
- O Autocomplete do Copilot vai além do autocomplete tradicional dos editores, pois usa inteligência artificial treinada em bilhões de linhas de código, tornando as sugestões mais inteligentes e adaptadas ao contexto.

---

## Usando o Autocomplete no VSCode

- Ative a extensão do Copilot.
- Comece a digitar e aceite sugestões com a tecla Tab.

## Usando o Autocomplete no IntelliJ

- Instale o plugin do Copilot.
- Utilize as sugestões enquanto codifica.

---

## Exemplo em Java - Endpoint REST

> Digite na ordem sugerida para ver o Copilot em ação.

<style>
.small {
  transform: scale(0.6);
  margin-bottom: -50px;
  margin-top: -50px;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 7 }">

```java {3,16|1-2|5|7-9|11|12-14|all}
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
```
</div>

<div v-click="7">

### Passos Práticos: 
1. Crie `UserController.java` 
1. Implemente a rota de listagem de usuários usando sugestões do Copilot
1. Rode com `./gradlew :bootRun` e teste via curl ou postman.

</div>

---

## Exemplo em Angular - Componente

> Digite na ordem sugerida para ver o Copilot em ação.

<style>
.small {
  transform: scale(0.5);
  margin-bottom: -70px;
  margin-top: -70px;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 5 }">

```typescript {1,4,5,12,13,19|2,6|7-11|14-18|all}
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-list',
  imports: [CommonModule],
  template: `
  <ul>
    <li *ngFor="let user of users">{{ user.name }}</li>
  </ul>
  `,
})
export class UserListComponent {
  users = [
    { name: 'Alice' },
    { name: 'Bob' },
    { name: 'Charlie' }
  ];
}
```

</div>

<div v-click="5">

### Passos Práticos: 
1. Gere componente com `ng generate component user-list`
1. Implemente uma lista de usuários usando sugestões do Copilot
1. Adicione o componente ao módulo principal (`app.component.ts` e `app.component.html`)
1. Rode com `ng serve`

</div>

---

## Dicas para Uso Eficaz do Autocomplete

- Escreva comentários claros para orientar as sugestões.
- Use nomes de variáveis e funções significativos.
- Aceite sugestões seletivamente, verificando a lógica.


<v-click>

## Limitações do Autocomplete

- Pode sugerir código incorreto ou inseguro.
- Não substitui o entendimento do código.
- Requer verificação e testes adicionais.

</v-click>

---

## Introdução ao Modo Ask

- Permite que você faça perguntas em linguagem natural diretamente ao Copilot (por exemplo: “Explique essa função”, “Como usar o useEffect do React?”, “Como corrigir esse erro?”).
- Funciona como uma janela de chat ou caixa de diálogo dentro do editor.
O Copilot responde com explicações, exemplos, sugestões de boas práticas, links e orientações detalhadas.
- Pode ser usado para dúvidas sobre o código atual, conceitos de programação, frameworks, bibliotecas, erros e até dúvidas sobre o próprio GitHub.
- Ideal para aprender, tirar dúvidas rápidas ou aprofundar o entendimento sem sair do editor de código.

---

## Criando Prompts Eficazes

- Seja específico e claro ao fazer perguntas.
- Forneça contexto quando necessário.
- Exemplo: "Como validar um email em Spring Boot?".

<v-click>

**Curso Uni421:** [Conceitos Fundamentais de GenAI, LLMs e Prompt Engineering](https://db1.uni421.com.br/lms/#/aprendizagem/catalogo/infos_gerais/?idmatricula=0&secao=213&idcatalogo=2&idcurso=202)

</v-click>

---

## Exemplo em Java - Validação de Entrada

<style>
.small {
  transform: scale(0.1);
  margin: -165px 0;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 7 }">

> **Prompt**: Implementar validação de email para a entidade User

```java {1-2,6-7|4-5|all}
public class User {
    private String name;

    @Email
    private String email;

    // Construtor, getters e setters
}
```

<v-click>

> **Prompt**: Implemente no UserController uma rota para cadastro de User com validação

```java {0|1-2,9|4-8|all}
public class UserController {
    // Injeção do service e construtor omitidos

    @PostMapping()
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
```

</v-click>

</div>

<div v-click="7">

**Passos Práticos**: 
1. Navege até a classe `User.java` no seu editor
1. Use o Modo Ask para solicitar a implementação de uma validação de email
    > **Prompt**: Implementar validação de email para a entidade User
1. Esperamos que seja adicionado a propriedade `email` na classe `User`, bem como a anotação `@Email`, atualização do construtor e métodos `get` e `set`
1. Navegue até a classe `UserController.java`
1. Use o Modo Ask para solicitar a implementação de uma rota de cadastro de `User` com validação
    > **Prompt**: Implemente no UserController uma rota para cadastro de User com validação
1. Esperamos que seja adicionado o método `createUser` na classe `UserController`, bem como a anotação `@PostMapping` e o uso do `UserService` para salvar o usuário

</div>


---

## Exemplo em Angular - Serviço para API

<style>
.small {
  transform: scale(0.4);
  margin: -80px 0;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 3 }">

> **Prompt**: Criar um serviço para buscar usuários de uma API no endereço "https://jsonplaceholder.typicode.com/users"

```typescript {1,5-8,15|2-3,10-14|all}
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; 
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUsers(): Observable<any> {
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }
}
```

</div>

<div v-click="3">

**Passos Práticos**: 
1. Gere service com `ng generate service user`
1. Navegue até o arquivo `user.service.ts`
1. Use o Modo Ask para solicitar a criação de um serviço que busque usuários de uma API
    > **Prompt**: Criar um serviço para buscar usuários de uma API no endereço "https://jsonplaceholder.typicode.com/users"
1. Esperamos que seja adicionado o método `getUsers` no serviço, utilizando o `HttpClient` do Angular para fazer uma requisição GET para `https://jsonplaceholder.typicode.com/users`
1. Copie o código gerado para o arquivo `user.service.ts`

</div>

---

## Exemplo em Angular - Serviço para API

<style>
.small {
  transform: scale(0.05);
  margin: -230px 0;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 3 }">

> **Prompt**: Consuma no UserListComponent o UserService para listar os usuários

````md magic-move

```typescript {*}
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  imports: [CommonModule],
  selector: 'app-user-list',
  template:  `
  <ul>
    <li *ngFor="let user of users">{{ user.name }}</li>
  </ul>
  `,
})
export class UserListComponent {
  users = [
    { name: 'Alice' },
    { name: 'Bob' },
    { name: 'Charlie' }
  ];
}
```

```typescript {3,15-23|all}
import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  imports: [CommonModule],
  selector: 'app-user-list',
  template:  `
  <ul>
    <li *ngFor="let user of users">{{ user.name }}</li>
  </ul>
  `,
})
export class UserListComponent implements OnInit {
  users: any[] = [];

  constructor(private userService: UserService) {}

  ngOnInit() {
    this.userService.getUsers().subscribe((data: any[]) => {
      this.users = data;
    });
  }
}
```
````

</div>

<div v-click="3">

**Passos Práticos**: 
1. Gere o service com `ng generate service user`
1. Navegue até o arquivo `user.service.ts`
1. Use o Modo Ask para solicitar a criação de um serviço que busque usuários de uma API
    > **Prompt**: Criar um serviço para buscar usuários de uma API no endereço "https://jsonplaceholder.typicode.com/users"
1. Esperamos que seja adicionado o método `getUsers` no serviço, utilizando o `HttpClient` do Angular para fazer uma requisição GET para `https://jsonplaceholder.typicode.com/users`
1. Copie o código gerado para o arquivo `user.service.ts`
1. Navegue até o arquivo `user-list.component.ts`
1. Use o Modo Ask para solicitar a implementação do `UserListComponent` que consuma o `UserService` para listar os usuários
    > **Prompt**: Consuma no UserListComponent o UserService para listar os usuários
1. Esperamos que seja adicionado o método `ngOnInit` no componente, que chama o `UserService` para buscar os usuários
1. Copie o código gerado para o arquivo `user-list.component.ts`

</div>

---

## Casos de Uso para o Modo Ask

- Pedir explicações de trechos de código desconhecidos ou complexos (“O que essa função faz?”).

<v-clicks>

- Solicitar exemplos de uso de bibliotecas, funções ou APIs (“Como uso fetch para fazer uma requisição GET?”).
- Obter sugestões de melhores práticas de programação para determinado contexto (“Qual a melhor forma de tratar erros em JavaScript?”).
- Tirar dúvidas sobre sintaxe ou recursos de uma linguagem (“Como funciona o destructuring em JavaScript?”, “Como criar uma classe em Python?”).
- Pedir ajuda para entender mensagens de erro (“O que significa esse erro TypeError: undefined is not a function?”).

</v-clicks>

---

## Casos de Uso para o Modo Ask

- Buscar explicações sobre padrões de projeto (“Explique o padrão Singleton.”).

<v-clicks>

- Obter referências para documentação oficial ou materiais de estudo (“Onde encontro a documentação do React Router?”).
- Solicitar dicas para otimização de código ou refatoração (“Como posso melhorar a performance desse código?”).
- Pedir ajuda na configuração de ferramentas ou ambientes (“Como configuro ESLint para um projeto React?”).
- Perguntar sobre integração entre tecnologias (“Como conectar meu backend Node.js a um banco MongoDB?”).

</v-clicks>

---

## Intervalo

<div v-if="counter > 0">
  Pausa de
  {{ Math.floor(counter / 60).toString().padStart(2, '0') }}:{{ (counter % 60).toString().padStart(2, '0') }}
  minutos.
</div>
<div v-else>
  Time's up!
</div>

<div>
  <button @click="counter = 300">Reiniciar</button>
</div>

<script setup>
import { ref, onMounted, onUnmounted } from 'vue'

const counter = ref(300)
const timerInterval = ref(null)

onMounted(() => {
  timerInterval.value = setInterval(() => {
    if (counter.value > 0) {
      counter.value--
    } else {
      clearInterval(timerInterval.value)
    }
  }, 1000)
})

onUnmounted(() => {
  clearInterval(timerInterval.value)
})
</script>

---

## Introdução ao Modo Agent

- O Modo Agent permite que o Copilot atue como um “agente” autônomo, que entende objetivos maiores e executa passos para atingi-los.
- O agente pode, por exemplo: analisar um problema, propor mudanças, criar ou editar múltiplos arquivos, gerar pull requests, rodar testes, revisar código e até sugerir melhorias de arquitetura.
- Ele funciona realizando ações no projeto, muitas vezes de forma iterativa: ele sugere, executa, valida e ajusta até completar a tarefa solicitada.

---

## Como o Modo Agent se diferencia dos outros recursos do Copilot?

### Autocomplete:
Sugere automaticamente linhas ou blocos de código enquanto você digita, de forma passiva, sem executar ações diretas no projeto.

### Modo Ask:
Permite conversar com o Copilot, fazendo perguntas e recebendo respostas, exemplos ou explicações. Atua como um assistente de dúvidas e aprendizado.

### Modo Agent:
Atua de forma proativa e autônoma, executando tarefas completas, como refatorar código, corrigir bugs, implementar funcionalidades ou automatizar etapas do fluxo de trabalho.

---

## Exemplo de Refatoração

**Antes**:

::code-group

```java [Java]
public class ExemploMalEscrito {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("O número " + numeros[i] + " é par");
            } else {
                System.out.println("O número " + numeros[i] + " não é par");
            }
        }
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + numeros[i];
        }
        System.out.println("A soma é " + soma);
    }
}
```

```typescript [TypeScript]
function exemploMalEscrito() {
  let numeros = [];
  for (let i = 0; i < 10; i++) {
    numeros[i] = i + 1;
  }
  for (let i = 0; i < 10; i++) {
    if (numeros[i] % 2 === 0) {
      console.log("O número " + numeros[i] + " é par");
    } else {
      console.log("O número " + numeros[i] + " não é par");
    }
  }
  let soma = 0;
  for (let i = 0; i < 10; i++) {
    soma = soma + numeros[i];
  }
  console.log("A soma é " + soma);
}

exemploMalEscrito();
```

::

---

## Exemplo de Refatoração

> **Prompt**: Refatore este código para torná-lo mais limpo, legível e eficiente. 
> Use boas práticas da linguagem, evite repetições, quebre em funções menores quando possível e utilize recursos modernos disponíveis.

---

## Exemplo de Refatoração

**Depois**:

::code-group

```java [Java]
public class ExemploRefatorado {
    public static void main(String[] args) {
        int[] numeros = criarArraySequencial(1, 10);
        imprimirParidade(numeros);
        int soma = Arrays.stream(numeros).sum();
        System.out.println("A soma é " + soma);
    }

    private static int[] criarArraySequencial(int inicio, int tamanho) {
        return java.util.stream.IntStream.range(inicio, inicio + tamanho).toArray();
    }

    private static void imprimirParidade(int[] numeros) {
        for (int numero : numeros) {
            String paridade = (numero % 2 == 0) ? "par" : "não é par";
            System.out.println("O número " + numero + " " + paridade);
        }
    }
}
```

```typescript [TypeScript]
function criarArraySequencial(inicio: number, tamanho: number): number[] {
    return Array.from({ length: tamanho }, (_, i) => inicio + i);
}

function imprimirParidade(numeros: number[]): void {
    numeros.forEach(numero => {
        const paridade = numero % 2 === 0 ? "par" : "não é par";
        console.log(`O número ${numero} ${paridade}`);
    });
}

function exemploRefatorado(): void {
    const numeros = criarArraySequencial(1, 10);
    imprimirParidade(numeros);
    const soma = numeros.reduce((acc, curr) => acc + curr, 0);
    console.log(`A soma é ${soma}`);
}

exemploRefatorado();
```

::


---

## Melhores Práticas para o Modo Agent

- Forneça instruções detalhadas ao agente.
- Revise e teste o código gerado.
- Use para tarefas maiores, não apenas *completions*.
- Combine com o Modo Ask para esclarecer dúvidas durante o processo.
- Use o Modo Agent para tarefas complexas, como refatoração de código legado, implementação de novas funcionalidades ou integração de sistemas.

---

## Personalizando o Copilot

> No momento, só há suporte às instruções personalizadas de repositório para o Copilot Chat no Visual Studio, VS Code e no site do GitHub.

- Como adaptar o Copilot para seus projetos.
- Configuração de prompts personalizados.


---

## Criando Prompts Personalizados

<style>
.small {
  transform: scale(0.25);
  margin: -130px 0;
  transition: transform,margin 0.3s ease;
}
</style>

<div :class="{ small: $slidev.nav.clicks >= 3 }">

Prompts personalizados permitem reutilizar comandos comuns para gerar código ou respostas específicas, adaptando o Copilot ao seu fluxo de trabalho.

```markdown {1-4|5-15|all}
---
mode: 'agent'
description: 'Gerar novo controller utilizando Spring Boot' 
---
Your goal is to generate a new Spring Boot controller based on the templates in this repository.

Ask for the controller name and any relevant endpoints if not provided.

Requirements for the controller:
* Use Spring Web annotations for defining endpoints
* Always define request and response DTOs
* Prefer constructor injection for dependencies
* Use validation annotations for request parameters
* Create unit tests for the controller
* Create reusable validation schemas in separate files
```

</div>

<div v-click="3">

### Passos para Criar Prompts Personalizados

1. Abra o VSCode e acesse as configurações: Pressione `Ctrl + ,` (ou `Cmd + ,` no Mac).
1. Busque por `Chat: Prompt Files` e verifique se está habilitado.
1. Crie o arquivo: Pressione `Ctrl + Shift + P` (ou `Cmd + Shift + P` no Mac), busque por "Chat: New Prompt File" e dê um nome (ex.: "generate-controller"). O arquivo será criado com o nome `generate-controller.prompt.md` na pasta `.github/prompts`.
1. Escreva o prompt no arquivo Markdown, incluindo instruções, referências a arquivos usando Markdown ou a sintaxe `#file:../../web/index.ts`.
1. No Chat, digite `/` seguido do nome do prompt (ex.: `/generate-controller`) para usar o prompt personalizado.

</div>

---

## Modo Agent com Código Legado

- Uso do Modo Agent para melhorar código antigo.
- Geração de documentação e refatoração de componentes complexos.

---

## Trabalhando com Código Legado - Exemplos

**Passos Práticos**: 

1. Abra um projeto real em que você trabalhe.
1. Navegue até uma classe ou componente complexo.
1. Use o prompt para solicitar uma explicação detalhada sobre a classe e suas dependências.

**Prompts**: 

- "Explique o funcionamento desta classe como se fosse para um desenvolvedor júnior"
- "Quais são as dependências desta classe e como elas interagem?"
- "Gere um diagrama de sequência para o fluxo ABCD da classe XYZ"
- "Refatore a classe XYZ para dividir a responsabilidade A e B em múltiplos serviços e implemente o padrão port and adapter para acesso ao banco de dados"
- "Refatore o componente XYZ para melhorar o modo `standalone` do Angular"
- "Modifique as propriedades do componente ABC para trabalhar com `input()` em vez de `@Input` 

