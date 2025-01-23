package com.gabriel.forca.services;

import com.gabriel.forca.forca.Forca;

public class ForcaServices {
    public boolean Win(Forca forca) {
        return forca.getDiscoveredLetters().indexOf("_") == -1;
    }

    public boolean Lose(Forca forca) {
        return forca.getLives() == 0;
    }

    public boolean verifyLetter(Forca forca, char letter) {
        letter = Character.toLowerCase(letter);
        if(forca.getWord().indexOf(letter) >= 0) {
            forca.revealLetter(letter);
            return true;
        } else {
            forca.decreaseLive();
            return false;
        }
    }
}
