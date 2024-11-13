package models;
import java.sql.Date;
public class Loan {
        private int id;
        private int bookId;
        private int memberId;
        private Date loanDate;
        private Date returnDate;

        // Constructors
        public Loan() {
            // Default constructor
        }

        public Loan(int id, int bookId, int memberId, Date loanDate, Date returnDate) {
            this.id = id;
            this.bookId = bookId;
            this.memberId = memberId;
            this.loanDate = loanDate;
            this.returnDate = returnDate;
        }

        public Loan(int bookId, int memberId, Date loanDate, Date returnDate) {
            this.bookId = bookId;
            this.memberId = memberId;
            this.loanDate = loanDate;
            this.returnDate = returnDate;
        }

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public int getBookId() { return bookId; }
        public void setBookId(int bookId) { this.bookId = bookId; }

        public int getMemberId() { return memberId; }
        public void setMemberId(int memberId) { this.memberId = memberId; }

        public Date getLoanDate() { return loanDate; }
        public void setLoanDate(Date loanDate) { this.loanDate = loanDate; }

        public Date getReturnDate() { return returnDate; }
        public void setReturnDate(Date returnDate) { this.returnDate = returnDate; }

        // toString method for displaying loan details
        @Override
        public String toString() {
            return STR."Loan{id=\{id}, bookId=\{bookId}, memberId=\{memberId}, loanDate=\{loanDate}, returnDate=\{returnDate}}";
        }
    }
}
