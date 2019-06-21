/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisaaleatoriakk;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Random;

/**
 *
 * @author house
 */
public class CoisaAleatoriakk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cria a lista de inteiro okok
        List<Integer> list = new ArrayList<>();
        //adiciona os elemento na lista tlgd
        list.add(1);
        list.add(2);
        
        CoisaAleatoriakk obj = new CoisaAleatoriakk();
        
        //pega um elemneto aleatório e mostra com o sout
System.out.println(obj.getRandomElement(list));    }
    public int getrRandomElement(List<Integer> list)
            {
                Random rand = new Random();
                return list.get(rand.nextInt(list.size()));
            }

    
}
