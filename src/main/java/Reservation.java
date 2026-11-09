public class Reservation {
    private String roomType;
    private float price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType,
                       float price,
                       int numberOfNights,
                       boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public String setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("king")) {
            this.price = 134.00f;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124.00f;
        }

        return this.roomType;
    }

    public float getPrice() {
        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public int setNumberOfNights(int numberOfNights) {
        return this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public boolean setWeekend(boolean weekend) {
        return this.weekend = weekend;
    }

    public float getReservationTotal() {
        float reservationTotal = this.price * numberOfNights;

        if (isWeekend()) {
            reservationTotal *= 1.10f;
        }

        return reservationTotal;

    }
}
