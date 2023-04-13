package gestform_project;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Gestform {

	public static void main(String[] args) {
		// initialization
		Random rand = new Random();
	    int nMin = -1000; // list minimum range
	    int nMax = 1000; // list maximum range
	    int nRange = (nMax - nMin) + 1;  
        Set<Integer>setRandom = new HashSet<Integer>();
        
        //Create random set
        while(setRandom.size() < nRange) 
        {
            int numberRandom = rand.nextInt((nMax - nMin) + 1) + nMin;
            setRandom.add(numberRandom);
        }
        //System.out.println(setRandom);
        
        /* check each number for:
         * si le nombre est divisible par 3 : on affiche Geste
         * si le nombre est divisible par 5 : on affiche Forme
         * si le nombre est divisible par 3 et par 5 : on affiche Gestform (d’où le nom du test)
         * si non : on affiche le nombre n*/ 
	    for (Integer n : setRandom)
            {
                boolean divBy5 = n % 5 == 0;
                boolean divBy3 = n % 3 == 0;
                switch ((divBy5 ? 2 : 0) + (divBy3 ? 1 : 0)) 
                {
                    case 1:
                        System.out.println("Geste");
                        break;
                    case 2:
                        System.out.println("Forme");
                        break;
                    case 3:
                        System.out.println("Gestform");
                        break;
                    default:
                        System.out.println(n);
                }
            }

	}

}
