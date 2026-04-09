# 📱 Smartphone Simulator

> Simulação de um smartphone utilizando Java, com foco em boas práticas de orientação a objetos e modelagem UML.

---

## 🚀 Sobre o Projeto

Este projeto foi desenvolvido com base no conceito de um dispositivo multifuncional (inspirado no iPhone), capaz de atuar como:

- 🎵 Reprodutor Musical  
- 📞 Aparelho Telefônico  
- 🌐 Navegador de Internet  

A proposta é demonstrar, de forma prática, a aplicação de **interfaces**, **polimorfismo** e princípios do **SOLID**.

---

## 🧠 Arquitetura e Design

O sistema foi modelado utilizando **interfaces segregadas**, garantindo baixo acoplamento e alta coesão.

### Interfaces:
- `ReprodutorMusical`
- `AparelhoTelefonico`
- `NavegadorInternet`

### Implementação:
- `IPhone` → Implementa todas as interfaces

📌 Aplicação direta do princípio:
> **Interface Segregation Principle (ISP)**

---

## 📊 Diagrama UML

![Diagrama UML](./docs/diagrama.png)

---

## 🏗️ Estrutura do Projeto

smartphone-simulator/
│
├── smartphone/
│ ├── device/
│ │ └── IPhone.java
│ │
│ ├── reprodutor/
│ │ └── ReprodutorMusical.java
│ │
│ ├── telefone/
│ │ └── AparelhoTelefonico.java
│ │
│ └── navegador/
│ └── NavegadorInternet.java


---

## 💻 Exemplo de Uso

```java
IPhone iphone = new IPhone();

iphone.ligar("99999-9999");
iphone.atender();

iphone.selecionarMusica("Minha Música Favorita");
iphone.tocar();

iphone.exibirPagina("https://www.google.com");
🧩 Conceitos Demonstrados
✔️ Programação Orientada a Objetos (POO)
✔️ Interfaces e contratos
✔️ Polimorfismo
✔️ Separação de responsabilidades
✔️ Modelagem UML
✔️ Princípios SOLID (ISP)
📈 Evoluções Futuras
Implementar múltiplos dispositivos (ex: AndroidPhone)
Introduzir estado interno (música atual, chamadas, abas)
Adicionar testes unitários com JUnit
Aplicar logging (SLF4J)
Evoluir para arquitetura com Spring Boot
🎯 Diferenciais
Código limpo e organizado
Separação clara de responsabilidades
Modelagem alinhada com boas práticas de mercado
Estrutura preparada para evolução
