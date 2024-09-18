class MovieTicket {
    // Instance variables
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    // Constructor
    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
        setCostPerTicketBasedOnMovieId();
    }

    // Method to set cost per ticket based on movieId
    private void setCostPerTicketBasedOnMovieId() {
        switch (movieId) {
            case 111:
                this.costPerTicket = 7.0;
                break;
            case 112:
                this.costPerTicket = 8.0;
                break;
            case 113:
                this.costPerTicket = 8.5;
                break;
           
            default:
                this.costPerTicket = 0.0; // Invalid movieId
                break;
        }
    }

    // Method to calculate total amount
    public double calculateTotalAmount() {
        if (costPerTicket == 0.0 || noOfSeats <= 0) {
            return 0.0;
        }
        double totalAmount = noOfSeats * costPerTicket;
        double tax = totalAmount * 0.02;
        totalAmount += tax;
        return Math.round(totalAmount);
    }

    // Getter and setter methods
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
        setCostPerTicketBasedOnMovieId();
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
}

class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(114, 6);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}


/*
Output:-
  Sorry! Please enter valid movie Id and number of seats
  */
