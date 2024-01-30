public class Radio {

    private int numberCurrentRadioStation;
    private int soundVolume;

    public void next() {
        if ( numberCurrentRadioStation != 9) {
            numberCurrentRadioStation++;
        } else {
            numberCurrentRadioStation = 0;
        }
    }

    public void prev() {
        if ( numberCurrentRadioStation != 0) {
            numberCurrentRadioStation--;
        } else {
            numberCurrentRadioStation = 9;
        }
    }

    public void up() {
        if (soundVolume != 100) {
            soundVolume++;
        } else {
            setSoundVolume(soundVolume);
        }
    }

    public void down() {
        if (soundVolume != 0) {
            soundVolume--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if ( soundVolume < 0) {
            return;
        }
        if ( soundVolume >100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if ( numberCurrentRadioStation < 0) {
            return;
        }
        if ( numberCurrentRadioStation > 9) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }
}
