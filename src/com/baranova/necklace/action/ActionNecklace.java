package com.baranova.necklace.action;


import com.baranova.necklace.entity.Necklace;
import com.baranova.necklace.entity.Stone;

import java.util.*;

public class ActionNecklace {

    public static double commonWeight(Necklace necklace){

        Set<Stone> stoneSet=necklace.getComposition();
        double weight=0;
        for(Stone stone:stoneSet){
            weight=weight+stone.getWeight();
        }
        return weight;
    }

    public static int commonCost(Necklace necklace){

        Set<Stone> stoneSet=necklace.getComposition();
        int cost=0;
        for(Stone stone:stoneSet){
            cost=cost+stone.getCost();
        }
        return cost;
    }

    public static Set<Stone> checkingTransparency(Necklace necklace, double startTransp, double endTransp){

        Set<Stone> stoneSet=new HashSet<>();
        for(Stone stone:necklace.getComposition()){
            double transp=stone.getTransparency();
            if ((transp>=startTransp)&&(transp<=endTransp)){
            stoneSet.add(stone);
            }
        }
        return stoneSet;
    }

    public static List<Stone> sortingNecklace(Set<Stone> necklaceStone){
        List<Stone> sortednecklace=new ArrayList<>(necklaceStone);
        Comparator<Stone> comparator=new Comparator<Stone>() {
            @Override
            public int compare(Stone one, Stone two) {
                return Integer.compare(one.getCost(),two.getCost());
            }
        };
        Collections.sort(sortednecklace,comparator);
        return sortednecklace;
    }
}
