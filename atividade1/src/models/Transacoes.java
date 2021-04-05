package models;

import java.util.Random;

import controls.Seguranca;

public class Transacoes {

    private static int getnumQRcode() {
        Random r = new Random();
        return r.nextInt(9999 - 1000) + 1000;
    
    }

    public String GeradorQRcode(Usuario usuario, double valor, Seguranca seg){
        int numTransacao = getnumQRcode();
        return seg.getContaUsuario(usuario.getId()).getId() + "; " + usuario.getNome() + "; " + valor + "; " + numTransacao;
    }

    public void pagamentoQRcode(Usuario remetente, Usuario destinatario, String QRcode, Seguranca seg){
        String[] array = new String[4];
        array = QRcode.split(";");
        double valor = Double.parseDouble(array[2]);

        if (seg.getContaUsuario(remetente.getId()).sacar(valor)){
            seg.getContaUsuario(destinatario.getId()).depositar(valor);
            System.out.println("Transação realizada com sucesso!");
        } 
        
        else System.out.println("Transação não realizada por falta de saldo");

    }

}


