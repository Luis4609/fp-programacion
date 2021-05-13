delimiter //

drop function if exists lasabia.f_calculateDates //

create function lasabia.f_calculateDates(studentDateOfBirth date, fecha date)
returns date
deterministic
begin
-- Declarar variables necesarias para la funcion
    declare differenceMonth int;
    
    set differenceMonth = timestampdiff(month, studentDateOfBirht, fecha);
    -- Return de la function
    --  return abs(differenceMonth)
    return differenceMonth;

end //    
    