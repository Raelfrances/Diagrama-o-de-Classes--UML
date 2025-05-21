# Diagrama-o-de-Classes--UML
Este Projeto engloba o desenvolvimento do Diagrama de Classes UML para representar os papéis do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Em seguida, criarei as classes e interfaces correspondentes em Java.


# 📱 iPhone - Estrutura Orientada a Objetos

Este projeto implementa a estrutura de um **iPhone** utilizando **Programação Orientada a Objetos (POO)** em Java, com o objetivo de representar seus papéis como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**.

---

## 📌 Diagrama UML

```plaintext
                +----------------+
                |    iPhone      |
                +----------------+
                | - modelo       |
                | - armazenamento|
                +----------------+
                | + tocarMusica() |
                | + ligar()       |
                | + navegar()     |
                +----------------+
                  /      |      \
                 /       |       \
+----------------+  +----------------+  +----------------+
| ReprodutorMusical | | AparelhoTelefonico | | NavegadorInternet |
+----------------+  +----------------+  +----------------+
| + tocarMusica()  | | + ligar()          | | + navegar()  |
+----------------+  +----------------+  +----------------+


```
```plaintext
🔧 Estrutura do Código
📌 Interfaces
java
// Interface para reprodução musical
public interface ReprodutorMusical {
    void tocarMusica(String musica);
}

// Interface para funcionalidades telefônicas
public interface AparelhoTelefonico {
    void ligar(String numero);
}

// Interface para navegação na internet
public interface NavegadorInternet {
    void navegar(String url);
}
```
```plaintext
📌 Classe iPhone
java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando na URL: " + url);
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 13", 128);
        meuIphone.tocarMusica("Imagine - John Lennon");
        meuIphone.ligar("123456789");
        meuIphone.navegar("https://www.example.com");
    }
}
```

🎯 Explicação
As Interfaces definem os métodos esperados para cada funcionalidade do iPhone.

A classe iPhone implementa essas interfaces, garantindo a aplicação de todas as funcionalidades.

O método main instancia um iPhone e demonstra seu funcionamento.
