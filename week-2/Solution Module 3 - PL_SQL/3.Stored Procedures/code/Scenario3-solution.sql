CREATE or REPLACE PROCEDURE TransferFunds (
    from_acc IN varchar ,
    to_acc IN varchar ,
    amount IN NUMBER
)IS
    v_balance NUMBER;
    v_error_msg VARCHAR2(4000);
BEGIN 
    select Balance Into v_balance 
    FROM ACCOUNTS
    where AccountID = from_acc ; 

    if(v_balance < amount) THEN 
     RAISE_APPLICATION_ERROR(-2001, 'insufficient balance');
    END if; 

    UPDATE Accounts 
    set Balance = Balance-amount , 
    LastModified = SYSDATE
    where AccountID = from_acc ; 


    UPDATE Accounts 
    set Balance = Balance+amount , 
    LastModified = SYSDATE
    where AccountID = to_acc ; 

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        v_error_msg := 'SafeTransferFunds Error: ' || SQLERRM; 
        INSERT INTO error_log (errormessage, logtime)
        VALUES (v_error_msg, SYSDATE);


END ; 