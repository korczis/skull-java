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
public class UnionFind 
{
    private int[] ids;
    
    public UnionFind(int N)
    {
        ids = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            
            ids[i] = i;
        }
    }
    
    public boolean connected(int p, int q)
    {
        return ids[p] == ids[q];
    }
    
    public void union(int p, int q)
    {
        int pid = ids[p];
        int qid = ids[q];
        
        for(int i = 0; i < ids.length; i++)
        {
            if(ids[i] == pid)
            {
                ids[i] = qid;
            }
        }
    }
    
    public void vytiskniKrabicky()
    {
        for(int i = 0; i < ids.length; i++) 
        {
            System.out.format("%d ", i);
        }
        System.out.format("\n");
        
        for(int i = 0; i < ids.length; i++) 
        {
            System.out.format("%d ", ids[i]);
        }
        System.out.format("\n");
    }
}
