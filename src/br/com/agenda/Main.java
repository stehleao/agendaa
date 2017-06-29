/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda;

import br.com.agenda.ContatoDao.ContatoDao;
import br.com.agenda.modelo.Contato;

/**
 *
 * @author stehleao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContatoDao contatoDao = new ContatoDao();
        
        Contato contato = new Contato();
        
        
        contato.setNome("Stephanie");
        contato.setFone("5787554540383");
        
        
        contatoDao.persist(contato);
    }
    
}
