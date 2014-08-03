/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algs;

/**
 *
 * @author tomaskorcak
 */
public class Algs {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UnionFind uf = new UnionFind(10);
        
        // UnionFindQuick uf = new UnionFindQuick(10);
        
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(3, 4);
        uf.union(4, 5);
        
        // uf.vytiskniKrabicky();
        
        int testBod1 = 0;
        int testBod2 = 4;
        boolean spojeno = uf.connected(testBod1, testBod2);
        
        System.out.format("connected(%d, %d) = %b\n", testBod1, testBod2, spojeno);
    } 
}
