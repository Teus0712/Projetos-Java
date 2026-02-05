package entities;

public class Cafeteira {

    private boolean ligada;
    private int nivelAgua;
    private int nivelPo;

    public Cafeteira() {
        ligada = false;
        nivelAgua = 0;
        nivelPo = 0;
    }

    public void ligar() {
        if (this.ligada) {
            System.out.println("Atenção: A máquina JÁ ESTÁ ligada.");
        } else {
            this.ligada = true;
            System.out.println("Ligando... Máquina ligada com sucesso!");
        }
    }

    public void desligar() {
        if (!this.ligada) {
            System.out.println("Atenção: A máquina JÁ ESTÁ desligada.");
        } else {
            this.ligada = false;
            System.out.println("Desligando... Máquina desligada!");
        }
    }

    public void abastecerAgua(int quantidade) {
        this.nivelAgua = Math.min(this.nivelAgua + quantidade, 1000);
    }

    public void abastecerPo(int quantidade) {
        this.nivelPo = Math.min(this.nivelPo + quantidade, 100);
        System.out.println("Pó abastecido com sucesso!");
    }

    public void fazerCafe() {
        if (!ligada) {
            System.out.println("Erro: Ligue a máquina primeiro.");
            return;
        }
        if (nivelAgua < 200) {
            System.out.println("Erro: Água insuficiente.");
            return;
        }
        if (nivelPo < 15) {
            System.out.println("Erro: Pó de café insuficiente.");
            return;
        }

        nivelAgua -= 200;
        nivelPo -= 15;
        System.out.println("Café pronto! Aproveite.");
    }

    public String toString() {
        return "Status da Cafeteira: "
                + (ligada ? "LIGADA" : "DESLIGADA")
                + " | Água: " + nivelAgua + "ml"
                + " | Pó: " + nivelPo + "g";
    }
}