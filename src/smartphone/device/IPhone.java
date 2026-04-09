package smartphone.device;

import smartphone.navegador.NavegadorInternet;
import smartphone.reprodutor.ReprodutorMusical;
import smartphone.telefone.AparelhoTelefonico;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número (%s)".formatted(numero));
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void parar() {
        System.out.println("Música encerrada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música "+ musica +" selecionada.");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Página "+ url +" exibida.");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
}
