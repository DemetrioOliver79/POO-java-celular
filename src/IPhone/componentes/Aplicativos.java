package IPhone.componentes;

import IPhone.Interfaces.AparelhoTelefonico;
import IPhone.Interfaces.Navegador;
import IPhone.Interfaces.RepodutorMusicial;

public class Aplicativos implements AparelhoTelefonico, Navegador, RepodutorMusicial {

    @Override
    public void ligar() {
        System.out.println("Discando");
    }

    @Override
    public void atender() {
        System.out.println("Ligacao atendida");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("site em exibicao");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("musica em curso");
    }

    @Override
    public void pausar() {
        System.out.println("pause");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("nova musica slecionada");
    }
    
}
