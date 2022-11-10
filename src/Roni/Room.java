package Roni;

public class Room {
    private int roomNum;
    private int roomType;
    private int nightsReserved;

    public Room(int roomNum, int roomType, int nightsReserved) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.nightsReserved = nightsReserved;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public void setNightsReserved(int nightsReserved) {
        this.nightsReserved = nightsReserved;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getRoomType() {
        return roomType;
    }

    public int getNightsReserved() {
        return nightsReserved;
    }

    public int income() {
        return this.getRoomType() * 50 * this.getNightsReserved();
    }


}

class Hostel {
    Room[] allRooms = new Room[200];

    public int orderRoom(int type, int nights) {
        int i = 0;
        while (type != allRooms[i].getRoomType() && allRooms[i].getNightsReserved() > 0) {
            i++;
        }
        if (i > allRooms.length) return -1;
        allRooms[i].setNightsReserved(nights);
        return i;
    }

    public int[] floorIncome() {
        int[] arr = new int[3];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int j = 0; j < allRooms.length; j++) {
            if (j < 67) sum1 += allRooms[j].getRoomType() * 50;
            else if (j < 133) sum2 += allRooms[j].getRoomType() * 50;
            else sum3 += allRooms[j].getRoomType() * 50;
        }
        arr[0] = sum1;
        arr[1] = sum2;
        arr[2] = sum3;

        return arr;
    }
}
