CREATE or REPLACE PROCEDURE CalculateAge (
    cuss_id IN varchar ,
    age OUT Number 
)is
v_dob DATE;
BEGIN
    select DOB into v_dob 
    from CUSTOMERS 
    where CUSTOMERID = cuss_id; 
    age := FLOOR(MONTHS_BETWEEN(SYSDATE, v_dob)/12);



end;
