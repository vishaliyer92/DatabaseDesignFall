DROP DATABASE Library;
CREATE DATABASE Library;
USE Library;

CREATE TABLE BOOK (
	Book_Id varchar(10) not null,
	Title varchar(500) not null,
	CONSTRAINT pk_Book primary key (Book_Id)
);

CREATE TABLE BOOK_AUTHORS (
	Book_Id varchar(10) not null,
	Author_name varchar(500) not null,
	Type int(1),
	CONSTRAINT pk_book_author primary key (Book_id, Author_name),
	CONSTRAINT fk_book_author foreign key (Book_id) references BOOK(Book_Id)
);

CREATE TABLE BORROWER (
	Card_no int not null AUTO_INCREMENT,
	Fname varchar(100),
	Lname varchar(100),
	Address varchar(100),
	City varchar(50),
	State varchar(50),
	Phone varchar(20),
	CONSTRAINT pk_borrower primary key (Card_no),
	CONSTRAINT uk_bowwower UNIQUE (Fname,Lname,Address)
);
ALTER TABLE BORROWER AUTO_INCREMENT=9001;

CREATE TABLE LIBRARY_BRANCH (
	Branch_Id varchar(70) not null,
	Branch_Name varchar(100) not null,
	Address varchar(500) not null,
	CONSTRAINT pk_lib_branch primary key (Branch_Id),
	CONSTRAINT uk_lib_branch UNIQUE (Branch_Name)
);

CREATE TABLE BOOK_COPIES (
	Book_Id varchar(70) not null,
	Branch_Id varchar(70) not null,
	No_of_Copies int not null,
	No_of_Available_Copies int(10),
	CONSTRAINT pk_book_copies primary key (Book_Id, Branch_Id),
	CONSTRAINT fk_book_id foreign key (Book_Id) references BOOK(Book_Id),
	CONSTRAINT fk_branch_id foreign key (Branch_Id) references LIBRARY_BRANCH(Branch_Id)
);

CREATE TABLE BOOK_LOANS (
	Loan_Id int not null AUTO_INCREMENT,
	Book_Id varchar(70) not null,
	Branch_Id varchar(70) not null,
	Card_no int not null,
	Date_out date,
	Due_date date not null,
	Date_in date default null,
	CONSTRAINT pk_book_loans primary key (Loan_Id),
	CONSTRAINT fk_book_id_tbl foreign key (Book_Id) references BOOK(Book_Id),
	CONSTRAINT fk_branch_id_tbl foreign key (Branch_Id) references LIBRARY_BRANCH(Branch_Id),
	CONSTRAINT fk_card_no foreign key (Card_no) references BORROWER(Card_no)
);
ALTER TABLE BOOK_LOANS AUTO_INCREMENT=1;

CREATE TABLE FINES (
	Loan_id int(70) not null,
	Fine_Amt decimal(10,2),
	Paid bool,
	CONSTRAINT pk_Loans primary key (Loan_id),
	CONSTRAINT fk_Loans foreign key (Loan_id) references BOOK_LOANS(Loan_id)
);

LOAD DATA INFILE 'book.txt' INTO TABLE book IGNORE 1 LINES;

commit;

LOAD DATA INFILE 'book_authors.txt' INTO TABLE book_authors IGNORE 1 LINES;

commit;

LOAD DATA INFILE 'library_branch.txt' INTO TABLE library_branch IGNORE 1 LINES;
	
commit;

LOAD DATA INFILE 'book_copies.txt' INTO TABLE book_copies IGNORE 1 LINES;

commit;

LOAD DATA INFILE 'borrower1.txt' INTO TABLE borrower IGNORE 1 LINES;

commit;

update book_copies set No_of_Available_Copies=No_of_Copies;

commit;

DELIMITER $$
CREATE TRIGGER AV AFTER INSERT ON LIBRARY.BOOK_LOANS
FOR EACH ROW
BEGIN
IF NEW.DATE_IN = '9999-12-31'
THEN
UPDATE LIBRARY.BOOK_COPIES SET No_of_Available_Copies=No_of_Available_Copies-1 WHERE BOOK_ID=NEW.BOOK_ID AND BRANCH_ID=NEW.BRANCH_ID;
INSERT INTO LIBRARY.FINES(LOAN_ID,FINE_AMT,PAID) VALUES(NEW.LOAN_ID,'0.00','0');
ELSE
INSERT INTO LIBRARY.FINES(LOAN_ID,FINE_AMT,PAID) VALUES(NEW.LOAN_ID,'0.00','1');
END IF;
END$$
DELIMITER ;

commit;

DELIMITER $$
CREATE TRIGGER AV_AFT AFTER UPDATE ON LIBRARY.BOOK_LOANS
FOR EACH ROW
BEGIN
IF OLD.DATE_IN = '9999-12-31'
THEN
UPDATE LIBRARY.BOOK_COPIES SET No_of_Available_Copies=No_of_Available_Copies+1 WHERE BOOK_ID=NEW.BOOK_ID AND BRANCH_ID=NEW.BRANCH_ID;
END IF;
END$$
DELIMITER ;

commit;
