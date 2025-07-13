---
theme: seriph
background: ./images/mohammad-rahmani-8qEB0fTe9Vw-unsplash.jpg
title: Dominando o GitHub Copilot - Workshop Prático
layout: cover
transition: slide-left
css: unocss
highlighter: shiki
lineNumbers: true
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

- Resolver problemas específicos de codificação.
- Aprender nova sintaxe ou frameworks.
- Obter soluções alternativas para um problema.

---

## Intervalo

Pausa de 5 minutos para descanso e networking.

---

## Introdução ao Modo Agent

- O que é o Modo Agent e como ele se diferencia dos outros recursos.
- Ideal para tarefas complexas, como refatoração e geração de documentação.

---

## Usando o Modo Agent

- Interaja com o Copilot como um assistente de IA.
- Forneça instruções claras para tarefas específicas.

---

## Exemplo em Java - Refatoração

**Antes**:
```
public void processUserData() {
    // Lógica longa e confusa
}
```

**Depois**:
```
public void processUserData() {
    validateUser();
    saveUser();
    notifyUser();
}
```

**Passos Práticos**: Adicione método longo em `UserService`, use prompt no Agent para refatorar, teste.

---

## Exemplo em Angular - Documentação

**Prompt**: "Gerar documentação para este componente"

```
/**
 * Componente para exibir uma lista de usuários.
 * @example 
 */
@Component({
  selector: 'app-user-list',
  template: `{{ user.name }}`
})
export class UserListComponent {
  /** Lista de usuários a ser exibida */
  users = [{ name: 'Alice' }, { name: 'Bob' }];
}
```

**Passos Práticos**: Use componente existente, aplique documentação via prompt.

---

## Melhores Práticas para o Modo Agent

- Forneça instruções detalhadas ao agente.
- Revise e teste o código gerado.
- Use para tarefas maiores, não apenas completions.

---

## Personalizando o Copilot

- Como adaptar o Copilot para seus projetos.
- Configuração de prompts personalizados.

**Exemplo**: Em Settings > GitHub Copilot, crie "Gerar controller REST para [entidade]" e teste.

---

## Criando Prompts Personalizados

- No VSCode: Configurações > GitHub Copilot > Custom Prompts.
- Exemplo: "Gerar um controller REST Spring Boot para a entidade [nome]".

---

## Usando Prompts Personalizados

**Exemplo de Resultado**:
```
@RestController
@RequestMapping("/api/[nome]")
public class [Nome]Controller {
    @GetMapping
    public ResponseEntity> getAll() {
        return ResponseEntity.ok([nome]Service.findAll());
    }
}
```

**Passos**: Invoque em arquivo vazio.

---

## Outras Configurações Úteis

- Ajuste o comportamento das sugestões.
- Integre com outras extensões ou plugins.

---

## Modo Agent com Código Legado

- Uso do Modo Agent para melhorar código antigo.
- Geração de documentação e refatoração de componentes complexos.

---

## Exemplo em Java - Documentando Código Legado

**Prompt**: "Gerar documentação para esta classe"

```
/**
 * Classe responsável por gerenciar usuários no sistema.
 */
public class UserManager {
    public void addUser(String name) {
        // Adiciona usuário
    }
}
```

**Passos Práticos**: Crie classe básica, aplique documentação.

---

## Exemplo em Angular - Refatorando Componente

**Prompt**: "Refatorar este componente para melhorar o desempenho"

**Antes**: Componente com lógica pesada no template.  
**Depois**: Lógica movida para o serviço, com template simplificado.

**Passos Práticos**: Adicione lógica pesada, refatore via prompt.
```
