package controls;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

import models.Contas;
import models.Usuario;

public class Seguranca {

    public Seguranca(){ // Classe feita para garantir a separação da manipulação de dados de qualquer parte da "interface", salve a recuperação de dados da sessão
        // instanciando as listas de objetos da sessão
        Sessao.usuarios = new ArrayList<Usuario>();
        Sessao.contas = new ArrayList<Contas>();
        Sessao.usuarioLogado = new Usuario(); // informação ainda não usada, eu li o documento vi que tinha senha pensei que ia usar... mas vou deixar aqui já pro futuro
    }

    // método usado para criar o usuário e já vincula-lo a uma conta 
    public void adicionarUsuario(String nome, String email, String senha, double saldo){
        int id = Sessao.usuarios.size()+1;
        Sessao.usuarios.add(new Usuario(id, nome, email, textToMD5(senha)));
        Sessao.contas.add(new Contas(Sessao.contas.size(), saldo, id));
    }

    // método que, a partir do id do usuário, retorna a sua respectiva conta (se for ficar muito complexa a aplicação mudar pra retornar lista de contas)
    public Contas getContaUsuario(int idUsu){
        for (Contas c : Sessao.contas) {
            if (c.getIdUsuario() == idUsu) {
                return c;
            }
        }
        return new Contas();
    }

    // método que codifica uma string qualquer para um MD5 hash, usado para proteger a senha
    // LEMBRETE: esse tipo de codificação está sendo usada SOMENTE PARA FINS EDUCACIONAIS, não coloque isso como proteção séria para nada.
    public String textToMD5(String s) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(),0,s.length());
            return new BigInteger(1,m.digest()).toString(16);
        } catch (Exception e) {
            // se der falha por algum motivo... só n faz
            return s;
        }
    }
}
