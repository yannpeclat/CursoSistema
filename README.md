# 🎓 CursoSistema - Java

Sistema em Java para **cadastro e gerenciamento de cursos e alunos**, com foco em conceitos de Programação Orientada a Objetos e uso eficiente de coleções como `Set` para garantir unicidade de dados. Ideal para iniciantes praticarem estruturas fundamentais do Java.

---

## 🛠️ Funcionalidades

- ✅ Cadastro de múltiplos cursos com nomes personalizados
- ✅ Inclusão de alunos com ID único por curso
- ✅ Evita duplicidade de alunos nos cursos
- ✅ Impressão de alunos por curso
- ✅ Cálculo do total de alunos distintos entre todos os cursos

---

## 🚀 Tecnologias e conceitos utilizados

- 🔹 **Java 17+**
- 🔹 Programação Orientada a Objetos (POO)
- 🔹 Coleções Java (`Set`, `List`, `HashSet`)
- 🔹 Sobrescrita dos métodos `equals()` e `hashCode()`
- 🔹 Validação de entradas
- 🔹 Scanner (entrada interativa do usuário)
- 🔹 Organização por pacotes: `application` e `entities`

---

## 📁 Estrutura do projeto

CursoSistema-java/
├── src/
│ ├── application/
│ │ └── Program.java ← Classe principal
│ └── entities/
│ ├── Course.java ← Representa um curso com vários alunos
│ └── Student.java ← Representa um aluno com ID e nome
└── README.md

---

## 💻 Como executar

```bash
1. Clone o repositório:

git clone https://github.com/yannpeclat/CursoSistema-java.git

2. Compile os arquivos Java:

javac -d bin src/application/Program.java

3. java -cp bin application.Program
```

## 🌟 Futuras melhorias

- Salvar os dados em arquivos .txt ou .csv
- Integração com banco de dados
- Interface gráfica com JavaFX ou Swing
- Testes com JUnit
- Cadastro de professores e disciplinas vinculadas
- Separação por períodos acadêmicos ou turmas

## 📌 Acesse este projeto no GitHub

🔗 [https://github.com/yannpeclat/CursoSistema-java](https://github.com/yannpeclat/CursoSistema-java)

## 💬 English Summary

This Java project simulates a simple Course and Student Management System, where each course can have a unique list of students. The application ensures no duplicate IDs within a course, and calculates the total number of unique students across all courses using a HashSet. It is a beginner-friendly project to reinforce OOP concepts and Java collections.

## 💡 Sobre mim

Sou Yann Peclat, estudante de Ciência da Computação com foco em Backend com Java e Arquitetura de Software. Este projeto faz parte da minha jornada de estudos no curso [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/) - Nélio Alves e está aqui como parte do meu portfólio prático.

📬 Acompanhe meus projetos:
🔗 GitHub: [Yann Peclat](https://github.com/yannpeclat)

