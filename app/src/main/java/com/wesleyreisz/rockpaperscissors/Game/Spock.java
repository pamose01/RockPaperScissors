package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Frosty on 9/27/2015.
 */
public class Spock implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnRock:
            case R.id.btnScissors:
                return GameUtils.BEATS;

            case R.id.btnPaper:
            case R.id.btnLizard:
                return GameUtils.LOSES_TO;
            default:
                return GameUtils.TIES;

        }
    }
}
