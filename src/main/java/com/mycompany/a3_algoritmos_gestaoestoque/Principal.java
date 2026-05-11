package com.mycompany.a3_algoritmos_gestaoestoque;

import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.menuPrincipal;
import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.nomes;
import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.precos;
import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.quantidades;
import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.totalProdutos;
import static com.mycompany.a3_algoritmos_gestaoestoque.Biblioteca.unidades;

public class Principal {

    public static void main(String[] args) {
        menuPrincipal();

        String [][] tabela = new String [100][4];
        for (int i = 0; i < totalProdutos; i++) {
            tabela[i][0] = nomes[i];
            tabela[i][1] = Double.toString(precos[i]);
            tabela[i][2] = unidades[i];
            tabela[i][3] = Integer.toString(quantidades[i]);
            
            System.out.println(tabela[i][0]);
            System.out.println(tabela[i][1]);
            System.out.println(tabela[i][2]);
            System.out.println(tabela[i][3]);
        }
        
        
    }

}
