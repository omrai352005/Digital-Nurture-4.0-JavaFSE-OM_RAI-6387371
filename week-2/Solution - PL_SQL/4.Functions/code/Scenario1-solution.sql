CREATE or REPLACE PROCEDURE CalculateAge (
    cuss_id IN varchar ,
    age OUT Number 
)is
v_dob DATE;
BEGIN
    select DOB into dob 
    from CUSTOMERS 
    where CUSTOMERID = cuss_id; 
    age := FLOOR(MONTHS_BETWEEN(SYSDATE, v_dob)/12);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN NULL;

end;
