package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;
import org.hibernate.type.TrueFalseType;

import javax.persistence.*;

@Entity
public class UserLoanHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @ManyToOne
    private User user;
    private String bookName;
    private boolean isReturn;

    public UserLoanHistory(User user, String bookName) {
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;
    }

    protected UserLoanHistory() {
    }

    public void doTurn() {
        this.isReturn = true;
    }

    public String getBookName() {
        return this.bookName;
    }
}
