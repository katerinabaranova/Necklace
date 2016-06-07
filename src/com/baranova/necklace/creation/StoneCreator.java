package com.baranova.necklace.creation;

import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.exception.NotValidStoneException;

public interface StoneCreator {

    Stone getStone(String[] param) throws NotValidStoneException;
}
