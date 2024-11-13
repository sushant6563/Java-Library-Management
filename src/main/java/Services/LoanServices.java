package Services;

public class LoanServices {
import com.Services.dao.LoanDAO;
import com.Services.model.Loan;

import java.sql.SQLException;
import java.util.List;

    public class LoanService {
        private LoanDAO loanDAO;

        // Constructor
        public LoanService(LoanDAO loanDAO) {
            this.loanDAO = loanDAO;
        }

        // Add a new loan
        public void addLoan(Loan loan) throws SQLException {
            loanDAO.addLoan(loan);
        }

        // Get a loan by ID
        public Loan getLoanById(int id) throws SQLException {
            return loanDAO.getLoanById(id);
        }

        // Get all loans
        public List<Loan> getAllLoans() throws SQLException {
            return loanDAO.getAllLoans();
        }

        // Update a loan
        public void updateLoan(Loan loan) throws SQLException {
            loanDAO.updateLoan(loan);
        }

        // Delete a loan by ID
        public void deleteLoan(int id) throws SQLException {
            loanDAO.deleteLoan(id);
        }
    }

}
