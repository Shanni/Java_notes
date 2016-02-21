/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package step1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author shanliu
 */
public class Step1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList
        ArrayList a=new ArrayList();
        a.add(3);
        a.add("hi");
        a.add(new String("hey"));
        System.out.println(a);
        System.out.println(a.size());
        
        //LinkedList
        LinkedList l=new LinkedList();
        System.out.println(l.size());
        
        //ListIterator
        List<Integer> l1=new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        ListIterator i=l1.listIterator();
        i.next();
        i.previous();
        
    }
    
}
