create or replace procedure CalculateMonthlyInstallment(
    loan_amt IN number ,
    int_rate IN number ,
    loan_dur IN Number , 
    M_amt OUT Number 
    )IS
    M_rate    NUMBER;
    T_months   NUMBER;
BEGIN
    -- Convert annual interest rate to monthly decimal rate
    M_rate := int_rate / (12 * 100);
    T_months:= loan_dur * 12;

    -- EMI Formula
    M_amt := ROUND(
        (loan_amt * M_rate * POWER(1 + M_rate, T_months)) /
        (POWER(1 + M_rate, T_months) - 1),
        2
    );
EXCEPTION
    WHEN ZERO_DIVIDE THEN
        M_amt := 0;
    WHEN OTHERS THEN
        M_amt := -1;
END;
/