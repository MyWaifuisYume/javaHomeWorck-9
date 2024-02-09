public class Radio {

    private int numberCurrentRadioStation;
    private int soundVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (numberCurrentRadioStation != maxStation) {
            numberCurrentRadioStation++;
        } else {
            numberCurrentRadioStation = 0;
        }
    }

    public void prev() {
        if (numberCurrentRadioStation != 0) {
            numberCurrentRadioStation--;
        } else {
            numberCurrentRadioStation = maxStation;
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
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation < 0) {
            return;
        }
        if (numberCurrentRadioStation > maxStation) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }
}
