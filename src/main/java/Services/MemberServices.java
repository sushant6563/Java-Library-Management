package Services;

import com.MemberServices.dao.MemberDAO;
import com.MemberServices.model.Member;

import java.sql.SQLException;
import java.util.List;

    public class MemberService {
        private final MemberDAO memberDAO;

        // Constructor
        public MemberService(MemberDAO memberDAO) {
            this.memberDAO = memberDAO;
        }

        // Add a new member
        public void addMember(Member member) throws SQLException {
            memberDAO.addMember(member);
        }

        // Get a member by ID
        public Member getMemberById(int id) throws SQLException {
            return memberDAO.getMemberById(id);
        }

        // Get all members
        public List<Member> getAllMembers() throws SQLException {
            return memberDAO.getAllMembers();
        }

        // Update a member
        public void updateMember(Member member) throws SQLException {
            memberDAO.updateMember(member);
        }

        // Delete a member by ID
        public void deleteMember(int id) throws SQLException {
            memberDAO.deleteMember(id);
        }
    }

}
