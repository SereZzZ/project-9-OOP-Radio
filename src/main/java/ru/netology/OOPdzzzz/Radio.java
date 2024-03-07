package ru.netology.OOPdzzzz;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int size){
        maxStation = minStation + size - 1;
    }

    public Radio(){ // конструктор для значений по умолчанию
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume(){
        return minVolume;
    }

    public int getMaxVolume(){
        return maxVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void prev() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }



    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void reduceVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

}
