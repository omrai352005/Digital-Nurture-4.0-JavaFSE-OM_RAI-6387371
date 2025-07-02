-- DECLARE

-- age NUMBER;

-- BEGIN
--     CalculateAge(1 , age);
--     DBMS_OUTPUT.PUT_LINE('Customer with customer id 1 is '  || age || 'year old ');
-- end ; 

-- Scenario 2 

-- DECLARE
--     v_loan_amount     NUMBER;
--     v_interest_rate   NUMBER;
--     v_duration_years  NUMBER;
--     v_emi             NUMBER;


-- BEGIN
--     DBMS_OUTPUT.PUT_LINE('LoanID | CustomerID | EMI');
--     DBMS_OUTPUT.PUT_LINE('-----------------------------');

--     FOR rec IN (
--         SELECT LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate
--         FROM Loans
--     ) LOOP
--         -- Calculate duration in years
--         v_duration_years := MONTHS_BETWEEN(rec.EndDate, rec.StartDate) / 12;

--         -- Call existing procedure to compute EMI
--         CalculateMonthlyInstallment(
--             rec.LoanAmount,
--             rec.InterestRate,
--             v_duration_years,
--             v_emi
--         );

--         -- Display result
--         DBMS_OUTPUT.PUT_LINE(rec.LoanID || '      | ' || rec.CustomerID || '         | ' || ROUND(v_emi, 2));
--     END LOOP;
-- END;
-- /

-- Scenario 3 

DECLARE
    result BOOLEAN;
BEGIN
    result := HasSufficientBalance1(1, 500);
    IF result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient Balance');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;

