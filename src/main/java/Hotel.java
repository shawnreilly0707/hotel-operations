public class Hotel {
    private String name;
    private int numOfSuites;
    private int numOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name,
                 int numOfSuites,
                 int numOfRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
    }

    public Hotel(String name,
                 int numOfSuites,
                 int numOfRooms,
                 int bookedSuites,
                 int bookedBasicRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfSuites() {
        return this.numOfSuites;
    }

    public int getNumOfRooms() {
        return this.numOfRooms;
    }

    public int getBookedSuites() {
        return this.bookedSuites;
    }

    public int getBookedBasicRooms() {
        return this.bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return this.numOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numOfRooms - this.bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                this.bookedSuites += roomCount;
                return true;
            }
            else {
                if (roomCount <= getAvailableRooms()) {
                    this.bookedBasicRooms += roomCount;
                    return true;
                }
            }
        }
        return false;
    }
}
