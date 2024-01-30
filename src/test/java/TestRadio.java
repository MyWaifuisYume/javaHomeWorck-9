import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldNumberCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberCurrentRadioStationBelowLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNumberCurrentRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextOverLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevBelowLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeBelowLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(-4);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(150);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(40);

        int expected = 40;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUp() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);
        radio.up();

        int expected = 51;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpOverLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);
        radio.up();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDown() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);
        radio.down();

        int expected = 49;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownBeloWLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.down();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }




}
