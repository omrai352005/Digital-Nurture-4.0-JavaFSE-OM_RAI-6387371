create or replace Function HasSufficientBalance1 (
    form_ac In number ,
    amount IN number
)
RETURN BOOLEAN
IS 

    v_balance NUMBER ; 

Begin 

    select Balance into v_balance 
    from Accounts 
    where AccountID = form_ac ; 

    return v_balance >= amount; 

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;

end ; 