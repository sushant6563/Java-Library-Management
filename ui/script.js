document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');
    const manageBooksSection = document.getElementById('manageBooks');
    const manageMembersSection = document.getElementById('manageMembers');
    const addBookBtn = document.getElementById('addBookBtn');
    const addMemberBtn = document.getElementById('addMemberBtn');
    const addBookModal = document.getElementById('addBookModal');
    const addMemberModal = document.getElementById('addMemberModal');
    const addBookForm = document.getElementById('addBookForm');
    const addMemberForm = document.getElementById('addMemberForm');
    const booksTable = document.getElementById('booksTable').querySelector('tbody');
    const membersTable = document.getElementById('membersTable').querySelector('tbody');
    const closeBookModal = addBookModal.querySelector('.close');
    const closeMemberModal = addMemberModal.querySelector('.close');

    // Login functionality
    loginForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const userType = document.getElementById('userType').value;

        if (userType === 'admin') {
            alert('Welcome, Admin!');
            manageBooksSection.style.display = 'block';
            manageMembersSection.style.display = 'block';
        } else {
            alert('Access restricted to Admins only.');
        }
    });

    // Open Add Book Modal
    addBookBtn.addEventListener('click', () => {
        addBookModal.style.display = 'flex';
    });

    // Open Add Member Modal
    addMemberBtn.addEventListener('click', () => {
        addMemberModal.style.display = 'flex';
    });

    // Close Modals
    closeBookModal.addEventListener('click', () => {
        addBookModal.style.display = 'none';
    });

    closeMemberModal.addEventListener('click', () => {
        addMemberModal.style.display = 'none';
    });

    // Add Book
    addBookForm.addEventListener('submit', (e) => {
        e.preventDefault();

        const bookId = document.getElementById('bookId').value;
        const bookTitle = document.getElementById('bookTitle').value;
        const bookAuthor = document.getElementById('bookAuthor').value;

        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${bookId}</td>
            <td>${bookTitle}</td>
            <td>${bookAuthor}</td>
            <td><button onclick="deleteRow(this)">Delete</button></td>
        `;
        booksTable.appendChild(row);

        addBookModal.style.display = 'none';
        addBookForm.reset();
    });

    // Add Member
    addMemberForm.addEventListener('submit', (e) => {
        e.preventDefault();

        const memberId = document.getElementById('memberId').value;
        const memberName = document.getElementById('memberName').value;
        const memberEmail = document.getElementById('memberEmail').value;

        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${memberId}</td>
            <td>${memberName}</td>
            <td>${memberEmail}</td>
            <td><button onclick="deleteRow(this)">Delete</button></td>
        `;
        membersTable.appendChild(row);

        addMemberModal.style.display = 'none';
        addMemberForm.reset();
    });
});

// Delete Row Function
function deleteRow(btn) {
    const row = btn.closest('tr');
    row.remove();
}
