---
theme: seriph
background: ./images/mohammad-rahmani-8qEB0fTe9Vw-unsplash.jpg
title: Dominando o GitHub Copilot - Workshop Prático
layout: cover
transition: slide-left
css: unocss
highlighter: shiki
---

# Dominando o GitHub Copilot

Workshop Prático para Desenvolvedores

**Por**: Douglas Nassif (douglas.junior@db1.com.br)

---

## O que é o GitHub Copilot?

- Ferramenta de autocomplete de código alimentada por IA.
- Desenvolvida pela GitHub em parceria com a OpenAI.
- Disponível como extensão para VSCode e plugin para IntelliJ[1].

---

## Como Funciona?

- Utiliza modelos de machine learning treinados em código público.
- Analisa o contexto do código para sugerir completions.
- Pode gerar trechos de código, funções completas ou até arquivos inteiros[1].

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

- O que é o Autocomplete no Copilot.
- Como ele funciona em tempo real durante a codificação.

---

## Usando o Autocomplete no VSCode

- Ative a extensão do Copilot.
- Comece a digitar e aceite sugestões com a tecla Tab.

## Usando o Autocomplete no IntelliJ

- Instale o plugin do Copilot.
- Utilize as sugestões enquanto codifica.

---

## Exemplo em Java - Endpoint REST

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
<v-click>
<br>

### Passos Práticos: 
- Crie `UserController.java` 
- Implemente a rota de listagem de usuários usando sugestões do Copilot
- Rode com `./gradlew :bootRun` e teste via curl ou postman.
</v-click>

---

## Exemplo em Angular - Componente

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
- Gere componente com `ng generate component user-list`
- Implemente uma lista de usuários usando sugestões do Copilot
- Adicione o componente ao módulo principal (`app.component.ts` e `app.component.html`)
- Rode com `ng serve`

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

- O que é o Modo Ask e como ele difere do Autocomplete.
- Como usá-lo para obter sugestões de código específicas[1].

**Uso**: No chat do Copilot, forneça prompts claros[2].

---

## Criando Prompts Eficazes

- Seja específico e claro ao fazer perguntas.
- Forneça contexto quando necessário.
- Exemplo: "Como validar um email em Spring Boot?"[1].

---

## Exemplo em Java - Validação de Entrada

**Prompt**: "Implementar validação de email para a entidade User"

```
public class User {
    @Email(message = "Email inválido")
    private String email;
}
```

**Passos Práticos**: Adicione dependência de validação ao `pom.xml`, aplique sugestão, teste com POST inválido[1][2].

---

## Exemplo em Angular - Serviço para API

**Prompt**: "Criar um serviço para buscar usuários de uma API"

```
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) {}

  getUsers() {
    return this.http.get('/api/users');
  }
}
```

**Passos Práticos**: Gere service com `ng generate service user`, aplique código, injete no componente e rode[1][2].

---

## Casos de Uso para o Modo Ask

- Resolver problemas específicos de codificação.
- Aprender nova sintaxe ou frameworks.
- Obter soluções alternativas para um problema[1].

---

## Intervalo

Pausa de 5 minutos para descanso e networking[1].

---

## Introdução ao Modo Agent

- O que é o Modo Agent e como ele se diferencia dos outros recursos.
- Ideal para tarefas complexas, como refatoração e geração de documentação[1].

---

## Usando o Modo Agent

- Interaja com o Copilot como um assistente de IA.
- Forneça instruções claras para tarefas específicas[1].

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

**Passos Práticos**: Adicione método longo em `UserService`, use prompt no Agent para refatorar, teste[1][2].

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

**Passos Práticos**: Use componente existente, aplique documentação via prompt[1][2].

---

## Melhores Práticas para o Modo Agent

- Forneça instruções detalhadas ao agente.
- Revise e teste o código gerado.
- Use para tarefas maiores, não apenas completions[1].

---

## Personalizando o Copilot

- Como adaptar o Copilot para seus projetos.
- Configuração de prompts personalizados[1].

**Exemplo**: Em Settings > GitHub Copilot, crie "Gerar controller REST para [entidade]" e teste[2].

---

## Criando Prompts Personalizados

- No VSCode: Configurações > GitHub Copilot > Custom Prompts.
- Exemplo: "Gerar um controller REST Spring Boot para a entidade [nome]"[1].

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

**Passos**: Invoque em arquivo vazio[1][2].

---

## Outras Configurações Úteis

- Ajuste o comportamento das sugestões.
- Integre com outras extensões ou plugins[1].

---

## Modo Agent com Código Legado

- Uso do Modo Agent para melhorar código antigo.
- Geração de documentação e refatoração de componentes complexos[1].

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

**Passos Práticos**: Crie classe básica, aplique documentação[1][2].

---

## Exemplo em Angular - Refatorando Componente

**Prompt**: "Refatorar este componente para melhorar o desempenho"

**Antes**: Componente com lógica pesada no template.  
**Depois**: Lógica movida para o serviço, com template simplificado.

**Passos Práticos**: Adicione lógica pesada, refatore via prompt[1][2].
```
