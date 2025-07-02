-- SELECT * FROM Error_Log ORDER BY LogTime DESC;
-- BEGIN
--     SafeTransferFunds(p_from_acct => 1, p_to_acct => 2, p_amount => 3000);
-- END;

-- SELECT * FROM Error_Log ORDER BY LogTime DESC;


-- BEGIN
--     SafeTransferFunds(p_from_acct => 1, p_to_acct => 2, p_amount => 50);
-- END;

-- SELECT AccountID, Balance FROM Accounts WHERE AccountID IN (1, 2);

-- BEGIN
--     UpdateSalary(4, 10);  
-- END;
-- SELECT * FROM Error_Log ORDER BY LogTime DESC;

--    BEGIN 
    --   updateSalary(1 , )

--   SELECT * from Employees; 

--  BEGIN
--     UpdateSalary(1, 20 );  
-- END; 
--  SELECT * from Employees;

-- BEGIN
--     AddNewCustomer(3, 'Divyanshu', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 2500);
-- END;
--   SELECT * FROM Error_Log ORDER BY LogTime DESC;
   
 BEGIN
    AddNewCustomer(6, 'JOHn Due', TO_DATE('1991-02-01', 'YYYY-MM-DD'), 2500);
END;

   Select * from CUSTOMERS where CUSTOMERID = 6 ; 