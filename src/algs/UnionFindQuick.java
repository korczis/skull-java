package algs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomaskorcak
 */
public class UnionFindQuick 
{
    private int[] ids;
    
    public UnionFindQuick(int N)
    {
        ids = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            ids[i] = i;
        }
    }
    
    public void union(int p, int q)
    {
        int pid = root(p);
        int qid = root(q);
        
        ids[pid] = qid;
    }
    
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }
    
    public int root(int p)
    {
        int res = p;
        while(ids[res] != res)
        {
            res = ids[res];
        }
        
        return res;
    }
}
