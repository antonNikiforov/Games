package mineSweeper;

public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    BOMBED,
    CLOSED,
    OPENED,
    FLAGED,
    NOBOMB,
    INFORM,
    ICON;

    public Object image;

    Box getNextNumberBox(){
        return Box.values()[this.ordinal()+1];
    }

    int getNumber(){
        return this.ordinal();
    }
}
