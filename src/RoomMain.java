public class RoomMain {

    public static void main(String[] args) {
        printResult(getSquareOfRoom(getRoomData()));
    }

    public static Room getRoomData() {
        return new Room(GetInputs.getWidth(), GetInputs.getLength());
    }

    public static int getSquareOfRoom(Room myRoom) {
        return myRoom.getWidth() * myRoom.getLength();
    }

    public static void printResult(int result) {
        System.out.println("Room size is: " + result);
    }
}
