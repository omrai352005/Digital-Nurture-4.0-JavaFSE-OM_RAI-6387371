create or replace Function HasSufficientBalance (
    form_acc In number ,
    amount IN number
)
RETURN BOOLEAN
IS 

    v_balance NUMBER ; 

Begin 

    select Balance into v_balance 
    from Accounts 
    where AccountID = form_acc ; 

    return v_balance >= amount; 

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;

end ; 