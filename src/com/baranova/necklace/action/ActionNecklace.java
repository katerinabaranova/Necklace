package src.com.baranova.necklace.action;


import src.com.baranova.necklace.entity.Necklace;
import src.com.baranova.necklace.entity.Stone;

import java.util.*;

public class ActionNecklace {

    public static Set<Stone> addStone(String nameStone, ArrayList<Stone> stonesFile, Set<Stone> necklaceStone){

        for (Stone stone:stonesFile){
            if(stone.getName().equalsIgnoreCase(nameStone)){necklaceStone.add(stone);}
        }
        return necklaceStone;
    }

    public static double commonWeigth(Necklace necklace){

        Set<Stone> stoneSet=necklace.getComposition();
        double weight=0;
        for(Stone stone:stoneSet){
            weight=weight+stone.getWeight();
        }
        System.out.println("Вес в каратах: "+weight);
        return weight;
    }

    public static int commonCost(Necklace necklace){

        Set<Stone> stoneSet=necklace.getComposition();
        int cost=0;
        for(Stone stone:stoneSet){
            cost=cost+stone.getCost();
        }
        System.out.println("Общая стоимость: "+cost);
        return cost;
    }

    public static void checkingTransperancy(Necklace necklace,double startTransp, double endTransp){

        Set<Stone> stoneSet=necklace.getComposition();
        int cost=0;
        for(Stone stone:stoneSet){
            double transp=stone.getTransparency();
            if ((transp>=startTransp)&&(transp<=endTransp)){
                System.out.println(stone);
            }

        }
    }

    public static Set<Stone> sortingNecklace(Set<Stone> necklaceStone){
        List<Stone> sortednecklace=new ArrayList<Stone>(necklaceStone);
        Comparator<Stone> comparator=new Comparator<Stone>() {
            @Override
            public int compare(Stone one, Stone two) {
                return Integer.compare(one.getCost(),two.getCost());
            }
        };
        Collections.sort(sortednecklace,comparator);
        for(Stone stone:sortednecklace){
            System.out.println(stone);
        }
        Set <Stone> sorted=new HashSet<Stone>(sortednecklace);
        return sorted;
    }
}
