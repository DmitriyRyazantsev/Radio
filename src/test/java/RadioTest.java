import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void stationtest() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationtest1() {
        Radio radio = new Radio();

        radio.setCurrentStation(30);

        int expected = 30;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationtest2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationtest3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationtest4() {
        Radio radio = new Radio();

        radio.setCurrentStation(33);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.nextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(30);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 30;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);

        int expected = 45;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(70);

        int expected = 70;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(120);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);

        radio.increaseVolume();

        int expected = 36;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(44);

        radio.downVolume();

        int expected = 43;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.downVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.downVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.downVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}