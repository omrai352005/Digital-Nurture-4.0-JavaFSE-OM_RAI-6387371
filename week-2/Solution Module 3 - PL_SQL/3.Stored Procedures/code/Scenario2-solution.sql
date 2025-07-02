CREATE or REPLACE PROCEDURE UpdateEmployeeBonus(
  P_Department IN varchar , 
  P_Bonus_per IN Number
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * P_Bonus_per / 100)
    WHERE Department = P_Department;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department: ' || P_Department);
    ELSE
        DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' employee(s) updated.');
    END IF;

    COMMIT;
END;