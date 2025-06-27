DECLARE

age NUMBER;

BEGIN
    CalculateAge(1 , age);
    DBMS_OUTPUT.PUT_LINE('Customer with customer id 1 is '  || age || 'year old ');
end ; 
-- select * from CUSTOMERS