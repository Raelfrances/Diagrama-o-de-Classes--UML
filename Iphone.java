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
