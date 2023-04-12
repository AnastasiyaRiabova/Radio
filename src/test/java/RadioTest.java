import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    int amountStations;


    @Test
    public void AverageStationTest() { // среднее значение
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStationTest() { // максимальное значение
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStationTest() { // минимальное значение
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestStation1() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestStation2() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestStation3() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestStation4() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageVolumeTest() { // среднее значение
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(49);

        int expected = 49;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSVolumeTest() { // максимальное значение
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeTest() { // минимальное значение
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestVolume1() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestVolume2() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestVolume3() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(99);

        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scopeTestVolume4() { // граничные значения
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest1() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest2() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest3() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest4() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest5() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest6() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest7() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(2);
        radio.next();

        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest8() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest9() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextTest10() { // переключение станций вперед
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevTest1() { // переключение станций назад
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevTest2() { // переключение станций назад
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevTest3() { // переключение станций назад
        Radio radio = new Radio(amountStations = 10);

        radio.setCurrentRadioStationNumber(2);
        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest1() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(80);
        radio.more();

        int expected = 81;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest2() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(0);
        radio.more();

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest3() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(1);
        radio.more();

        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest4() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(2);
        radio.more();

        int expected = 3;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest5() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(43);
        radio.more();

        int expected = 44;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest6() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(30);
        radio.more();

        int expected = 31;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest7() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(50);
        radio.more();

        int expected = 51;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest8() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(75);
        radio.more();

        int expected = 76;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest9() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(37);
        radio.more();

        int expected = 38;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest10() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(100);
        radio.more();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreTest11() { // переключение громкости вверх
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(101);
        radio.more();

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessTest1() { // переключение громкости вниз
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(90);
        radio.less();

        int expected = 89;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessTest2() { // переключение громкости вниз
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(0);
        radio.less();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessTest3() { // переключение громкости вниз
        Radio radio = new Radio(amountStations = 10);

        radio.setSoundVolume(1);
        radio.less();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
}


